package org.aplas.basicappx;

public class Distance {
    private double meter;
    private double inch;
    private double mile;
    private double foot;

    Distance(){
        meter = 0;
        inch = 0;
        mile= 0 ;
        foot = 0;
    }
    public void setMeter(double value){
        meter = value;
    }
    public void setInch(double value){
        inch = value;
    }
    public void setMile(double value){
        mile = value;
    }
    public void setFoot(double value){
        foot = value;
    }
    public double getMeter(){
        return meter;
    }
    public double getInch(){
        return inch;
    }
    public double getMile(){
        return mile;
    }
    public double getFoot(){
        return foot;
    }

    public void convert(String oriUnit , String convUnit , double value){
        if(oriUnit.equalsIgnoreCase("Mtr")){
            switch ( convUnit){
                case "Inc":
                    inch = value * 39.37;
                    break;
                case "Mil":
                    mile = value / 1609;
                    break;
                case "Ft":
                    foot = value * 3.281;
                    break;
                default:
            }
        }
        if(oriUnit.equalsIgnoreCase("Inc")){
            switch (convUnit){
                case "Mtr":
                    meter = value / 39.37;
                    break;
                case "Mil":
                    mile = value / 63660;
                    break;
                case "Ft":
                    foot = value / 12;
                    break;
                default:
            }
        }
        if(oriUnit.equalsIgnoreCase("Mil")){
            switch (convUnit){
                case "Mtr":
                    meter = value * 1609;
                    break;
                case "Inc":
                    inch = value * 63360;
                    break;
                case "Ft":
                    foot = value * 5280 ;
                    break;
                default:

            }
        }
        if(oriUnit.equalsIgnoreCase("Ft")){
            switch (convUnit){
                case "Mtr":
                    meter = value / 3.281;
                    break;
                case "Inc":
                    inch = value * 12;
                    break;
                case "Mil":
                    mile = value / 5280;
                    break;
                default:

            }
        }
    }

    public static void main(String[] args) {
        Temperature tmp = new Temperature();
        tmp.setCelcius(100);
        tmp.convert("C" , "F" , tmp.getCelcius());
        System.out.println(tmp.getFahrenheit());

    }
}
