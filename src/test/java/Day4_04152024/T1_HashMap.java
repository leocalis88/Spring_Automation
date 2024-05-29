package Day4_04152024;

import java.util.HashMap;

public class T1_HashMap {
    public static void main(String[] args) {
        //create a hashmap consisting of name and age of triage students
        HashMap<String, Integer> traigeStudents = new HashMap<>();
        //add some values for the traige students hashmap
        traigeStudents.put("oyon", 25);
        traigeStudents.put("shakeb", 29);
        traigeStudents.put("tanvir", 27);
        traigeStudents.put("angie", 21);
        //print out the size of the hashmap
        System.out.println("The size of the hashmap is " + traigeStudents.size());
        //print out the content of the hashmap
        System.out.println("triageStudents");
        //print  out oyon age
        int oyonages = traigeStudents.get("oyon");
        System.out.println("oyon age is " + oyonages );
        //printout noyon age only if exist in the date set
        if (traigeStudents.containsKey("noyon")){
        System.out.println("noyons age is " + traigeStudents.get("noyons"));
    } else {
        System.out.println("noyon does not exit in the data set");

    }//end of if else
    }//end of main
    }//end of class



