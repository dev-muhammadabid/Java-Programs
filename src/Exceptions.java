public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Exception Handling");
    }
}

/*
BASICS

 int []a = new int [5];
        System.out.println("First Check");
        try {
            int result = 5 / 0;

            System.out.println(a[7]);

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("try-catch Check");
        }catch  (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Last Check");
*/


/*
Try-Catch & Finally

int []a = new int[5];

        System.out.println("First Check");

        try{
            System.out.println(a[3]);
        }catch  (Exception e){
            System.out.println("Check Exception");
        }finally {
            System.out.println("Always Run Checked");
        }
        System.out.println("Last Checked");
*/


/*
THROW

try{
        //code
        throw new MyException();

}catch  (Exception e){
      //code
}

*/