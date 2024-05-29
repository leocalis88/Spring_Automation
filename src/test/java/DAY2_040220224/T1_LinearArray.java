package DAY2_040220224;

public class T1_LinearArray {
    public static void main(String[] args) {
        //declare a string array variable
      String[] studentNames;
      //store some value in the string array
        studentNames = new String[]{"Abdul", "Ahmad", "Anderson", "Wahid"};
        //print out index 0 from studentNames array
        //array starts with 0
        System.out.println("the value of index 0 is " + studentNames[0]);
        //print out Anderson from the studentName array
        System.out.println("the student name is " + studentNames[2]);
        //print out Wahid from the studentNames array
        System.out.println("the student name is " + studentNames[3]);
        //declare and store student grades
        int[] studentsGrades = new int[]{90, 93, 94, 99};
        //print out grade 93 from the array
        //we use index 1 because 93 is the 2nd number and array index start from 0
        System.out.println("Student grade is " + studentsGrades[1]);
    }//end of main method
}//end of class
