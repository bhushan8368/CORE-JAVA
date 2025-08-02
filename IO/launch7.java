import java.io.*;

public class launch7 {
    public static void main(String[] args)throws Exception {
        File dir=new File("pw");
        File file=new File(dir,"pw.txt");

        FileWriter fw=new FileWriter(file);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("java");
        bw.newLine();
        bw.write(65);
        bw.newLine();
        char c[]={'p','w','s','j'};
        bw.write(c);

        bw.flush();
        bw.close();


    }
    
}
