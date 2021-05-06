package edu.handong.csee.java.hw2.converters;

/**THis class is for kilometer to meter converter */
public class KMToMConverter implements Convertible{

    private double kilometer;
    private double meter;

    /**This method is for setting from value */
    public void setFromValue(double fromValue){
        kilometer = fromValue;
    }
    /**This method is for getting converted value */
    public double getConvertedValue(){
        return kilometer * 1000;
    }

    /**This method is for converting */
    public void convert(){
        meter = getConvertedValue();
    }
    
}
