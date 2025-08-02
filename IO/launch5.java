import java.io.*;

public class launch5 {
    public static void main(String[] args) throws IOException {
        File dir=new File("pw");
        File file=new File(dir,"pw.txt");

        FileReader fd=new FileReader(file);

        int i=fd.read();
        //System.out.println((char)i);

        while(i!=-1){
            System.out.println(i+"--->");
            System.out.println((char)i);
            i=fd.read();
        }



    }
    
}
