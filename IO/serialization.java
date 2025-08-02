import java.io.*;

class cricketer implements Serializable {
    
    private String name;
    private int age;
    private int runs;

    public cricketer(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Runs: " + runs);
    }
}

public class serialization {
    public static void main(String[] args) throws Exception {
        // Uncomment this block to serialize the object
        /* 
        
        cricketer c = new cricketer("Sachin", 44, 30000);
        FileOutputStream fos = new FileOutputStream("pw.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(c);
        oos.flush();
        oos.close();
        */
        

        

        // Deserialization
        FileInputStream fis = new FileInputStream("pw.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        cricketer cr = (cricketer) ois.readObject();
        cr.disp();

        ois.close();
        
    }
}






        
