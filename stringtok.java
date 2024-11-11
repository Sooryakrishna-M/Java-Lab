import java.util.*;

public class stringtok {
    public static void main (String args[]){
    int n;
    int sum=0;

    @SuppressWarnings("resource")
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the String with space gaps ");
    String s=sc.nextLine();
    StringTokenizer str=new StringTokenizer(s," ");

    while(str.hasMoreTokens()){
        String temp=str.nextToken();
        n=Integer.parseInt(temp);
        System.out.println(n);
        sum=sum+n;

    }
    System.out.println("The sum is "+sum);
    
}
}
