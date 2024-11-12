import java.io.*;

@SuppressWarnings("unused")
public class Filehandiling {
    public static void main(String args[])throws IOException{
        FileInputStream f1=null;
        FileOutputStream f2=null;
        try{
            f1=new FileInputStream("test1.txt");
            f2=new FileOutputStream("cp.txt");
            int c;
            do{
                c=f1.read();
                if(c!=-1){
                    f2.write((char)c);
                    System.out.print((char)c);
                }
                
            }
            while(c!=-1);
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
            return;
        }
        f1.close();
        f2.close();
    }
    
}
