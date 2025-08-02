class student{
    private String name;
    private int age;
    private String city;

    public student(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
        public String toString(){
            return "name:"+name+age+city;
        }
    }

public class launch1{
    public static void main(String[] args) {
        student st=new student("sakshi", 4, "uttarakhand");
        System.out.println(st);
    }
}
