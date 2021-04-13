package edu.umass.wekademo;

import org.codejargon.feather.Feather;

public class WekaDemoApp {

    public static void main(String[] args) {
        Feather feather = Feather.with();
        WekaDemo wekaDemo =feather.instance(WekaDemo.class);;
        wekaDemo.run();
    }

}