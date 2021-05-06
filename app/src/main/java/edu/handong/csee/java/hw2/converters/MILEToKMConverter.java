package edu.handong.csee.java.hw2.converters;

/**THis class is for mile to kilometer converter */
public class MILEToKMConverter implements Convertible{

    private double meter;
    private double mile;

    /**This method is for setting from value */
    public void setFromValue(double fromValue){
        mile = fromValue;
    }
    /**This method is for getting converted value */
    public double getConvertedValue(){
        return mile * 1.6;
    }
    /**This method is for converting */
    public void convert(){
        mile = getConvertedValue();
    }
}
