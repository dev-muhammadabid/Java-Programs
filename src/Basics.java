import java.util.*;

public class Basics{
    public static void main(String[] args){
        System.out.println("Basic Programs");
    }
}


/*
1. Scanner Class Used

Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Name: ");
String name = sc.nextLine();
System.out.print(name);
*/


/*
2. Scanner Class Sum

 Scanner sc = new Scanner(System.in);
        System.out.print("Num1: ");
        int num1 = sc.nextInt();
        System.out.print("Num2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum of " +  num1 + " + " +  num2 + " is " + sum);
 */


/*
3. Age Check For Driving

 Scanner sc = new Scanner(System.in);
       System.out.print("Enter Your Age For Check that you are eligible for Driving:  ");
       int age = sc.nextInt();
       if (age >= 18) {
           System.out.println("You are eligible for Driving ");
       }
       else {
           System.out.println("You are not eligible for Driving");
       }
*/


/*
4. ODD or EVEN

 Scanner sc = new Scanner(System.in);
       System.out.print("Enter number to check Odd or Even:  ");
       int num = sc.nextInt();
       if (num % 2 == 0) {
           System.out.println("Your number " + num + " is " + "EVEN");
       }
       else {
           System.out.println("Your number " + num + " is " + "ODD");
       }
*/


/*
5. Greater or Lesser

     Scanner sc = new Scanner(System.in);
       System.out.print("Enter num1:  ");
       int num1 = sc.nextInt();
        System.out.print("Enter num2:  ");
        int num2 = sc.nextInt();
       if (num1 == num2){
           System.out.println("Valued num1 is " + num1 + " num2 " + num2 + " is Equal ");
       }
       else if (num1 > num2) {
           System.out.println("Your num1 " + num1 + " is " + "GREATER");
       }
       else {
           System.out.println("Your num2 " + num2 + " is " + "GREATER");
       }
*/


/*
6. Switch Case used

Scanner sc = new Scanner(System.in);
       System.out.print("Press Button (1, 2, 3):  ");
       int btn = sc.nextInt();
        switch (btn){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Marhaba");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }
*/


/*
7. Basic Calculator use of Switch Case

 Scanner sc = new Scanner(System.in);
       System.out.println("......Basic Calculator For Two Numbers....");
       System.out.print("Enter Num1:  ");
       int num1 = sc.nextInt();

       System.out.println("Choose the Operations given below: ");
       System.out.println("+ : ADD, - : SUB, * : MUL, / : DIV ");
        System.out.print("Enter Operator: ");
       String opt = sc.next();

       System.out.print("Enter Num2:  ");
       int num2 = sc.nextInt();

        double result;
        switch (opt){
            case "+" :
                result = num1 + num2;
                System.out.println(num1 + " "+opt+" " + num2 + " = " + result);
                break;
            case "-" :
                result = num1 - num2;
                System.out.println(num1 + " "+opt+" " + num2 + " = " + result);
                break;
            case "*" :
                result = num1 * num2;
                System.out.println(num1 + " "+opt+" " + num2 + " = " + result);
                break;
            case "/" :
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " " + opt + " " + num2 + " = " + result);
                }
                else {
                    System.out.println("ERROR: Division by Zero");
                }
                break;
            default:
                System.out.println("Invalid Operations");
        }
*/



/*
8. Sum of Natural Number

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Num: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("The Sum of Natural Number " + n + " is " + sum);
*/


/*
9. Print Table enter by the user.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Table which you want to lean: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int table = n * i;
            System.out.println( n + " * " + i + " = " + table );
        }
*/


/*
10. Factorial Program

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int num = sc.nextInt();
    int fact = 1;
    for (int i = 1; i <= num; i++){
        fact *=i;
    }
    System.out.println(fact);

*/


/*
11. Fibonacci Program

        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fibonacci n Num: ");
        int fib = sc.nextInt();
        System.out.print(a + b + " ");
        for (int i = 2; i <= fib; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

*/