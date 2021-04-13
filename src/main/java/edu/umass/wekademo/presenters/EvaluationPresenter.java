package edu.umass.wekademo.presenters;

import edu.umass.wekademo.classifiers.Classifier;
import weka.classifiers.Evaluation;

public class EvaluationPresenter {

    public void show(Classifier classifier, Evaluation evaluation) {
        System.out.println(String.format("==== %s ====", classifier.getName()));
        System.out.println(String.format("Total correct: %d/%d",
                (int) evaluation.correct(),
                classifier.getData().size()));
        System.out.println(String.format("Percentage correct: %.2f%%", evaluation.pctCorrect()));
        System.out.println();
    }

}
