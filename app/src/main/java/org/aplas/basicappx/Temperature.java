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
    public void setKelvins(double value){
        kelvin = value ;
    }
    public double getCelcius(){
        return celcius;
    }
    public double getFahrenheit(){
        return fahreinheit;
    }
    public double getKelvins(){
        return kelvin;
    }

    public double convert(String oriUnit , String convUnit , double value){
        double valueA = 0;
        if(oriUnit.equalsIgnoreCase("°C")){
            switch ( convUnit){
                case "°F":
                    valueA = fahreinheit = (value * 9/5) + 32;

                    break;
                case "K":
                    valueA = kelvin = value - 273.15;

                    break;
                default:
            }
            return valueA;
        }
        if(oriUnit.equalsIgnoreCase("°F")){
            switch (convUnit){
                case "°C":
                    valueA = fahreinheit = (value - 32) * 5/9;

                    break;
                case "K":
                    valueA = kelvin = (value - 32) * 5/9 + 273.15;

                    break;
                default:
            }
            return  valueA;
        }
        if(oriUnit.equalsIgnoreCase("K")){
            switch (convUnit){
                case "°C":
                    valueA = fahreinheit = value - 273.15;

                    break;
                case "°F":
                    valueA = kelvin = (value - 273.15) * 9/5 + 32;

                    break;
                default:

            }
            return  valueA;
        }
        return valueA;
    }

    public static void main(String[] args) {
        Temperature tmp = new Temperature();
        tmp.setCelcius(100);
        System.out.println(tmp.convert("°C" , "°F" , tmp.getCelcius()));

    }

}
