class student{
    private int age;
    private String name;

    public void setAge(int age ){
        this.age=age;
        
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
       
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public void show()
    {
        System.out.println(name+" "+age);
    }
    
}
public class launch1{
    public static void main(String[] args) {
        student obj=new student();
        student obj1=new student();
        obj.setAge(18);
        obj1.setAge(22);
        obj.setName("navin");
        obj1.setName("sakshi");
        int studage=obj.getAge();
        System.out.println(studage);
    }
}
