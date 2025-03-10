import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        System.out.println("Arrays & Two-Dimensional Arrays Programs");
    }
}


/*
Ques. Take an array as input from the user. Search for a given number x and print the index at which it occurs.

Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int num [] = new int[size];

        System.out.print("Enter you array: ");
        for (int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }

        int x = 9;
        for (int i = 0; i < num.length; i++){
            if (x == num[i]){
                System.out.print("The index of your array: " + i);
        }
        }

*/


/*
Ques. Example of Two-Dimensional Array

System.out.println(" 2 - D Arrays");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the columns: ");
        int c = sc.nextInt();

        int twoD [][] = new int[r][c];

        System.out.println("Enter your array list");
        for (int  i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

*/


/*
Ques. Take a matrix as input from the user. Search for a given number X and print the indices at which it occurs.

  System.out.println(" 2 - D Arrays");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the columns: ");
        int c = sc.nextInt();

        int twoD [][] = new int[r][c];

        System.out.println("Enter your array list");
        for (int  i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }

            int x = 9;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                if (x == twoD[i][j]){
                    System.out.print("The index of your array: " + i + "," + j);
                }
            }
            System.out.println();
        }

*/


/*
Ques. Print all the element in the list.

int []a = {1,2,3,4,5};

for(int i : a){
    System.out.println(i);
}

*/