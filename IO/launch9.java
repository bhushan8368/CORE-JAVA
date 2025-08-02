import java.io.*;
public class launch9 {
    public static void main(String[] args)  throws IOException{
        
        File dir=new File("pw");
        File file=new File (dir,"pw.txt");

        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println("java");
        pw.print(100);
        pw.print('a');
        pw.println(20.5);
        pw.print(true);

        pw.close();

        


    }
    
}
