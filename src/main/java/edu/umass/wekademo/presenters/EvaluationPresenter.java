package edu.umass.wekademo.presenters;

import edu.umass.wekademo.classifiers.Classifier;
import weka.classifiers.Evaluation;

import java.util.Arrays;

/**
 * Handles outputting the evaluation results for a given classifier to the terminal
 * (in this case the terminal is the "view")
 */
public class EvaluationPresenter {

    public void show(Classifier classifier, Evaluation evaluation) {
        System.out.println(String.format("==== %s ====", classifier.getName()));
        System.out.println(String.format("Total correct: %d/%d",
                (int) evaluation.correct(),
                classifier.getData().size()));
        System.out.println(String.format("Percentage correct: %.2f%%", evaluation.pctCorrect()));

        double[][] confusionMatrix = evaluation.confusionMatrix();
        System.out.println(String.format("\nConfusion matrix:\n"
                + "             Predicted NO  Predicted YES\n"
                + " Actual NO   %d            %d\n"
                + " Actual YES  %d            %d",
                (int) confusionMatrix[0][0], (int) confusionMatrix[0][1],
                (int) confusionMatrix[1][0], (int) confusionMatrix[1][1]));
        System.out.println();
    }

}
