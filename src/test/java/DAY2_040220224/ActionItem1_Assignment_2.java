package DAY2_040220224;

import java.util.ArrayList;

public class ActionItem1_Assignment_2 {
    public static void main(String[] args) {
        //declare an arraylist variable
        ArrayList<String> Region = new ArrayList<>();
        ArrayList<Integer> AreaCode = new ArrayList<>();
        //add some values to the countries array list
        Region.add("West"); //index 0`
        Region.add("East"); //index 1`
        Region.add("North"); //index 2`
        Region.add("South"); //index 3
        //print out all the countries using a for loop
        //add some values to the countries array list
        AreaCode.add(347); //index 0`
        AreaCode.add(915); //index 1`
        AreaCode.add(315); //index 2`
        AreaCode.add(849); //index 3
        //print out all the countries using a for loop
        for (int i = 0; i < Region.size(); i++) {
            //print out which index is at
            System.out.println("The value of i is " + i);
            //print out the country located at index i
            System.out.println("My Region is " + Region.get(i) + " My Area Code is " + AreaCode.get(i));
        }//end of for loop
    }//end of main
}//end of class