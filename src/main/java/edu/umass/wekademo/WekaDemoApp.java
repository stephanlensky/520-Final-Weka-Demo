package edu.umass.wekademo;

import org.codejargon.feather.Feather;

/**
 * Main class to start the Weka demo
 */
public class WekaDemoApp {

    public static void main(String[] args) {
        Feather feather = Feather.with();
        WekaDemo wekaDemo = feather.instance(WekaDemo.class);;
        wekaDemo.run();
    }

}