package DAY2_040220224;

import java.util.ArrayList;

public class T2_ArrayList {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries array list
        countries.add("USA"); //index 0`
        countries.add("INDIA"); //index 1`
        countries.add("PAKISTAN"); //index 2`
        countries.add("DR"); //index 3
        //print out USA
        System.out.println("The first country is " + countries.get(0));
        //print out the total size of the arraylist
        System.out.println("The total size of countries arraylist is " + countries.size());
        //arraylist is resizable
        countries.add("CANADA"); //index 4
        //print out the new size
        System.out.println("The total size of countries arrayList is " + countries.size());
    }//end of main
}//end of class
