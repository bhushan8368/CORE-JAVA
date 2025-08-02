/*public class test {
    int a;
    String name;
    /* 
    public static void main(String[] args) {
        //declare the variable//
        //create the project//
        int num=9;
        test obj1=new test();
        test obj2=new test();
        obj1.name="navin";

        System.out.println(obj1.a);
        System.out.println(obj2.name);
       
        
    }

    class Calc {
        public int add(int n1, int n2) {
            return n1 + n2;
        }
    
        public int add(int n1, int n2, int n3) {
            return n1 + n2 + n3;
        }
        public double add(double n1,double n2,double n3){
            return n1+n2+n3;
        }
    }
    
    class Demo {
        public static void main(String[] args) {
            Calc obj = new Calc();
            int result = obj.add(1, 2);
            int res1 = obj.add(2, 6, 5);
            double res2=obj.add(2.1,5.4,4.5);
        
            System.out.println(result);  // Output: 3
            System.out.println(res1);    // Output: 13
            System.out.println(res2);    // Output: 11.6
        }
    }
     */
class cal {

    public void show(int n) {
        System.out.println(n);
    }

    public void show(byte n) {
        System.out.println(" byte" + n);

    }

    public void show(double n) {
        System.out.println("double" + n);
    }

    public void show(char n) {
        System.out.println("char" + n);

    }

    public void show(short n) {
        System.out.println("short" + n);
    }
}

    public class demo{
            public static void main(String[] args) {
                cal obj = new cal();
                
                obj.show(2);
        }
    }
        
