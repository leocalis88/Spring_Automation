package Day3_04082024;

public class T1_whileloop {

    // A While Loop will continue to execute the block of code and loop while the condition is true. the moment
    // it's false, it will stop the loop.

    //i++ is also equivalent  to i=i+1. what this does is that after each loop it adds 1 and start the new loop
    //with that new number, so if i=0, it will start as 0 and then enter the loop, then when it's done it will hit i++mor
    //i=i+1, that 0 will add 1 where it will now become 1 and enter the new loop, until it meets that condition. If condition
    // is i<=5 then it will keep going until the 0 becomes 6, then it will stop when after that because 6 isn't less than or equal to 5.

    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            System.out.println("Hello World " + i);
            i = i + 1;
        }//end of while loop
    }//end of main
    }//end of class

