import java.io.*;
public class launch3 {
    public static void main(String[] args) throws IOException {
        File dir=new File("pwjava");
        System.out.println(dir.exists());
        dir.mkdir();
        System.out.println(dir.isDirectory());


        File file=new File(dir,"pwskill.txt");
        file.createNewFile();
        System.out.println(file.isFile());

        int count =0;
        File f=new File("io");
        String str[]=f.list();
        for(String name:str){
            count++;
            System.err.println(name);
        }
        System.out.println("no of files"+count);



    }
    
}
