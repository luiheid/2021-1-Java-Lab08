package edu.handong.csee.java.hw2.converters;

/**THis class is for kilometer to mile converter */
public class KMToMILEConverter implements Convertible{

    private double kilometer;
    private double mile;

    /**This method is for setting from value */
    public void setFromValue(double fromValue){
        kilometer = fromValue;
    }
    /**This method is for getting converted value */
    public double getConvertedValue(){
        return kilometer / 1.6;
    }
    /**This method is for converting*/
    public void convert(){
        mile = getConvertedValue();
    }
    
    
}
