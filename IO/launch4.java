import java.io.*;

public class launch4 {
    public static void main(String[] args) throws IOException {
        File dir=new File("pw");
        File file=new File(dir,"pw.txt");
        file.createNewFile();

        FileWriter fw=new FileWriter(file,true);
        fw.write("java");
        fw.write("\n");
        fw.write(65);
        fw.write("\n");
        fw.write(97);
        char ch[]={'j','a','v','a'};
        fw.write(ch);
        fw.write("\n");
        fw.close();
        //fw.flush();

        System.out.println("open the pw txt to see result");
    






    }
    
}
