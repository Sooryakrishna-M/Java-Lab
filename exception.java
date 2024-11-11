import java.util.Scanner;
public class exception {
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Program to perform Division ");
            System.out.print("Enter the number-1 :");
            int a=sc.nextInt();
            System.out.print("Enter the number-2 :");
            int b=sc.nextInt();
            int c=a/b;
            System.out.print("Result="+c);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured");
        }
        finally{
            System.out.println("\nEnd of the operation");
        }
    }
    
    
}
