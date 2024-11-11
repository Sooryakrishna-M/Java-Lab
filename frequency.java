import java.util.Scanner;
public class frequency {
    public static void main(String args[]) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter The String :");
        String str =sc.nextLine();
        System.out.print("Enter the character to be searched :");
        Character ch =sc.nextLine().charAt(0);
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(+ch+" repeats "+count+" times ");
        
    }
}
