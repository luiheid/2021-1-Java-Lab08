package edu.handong.csee.java.hw2.converters;

/**THis class is for ton to gram converter */
public class TONToGConverter implements Convertible{

    private double ton;
    private double gram;

    /**This method is for setting from value */
    public void setFromValue(double fromValue){
        ton = fromValue;
    }
    /**This method is for getting converted value */
    public double getConvertedValue(){
        return ton * 1000000;
    }
    /**This method is for converting */
    public void convert(){
        gram = getConvertedValue();
    }
}
