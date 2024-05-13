import java.util.*;

public class miniProjects {
    public static void main(String[] args){
        System.out.println("Mini Projects Programs");
    }
}


/*
MP Ques.1 Guess the number btw 1 to 10 in 3 chances.

        int winNumber = (int)(Math.random()*10);
        int chancesLeft = 3;

        for(int i = 1; i <= 3; i++ ) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Guess the Number: ");
            int guess = sc.nextInt();
            if (guess == winNumber){
                System.out.println(winNumber + " You Win");
                break;
            }
            else if (guess < winNumber) {
                System.out.println("Enter Greater");
            }
            else if (guess > winNumber) {
                System.out.println("Enter Less");
            }

            chancesLeft -- ;
            System.out.println(chancesLeft + " chances are left ");

            if (chancesLeft == 0) {
                System.out.println("You loose");
            }
        }
    */