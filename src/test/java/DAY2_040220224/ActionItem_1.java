package DAY2_040220224;

import java.util.ArrayList;

public class ActionItem_1 {
    public static void main(String[] args) {
        //declare a string array variable

        String[] CountryNames;
        String[] CitiesNames;
        //store some value in the string array
        CountryNames = new String[]{"Switzerland", "USA", "Dominican Republic",};
        CitiesNames = new String[]{"Zurich", "Miami","Santo Domingo",};
        //print out from index 0 from CountryNames array
        //print out index 0 from CitiesNames array
        //array starts with 0
        System.out.println("the value of index 0 is " + CountryNames[0]);
        System.out.println("the value of index 1 is " + CountryNames[1]);
        System.out.println("the value of index 2 is " + CitiesNames[2]);
        //print out Switzerland from the CountryNames array
        //print out Zurich from the CitiesNames array
        System.out.println("the city name is " + CitiesNames[0]);
        System.out.println("the city name is " + CitiesNames[1]);
        System.out.println("the city name is " + CitiesNames[2]);
        //print out Miami from the CityNames array
        //declare and store city Temperature
        int[] CityTemperature = new int[]{90, 98, 87};
        int[]CityMiles= new int[]{7750, 3958, 3896};
        //print out temperature 98 from the array
        //we use index 1 because 98 is the 2nd number and array index start from 0
        System.out.println("City Temperature is " + CityTemperature[0]);
        System.out.println("City Temperature is " + CityTemperature[1]);
        System.out.println("City Temperature is " + CityTemperature[2]);
        //print out all the miles from the array
        System.out.println("CityMiles is " + CityTemperature[0]);
        System.out.println("CityMiles is " + CityTemperature[1]);
        System.out.println("CityMiles is " + CityTemperature[2]);
    }//end of main method
}//end of class

