package edu.umass.wekademo;

import edu.umass.wekademo.presenters.EvaluationPresenter;
import org.codejargon.feather.Feather;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class WekaDemoTest {

    @Test
    public void testWekaDemo() {
        Feather feather = Feather.with();
        WekaDemo wekaDemo = feather.instance(WekaDemo.class);;
        wekaDemo.run();
    }

}
