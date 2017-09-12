import java.util.Scanner;
/**
 @author Shaheer Malik
 Date: 9/11/17
  Purpose: To demonstrate using delimiters in a Scanner
*/

 public class DelimiterScanner {
    public static void main(String [] args) {
        int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,average;
        Scanner keyboard = new Scanner(System.in);//Declare new Scanner
        keyboard.useDelimiter(",");//Define what Delimiter to use
        System.out.println("Enter 10 numbers(delimited by a comma):");
        num1 = keyboard.nextInt();//Ask for user input and define the 10 ints
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();
        num4 = keyboard.nextInt();
        num5 = keyboard.nextInt();
        num6 = keyboard.nextInt();
        num7 = keyboard.nextInt();
        num8 = keyboard.nextInt();
        num9 = keyboard.nextInt();
        num10 = keyboard.nextInt();
        average = (num1 + num2 +num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10)/10;//Define the average of 10 numbers

        System.out.print("The average of \"" + num1 + "\"");//
        System.out.print(",\"" + num2 + "\"");
        System.out.print(",\"" + num3 + "\"");
        System.out.print(",\"" + num4 + "\"");
        System.out.print(",\"" + num5 + "\"");
        System.out.print(",\"" + num6 + "\"");
        System.out.print(",\"" + num8 + "\"");
        System.out.print(",\"" + num9 + "\"");
        System.out.print(",\"" + num10 + "\"" + "is "+ average );
        keyboard.close();
    }
 }
