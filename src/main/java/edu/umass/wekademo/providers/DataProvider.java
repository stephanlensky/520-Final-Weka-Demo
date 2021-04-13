package edu.umass.wekademo.providers;

import edu.umass.wekademo.exceptions.WekaException;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

import java.net.URL;

public class DataProvider {

    public DataSource getDataSource(String filename) {
        URL resource = getClass().getClassLoader().getResource(filename);
        if (resource == null) {
            throw new IllegalArgumentException("file not found!");
        }

        DataSource source;
        try {
            source = new DataSource(resource.getPath());
        } catch (Exception e) {
            throw new WekaException(e);
        }

        return source;
    }

    public Instances getDataSetFrom(String filename) {
        DataSource source = getDataSource(filename);
        Instances data;
        try {
            data = source.getDataSet();
        } catch (Exception e)  {
            throw new WekaException(e);
        }

        data.setClassIndex(data.numAttributes() - 1);
        return data;
    }

}
