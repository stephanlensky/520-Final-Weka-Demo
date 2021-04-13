package edu.umass.wekademo.providers;

import edu.umass.wekademo.classifiers.Classifier;
import edu.umass.wekademo.exceptions.WekaException;
import weka.classifiers.Evaluation;

import java.util.Random;

public class EvaluationProvider {

    public Evaluation getCrossValidationEvaluation(Classifier classifier) {
        Evaluation eval = null;
        try {
            eval = new Evaluation(classifier.getData());
            eval.crossValidateModel(classifier.getClassifier(), classifier.getData(), 10, new Random(1));
        } catch (Exception e) {
            throw new WekaException(e);
        }
        return eval;
    }

}
