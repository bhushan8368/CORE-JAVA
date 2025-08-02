package constructor;
class student{
    private int age;
    private String name;

    student(String name,int age){
        this.name=name;
        this.age=age;
    }

    /*public void setAge(int age ){
        this.age=age;
        
    }
    public int getAge(){
        return age;
    }
    */
    public void setName(String name){
       
        this.name=name;

    }
    public String getName(){
        return name;
    }
}
public class launch1{
    public static void main(String[] args) {
        student st=new student("Rahul",25);
        String name=st.getName();
        System.out.println(name);
}
}