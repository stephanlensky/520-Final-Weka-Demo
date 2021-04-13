package edu.umass.wekademo;

import edu.umass.wekademo.classifiers.Classifier;
import edu.umass.wekademo.classifiers.TreeClassifier;
import edu.umass.wekademo.presenters.EvaluationPresenter;
import edu.umass.wekademo.providers.DataProvider;
import edu.umass.wekademo.providers.EvaluationProvider;
import weka.classifiers.Evaluation;
import weka.core.Instances;

import javax.inject.Inject;

public class WekaDemo {

    private final DataProvider dataProvider;
    private final EvaluationProvider evaluationProvider;
    private final EvaluationPresenter evaluationPresenter;

    @Inject
    public WekaDemo(DataProvider dataProvider, EvaluationProvider evaluationProvider,
                    EvaluationPresenter evaluationPresenter) {
        this.dataProvider = dataProvider;
        this.evaluationProvider = evaluationProvider;
        this.evaluationPresenter = evaluationPresenter;
    }

    public void run() {
        Instances data = dataProvider.getDataSetFrom("heart.arff");
        Classifier[] classifiers = {
                new TreeClassifier(data)
        };

        for (Classifier classifier : classifiers) {
            Evaluation evaluation = evaluationProvider.getCrossValidationEvaluation(classifier);
            evaluationPresenter.show(classifier, evaluation);
        }
    }

}