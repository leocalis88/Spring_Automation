package Day4_04152024;

public class T2_SplitCommand {
    public static void main(String[] args) {
//declare a string variable with a single message
        String message = "my name is John";
        //declare an array to store the split messages
        String[] splitmessagearray = message.split(" ");
        //print out only john from the string
        System.out.println("the name is " + splitmessagearray[3]);
        //declare another message
        String triageMessage = "Automation_02";
        //store the message in a linear aaray
        String[] triageMessagearray = triageMessage.split("_");
        //print out only the number
        System.out.println("The number is " + triageMessagearray[1]);
    }// end of main
}// end of class
