import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class launch6 {
    public static void main(String[] args) throws IOException {
         File dir=new File("pw");
        File file=new File(dir,"pw.txt");

        FileReader fd=new FileReader(file);

        char ch[]=new char[(int)file.length()];
       // int i=fd.read();

       fd.read(ch);

       for(char data:ch){
        System.out.println(data);
       }
        //System.out.println((char)i);

       // while(i!=-1){
           // System.out.println(i+"--->");
           // System.out.println((char)i);
           // i=fd.read();
        
    }
    
}
