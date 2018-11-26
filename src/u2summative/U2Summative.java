/*
Callum MacLeod
26/11/2018
ICS3U Mr. Kaune
 */
package u2summative;

import java.util.Scanner;//import scanner


public class U2Summative {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int CHOICE;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Callum's Crazy Cool Calculator\n***************************\nWhat function would you like to use?\n1 = Addition\n2 = Substraction\n3 = Multiplication\n4 = Division\n5 = Exponents\n6 = Roots\n7 = Prime Check\n8 = Exit!");
        //outputting the menu
        CHOICE = keyedInput.nextInt();
        double answer = 0;
        //switch for choosing the method to use
        switch (CHOICE) {
            case 1:
                answer = ADD(answer);
                System.out.println("Answer = "+answer);
                break;
            case 2:
                answer = SUB(answer);
                System.out.println("Answer = "+answer);
                break;
            case 3:
                answer = MUL(answer);
                System.out.println("Answer = "+answer);
                break;
            case 4:
                answer = DIV(answer);
                System.out.println("Answer = "+answer);
                break;
            case 5:
                answer = EXP(answer);
                System.out.println("Answer = "+answer);
                break;
            case 6:
                answer = SQR(answer);
                System.out.println("Answer = "+answer);
                break;
            case 7:
                PRI();
                break;
            case 8:
                System.exit(0);
                break;
                
        }
        
    }
    /**
    * It adds 2 numbers
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double ADD(double answer) {//addition method
        double []num = new double [2];
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter the numbers you would like added together(a+b):");
        num[0] = keyedInput.nextDouble();
        num[1] = keyedInput.nextDouble();
        answer = (num[0] + num[1]);
        return answer;
    }
    /**
    * It subtracts 2 numbers
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double SUB(double answer) {//substraction method
        double []num = new double [2];
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter the numbers you would like substracted together(a-b):");
        num[0] = keyedInput.nextDouble();
        num[1] = keyedInput.nextDouble();
        answer = (num[0] - num[1]);
        return answer;
    }
    /**
    * It multiplies 2 numbers
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double MUL(double answer) {//multiply method
        double []num = new double [2];
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter the numbers you would like multiplied together(a*b):");
        num[0] = keyedInput.nextDouble();
        num[1] = keyedInput.nextDouble();
        answer = (num[0] * num[1]);
        return answer;
    }
    /**
    * It divides 2 numbers
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double DIV(double answer) {//division method
        double []num = new double [2];
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter the numbers you would like divided(a/b):");
        num[0] = keyedInput.nextDouble();
        num[1] = keyedInput.nextDouble();
        answer = (num[0] / num[1]);
        return answer;
    }
    /**
    * It takes a base then puts it to the power of another number
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double EXP(double answer) {//exponent method
        double []num = new double [3];
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Please enter the base for the exponent");
        num[0] = keyedInput.nextDouble();
        num[2] = num[0];
        num[1] = keyedInput.nextDouble();
        for (int i = 2; i <= num[1]; i++) {
            num[0] = num[0] * num[2];
        }
        answer = num[0];
        return answer;
    }
    /**
    * It takes a root of a number 
    * @param answer = the method will calculate for answer
    * @return answer the end result
    */
    public static double SQR(double answer) {
        double []num = new double [2];
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter the base first and then the root next(a to the root(b)):");
        num[0] = keyedInput.nextDouble();
        num[1] = keyedInput.nextDouble();
        answer = Math.pow(num[0], 1 / num[1]);
        return answer;
    }
    
    public static double PRI() {//prime check method
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Enter any integer to see if it is prime:");
        int num1;
        num1 = keyedInput.nextInt();

        if (num1 != 0) {
            if (num1 == 2) {
                System.out.println("The number is prime!");
                num1 = 0;
            }
            if (num1 == 1) {
                System.out.println("The number is not prime.");
            }
            for (int i = 2; i < num1; i++) {
                //taking keyed input and checking the remainder
                if (num1 % i == 0) {
                    System.out.println("The number is not prime.");
                    num1 = 0;
                } else {
                    System.out.println("The number is prime!");
                    num1 = 0;
                }
            }
        }
        return num1;
    }
}
