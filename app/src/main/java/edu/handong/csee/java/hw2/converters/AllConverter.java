package edu.handong.csee.java.hw2.converters;

/**This class is for all converter */
public class AllConverter {

    private static double FV;
    private static String OM;
    
    /**This method is for setting from value */
    public AllConverter setFromValue(double fromValue){
        FV = fromValue;
        return this;
    }

    /**This method is for setting original measure */
    public AllConverter setOriginalMeasure(String originalMeasure){
        OM = originalMeasure;
        return this;
    }

    /**This method is for converting to target value and printing it */
    public AllConverter convertAndPrintOut(){
        if(OM.equals("KM")){
            KMToMConverter km_m = new KMToMConverter();
            KMToMILEConverter km_mile = new KMToMILEConverter();
            km_m.setFromValue(FV);
            km_mile.setFromValue(FV);
            System.out.println(FV + " " + OM + " to " + km_m.getConvertedValue() + " M");
            System.out.println(FV + " " + OM + " to " + km_mile.getConvertedValue() + " MILE");
        }
        else if(OM.equals("TON")){
            TONToKGConverter ton_kg = new TONToKGConverter();
            TONToGConverter ton_g = new TONToGConverter();
            ton_kg.setFromValue(FV);
            ton_g.setFromValue(FV);
            System.out.println(FV + " " + OM + " to " + ton_kg.getConvertedValue() + " KG");
            System.out.println(FV + " " + OM + " to " + ton_g.getConvertedValue() + " G");
        }
        else{
            System.out.println("AllConverter cannot support the measure!");
        }
        return this;
    }
    
}
