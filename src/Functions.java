import java.util.*;

public class Functions{
    public static void main(String args[]) {
        System.out.println("Function Programs");
    }
}


/*
P1. Enter the 3 number from the user & make a function to print their average.

public static double avgNum(double a, double b, double c){
        return a+b+c/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        double num1 = sc.nextInt();
        System.out.print("Enter Num2: ");
        double num2 = sc.nextInt();
        System.out.print("Enter Num3: ");
        double num3 = sc.nextInt();

        System.out.println("The Average of Inputs are: "+ avgNum(num1, num2, num3));
    }
*/


/*
P2. Sum of all ODD Numbers, with help of Function

    public static int sumOdd(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++){
            if (i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ODD Num: ");
        int num = sc.nextInt();

        System.out.println("The Sum of ODD numbers are: "+ sumOdd(num));
    }
*/


/*
P3. Take 2 inputs from the user and return the greater number

 public static void findGreater(int a, int b){
       if (a > b || b < a){
           System.out.print("Num1");
        }
        else if (a < b || b > a){
            System.out.print("Num2");
        }
        else {
            System.out.println("INVALID Number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = sc.nextInt();

        System.out.print("The Greater numbers is: ");
        findGreater(num1, num2);
    }
*/


/*
P4. Write a function that takes in the radius as input and returns the circumference of a circle.

    public static Double getCircum(Double radius){
        return 2 * 3.14 * radius;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(getCircum(r));
    }
*/


/*
P5. Check the eligibility for voting, with the help of function.

    public static void forVote(int a){
        if (a >= 100){
            System.out.print("Really, You are alive!!");
        }
        else if (a >= 18){
            System.out.print("You are eligible for Vote.");
        }
        else {
            System.out.print("You are not eligible for Vote.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age for checking the eligibility for vote: ");
        int age = sc.nextInt();

        forVote(age);
    }
*/


/*
P6. Write an Infinity Loop using do-while condition.

     int num = 0;
        do {
           System.out.println(num);
       }while(num < 10);
*/


/*
P7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

        Scanner sc = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        char choice;
        do {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            System.out.print("Do you want to enter more number ? ( Y / N ): ");
            choice = sc.next().charAt(0);
        }while (choice == 'Y' || choice == 'y');

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zero numbers: " + zeroCount);
*/


/*
P8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. Xn.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the X: ");
        int x = sc.nextInt();
        System.out.print("Enter the n: ");
        int n = sc.nextInt();

        int result = 1;
        for (int i = 0; i < n; i++){
            result = result * x;
        }
        System.out.println("Your X num " + x + " the power n is " + result);
*/


/*
P9. Write a function that calculates the Greatest Common Divisor of 2 numbers.

    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Num2: ");
        int num2 = sc.nextInt();

        while (num1 != num2){
            if (num1 > num2){
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }
        System.out.println("Greatest Common Divisor value: " + num2);
*/


/*
P10. Write a program to print Fibonacci series of n terms where n is input by user: 0 1 1 2 3 5 8 13 24 .....

    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int num = sc.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print("Fibonacci Series of " + num + " terms: ");
        for (int i = 1; i <= num; i++){
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
*/


/*
1. Sum with the help of functions

 public static int calcSum(int a, int b){
        return a * b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num2: ");
        int num2 = sc.nextInt();

        System.out.println("The result is : " + calcSum(num1, num2));
    }
*/


/*
2. Factorial Functions

 public static int factNum(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num = sc.nextInt();

        System.out.println("The result is : " + factNum(num));
    }
*/