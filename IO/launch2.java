import java.io.*;

public class launch2{
    public static void main(String[] args) throws IOException {
        
        File file1=new File("pw.txt");
        System.out.println(file1.exists());

        file1.createNewFile();
        System.out.println(file1.exists());

        File dir=new File("pw");
        System.out.println(dir.exists()); //false
        dir.mkdir();

        System.out.println(dir.exists());  //true



    }
}