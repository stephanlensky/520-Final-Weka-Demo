package edu.umass.wekademo.classifiers;

import weka.classifiers.AbstractClassifier;
import weka.core.Instances;

/**
 * Parent class for Weka classifier implementations. Provides a safe API
 * to interact directly with Weka.
 */
public abstract class Classifier {

    private final Instances data;

    public Classifier(Instances data) {
        this.data = data;
    }

    public Instances getData() {
        return data;
    }

    public abstract AbstractClassifier getClassifier();

    public abstract String getName();

}
