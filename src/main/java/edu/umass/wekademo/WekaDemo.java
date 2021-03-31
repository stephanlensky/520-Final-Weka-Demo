package edu.umass.wekademo;

import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

import java.util.Random;

public class WekaDemo {

    public static void main(String[] args) throws Exception {
        // code from
        // https://waikato.github.io/weka-wiki/use_weka_in_your_java_code/

        // I encountered a weka bug using csv files, so I converted the dataset to arff
        DataSource source = new DataSource("heart.arff");
        Instances data = source.getDataSet();
        data.setClassIndex(data.numAttributes() - 1);

        String[] options = new String[1];
        options[0] = "-U";            // unpruned tree
        J48 tree = new J48();         // new instance of tree
        tree.setOptions(options);     // set the options

        // call to buildClassifier() is apparently not necessary when using Evaluation, since Evaluation handles training
//        tree.buildClassifier(data);   // build classifier

        Evaluation eval = new Evaluation(data);
        eval.crossValidateModel(tree, data, 10, new Random(1));
        System.out.println(eval.correct());
        System.out.println(eval.pctCorrect());
    }

}