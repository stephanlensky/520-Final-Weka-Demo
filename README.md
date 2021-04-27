### Team Chronic Señoritos
# UMass COMPSCI 520 Final - Weka Demo App

This repository contains the code for our team's example Java implementation of a basic machine learning workflow. The purpose of the code in this example is to determine whether or not a patient has heart disease based on a number of common indicators (see [here](https://www.kaggle.com/ronitf/heart-disease-uci)). The project leverages [Weka](https://www.cs.waikato.ac.nz/ml/weka/) to create and train the model, and attempts to follow the same software design patterns and best practices that might be found in a much larger Java ML project.

## Usage

This project is built using Gradle. To run the project and show the accuracy results for the test data, simply import it into your favorite IDE as a Gradle project and execute the `run` task. This will build and train a decision tree model, then print cross validation results to the terminal. This should result in output similar to the following:

```
> Task :run
==== J48 Decision Tree Classifier ====
Total correct: 236/303
Percentage correct: 77.89%
```
