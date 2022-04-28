
/**
 * complete java core
 *
 * @author (Fardin Kazi or Adam Warlord)
 * @version (Mako 1)
 */
 

import java.util.Scanner;

public class HotRodMako1 {

    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
	 // Write your code here
//        System.out.println("Hello World");
     /* Variables
     Just Like:
        -Water - Bucket
        -Masala - box
        -Lunch - LunchBox
     In Java:
     Variables are containers which store data values
     String, int, float, char, boolean
     How to declare variables:
     syntax - <dataType> <variableName> = <value>;
      */
     String name = "Fardin";
     String channel = "S.FASHION.ZR";
     String website = "WEB-Strom";
//     System.out.println(name);
//     System.out.println(name.length());
//     System.out.println(name.toUpperCase());
//     System.out.println(name.toLowerCase());
//     System.out.println(name + " from\" " + channel);
//     System.out.println(name + " from\\ " + channel);
//     System.out.println(name + " from\t " + website);
//     System.out.println(name + " from\n " + website);

//        System.out.println(name.contains("Far"));
//        System.out.println(name.charAt(2));
//        System.out.println(name.endsWith("in"));
//        System.out.println(name.indexOf("din"));

        int numb1 = 4, numb2 = 7;
//        System.out.println(Math.max(numb1, numb2));
//        System.out.println(Math.min(numb1, numb2));
//        System.out.println(Math.sqrt(36));
//        System.out.println(Math.abs(-36));
//        System.out.println(Math.abs(6));
//        System.out.println(Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());


     int a = 45, x=56, y=67;
     float b = 45.22f;
     boolean isAdult = false;
//     System.out.println(x);
//     System.out.println(b);
//     System.out.println(isAdult);

    /* Rules for constructing name of variables in Java
        1. Can contain digits, underscores, dollar signs, letters
        2. Should begin with a letter, $ or _
        3. Java is case sensitive language which means that
           fardin and adam are two different variables altogether.
        4. Should not contain whitespaces
        5. You cannot use reserved keywords from Java
     */
    /*
    Two types of Java Data Types:
        1. Primitive - byte (1 byte), short (2 bytes), int(4 bytes), long (8 bytes), float(4 bytes),
           double (8 bytes), boolean(1 bit), char (2 bytes).
        2. Non Primitive or Reference Data Type -
    */
    byte u = -56;
    double d = 45.635435345d;
//    System.out.println(d);
    char grade = 'A';
//    System.out.println(grade);

    /* Operators in Java

        Operand, operator, Operand  =  Result
        4           +           7   =  11

        Types of operators in Java
        Arithmetic operators
        Assignment operators
        Logical Operators
        Comparison Operators
     */
    int num1 = 45, num2=78;
    num1 += 3;
    num2 -= 8;
    // Explore these operators - *=, /=, %=
//        System.out.print("The value of num1 + num2 is ");
//        System.out.println(num1 + num2);
//
//        System.out.print("The value of num1 - num2 is ");
//        System.out.println(num1 - num2);
//
//        System.out.print("The value of num1 * num2 is ");
//        System.out.println(num1 * num2);
//
//        System.out.print("The value of num1 / num2 is ");
//        System.out.println(num1 / num2);
//
//        System.out.print("The value of num1 % num2 is ");
//        System.out.println(num1 % num2);
//        System.out.println(num2++);
//        System.out.println(++num1);
//        System.out.println(num1--);
//        System.out.println(--num1);

    /*
    * Comparison Operators:
    * 1. == : checks for equality of two values
    * 2. != : checks if two values are not equal
    * 3. <
    * 4. >
    * 5. <=
    * 6. >=
    *
    * Logical Operators:
    * 1. && - Logical and operator - returns true only if both conditions are true
    * 2. || - Logical or operator - returns true if any one condition is true
    * 3. ! - Logical not - Reverse the result from true to false and vice versa
    * */

    // Taking user input in Java
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Your Age");
//        int age = scan.nextInt();
//        System.out.println(input);

    // If-else conditionals
//        if(age>20){
//
//            System.out.println("You are an adult");
//        }
//        else if(age>5){
//            System.out.println("You are not a kid");
//
//        }
//        else{
//            System.out.println("You are a kid");
//        }
    //   Switch statement in Java

//        switch (age){
//            case 12:
//                System.out.println("You are 12 years old");
//                break;
//            case 56:
//                System.out.println("You are 56 years old");
//                break;
//            case 16:
//                System.out.println("You are 16 years old");
//                break;
//            default:
//                System.out.println("You did not match any of the cases");
//        }
    // Quick Quiz: print sunday to saturday based on numbers 1 to 7 typed by the user

        // Loops
        /*
        While Loop
        while(condition){
            // This code will keep executing until the condition is true
        }
         */
//        int i = 0;
//        while(i<100){
//            System.out.println(i);
//            i += 1;
//        }

        /*
        Do While Loop
        do{
            // This code will keep executing until the condition is true
        }while(condition)
         */
//        int j = 0;
//        do{
//            System.out.println(j);
//            j += 1;
//        }while(j>100);

        /*
        For Loop
        for(st1;st2;st3){
            //Code to be executed
            }
         */
//
//        for(int i=0;i<=10;i++){
//            if(i==2){
//                continue;
//            }
////            else{
////                System.out.println(i);
////            }
//            System.out.println(i);
//        }

    // Java Arrays
//        int [] marks = {1,2,3,5};
//        marks[3] = 34; // this will update marks[3]
//        System.out.println(marks[0]);
//        System.out.println(marks[3]);
//
//        // Classical way to iterate an array
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
//        System.out.println("This is for each loop:");
//
//        // For each loop
//        for(int value:marks){
//            System.out.println(value);
//        }
//
//        int [][] matrix = {{1,2,3},
//                            {4,5,6}};
//        System.out.println(matrix[0][1]);
//
//        String [] cars = ;
//        for(String value:cars){
//            System.out.println(value);
//        }

        // Try - Catch
//        String [] cars = {"1969 Mushtang Mach 1", "1986 Dodge Charger", "Hot Rod", "Rat rod"};
//
//        try{
//            System.out.println(cars[3]);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//
//        System.out.println("Masoom");
//        System.out.println(sum(5, 7));

        float number_1, number_2;
        System.out.println("Enter first number");

        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();

        System.out.println("Enter second number");
//        Scanner scan2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.print("You have Entered ");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
        String prompt = "Enter 0 for addition, 1 for " +
                        "subtraction, 2 for multiplication and 3 for division";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subtracting these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 - number_2);
                break;

            case 2:
                System.out.println("Multiplying these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 * number_2);
                break;

            case 3:
                System.out.println("Dividing these numbers");
                System.out.print("The result is: ");
                System.out.println(number_1 / number_2);
                break;

            default:
                System.out.println("Invalid input");

        }


    }
}

