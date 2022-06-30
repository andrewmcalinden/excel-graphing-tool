/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vpprotype;

import java.awt.Color;
import java.io.File;
import java.io.Serializable;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;


public class DataModel implements Serializable{

    private Double[][]  runData;
    private Object[]    columnHeaders;   
    private boolean[]   lineSelections;
    private int[]       colorSelections;    
    private File videoFile;
    private File dataFile;

    public DataModel(Double[][] runData, Object[] columnHeaders, boolean[] lineSelections, int[] colorSelections, File videoFile, File dataFile) {
        this.runData = runData;
        this.columnHeaders = columnHeaders;
        this.lineSelections = lineSelections;
        this.colorSelections = colorSelections;
        this.videoFile = videoFile;
        this.dataFile = dataFile;
    }

    public File getVideoFile() {
        return videoFile;
    }

    public File getDataFile() {
        return dataFile;
    }

    public Double[][] getRunData() {
        return runData;
    }

    public Object[] getColumnHeaders() {
        return columnHeaders;
    }

    public boolean[] getLineSelections() {
        return lineSelections;
    }

    public int[] getColorSelections() {
        return colorSelections;
    }
    
}
