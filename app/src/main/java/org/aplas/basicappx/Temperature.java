package org.aplas.basicappx;

public class Temperature {
    private double celcius;
    private double fahreinheit;
    private double kelvin;

    Temperature(){
        celcius = 0.0;
        fahreinheit = 0.0;
        kelvin = 0.0;
    }
    public void setCelcius(double value){
        celcius = value;
    }
    public void setFahrenheit(double value){
        fahreinheit = value;
    }
    public void setKelvin(double value){
        kelvin = value = value;
    }
    public double getCelcius(){
        return celcius;
    }
    public double getFahreinheit(){
        return fahreinheit;
    }
    public double getKelvin(){
        return kelvin;
    }

    public void convert(String oriUnit , String convUnit , double value){
        if(oriUnit.equalsIgnoreCase("C")){
            switch ( convUnit){
                case "F":
                    fahreinheit = (value * 9/5) + 32;
                    break;
                case "K":
                    kelvin = value - 273.15;
                    break;
                default:
            }
        }
        if(oriUnit.equalsIgnoreCase("F")){
            switch (convUnit){
                case "C":
                    fahreinheit = (value - 32) * 5/9;
                    break;
                case "K":
                    kelvin = (value - 32) * 5/9 + 273.15;
                    break;
                default:
            }
        }
        if(oriUnit.equalsIgnoreCase("K")){
            switch (convUnit){
                case "C":
                    fahreinheit = value - 273.15;
                    break;
                case "F":
                    kelvin = (value - 273.15) * 9/5 + 32;
                    break;
                default:

            }
        }
    }

    public static void main(String[] args) {
        Temperature tmp = new Temperature();
        tmp.setCelcius(100);
        tmp.convert("C" , "F" , tmp.getCelcius());
        System.out.println(tmp.getFahreinheit());

    }

}
