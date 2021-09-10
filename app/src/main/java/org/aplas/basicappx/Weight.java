package org.aplas.basicappx;

public class Weight {
    private double gram;
    private double ounce;
    private double pound;

    Weight(){
        gram = 0.0;
        ounce = 0.0;
        pound = 0.0;
    }
    public void setGram(double value){
        gram = value;
    }
    public void setOunce(double value){
        ounce = value;
    }
    public void setPound(double value){
        pound = value = value;
    }

    public double getGram(){
        return gram;
    }
    public double getOunce(){
        return ounce;
    }
    public double getPound(){
        return pound;
    }

    public void convert(String oriUnit , String convUnit , double value){
        if(oriUnit.equalsIgnoreCase("Grm")){
            switch ( convUnit){
                case "Onc":
                    ounce = value / 28.35;
                    break;
                case "Pnd":
                    pound = value / 454;
                    break;
                default:
            }
        }
        if(oriUnit.equalsIgnoreCase("Onc")){
            switch (convUnit){
                case "Grm":
                    gram = value * 28.35;
                    break;
                case "Pnd":
                    pound = value / 16 ;
                    break;
                default:
            }
        }
        if(oriUnit.equalsIgnoreCase("Pnd")){
            switch (convUnit){
                case "Grm":
                    gram = value *  454;
                    break;
                case "Onc":
                    ounce = value * 16 ;
                    break;
                default:

            }
        }
    }
}
