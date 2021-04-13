package edu.umass.wekademo.classifiers;

import edu.umass.wekademo.exceptions.WekaException;
import weka.classifiers.trees.J48;
import weka.core.Instances;

public class TreeClassifier extends Classifier {
    private static final String NAME = "J48 Decision Tree Classifier";
    private final J48 tree;

    public TreeClassifier(Instances data) {
        this(data, false);
    }

    public TreeClassifier(Instances data, boolean buildClassifier) {
        super(data);
        String[] options = new String[1];
        options[0] = "-U";            // unpruned tree
        tree = new J48();             // new instance of tree
        try {
            tree.setOptions(options);     // set the options
            if (buildClassifier) {
                tree.buildClassifier(data);   // build classifier
            }
        } catch (Exception e) {
            throw new WekaException(e);
        }
    }

    @Override
    public J48 getClassifier() {
        return tree;
    }

    @Override
    public String getName() {
        return NAME;
    }

}
