package Day3_04082024;

import java.util.ArrayList;

public class Assignment_1 {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        //add some values to the countries arraylist
        countries.add("USA");
        countries.add("INDIA");
        countries.add("Bangladesh");
        countries.add("UK");
        countries.add("Egypt");
        // only print out if the country is Bangladesh or USA
        int i =0;

        while(i <countries.size()) {
            String country = countries.get(i);
            if(countries.get(i) =="Bangladesh" || countries.get(i) == "USA"){
                System.out.println(country);

            }

            {
                System.out.println(country);
            }


        }//end of while loop

    }//end of main
}//end of class
