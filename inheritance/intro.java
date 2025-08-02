class human{
    int age;
    void sleep(){
        age=18;
        System.out.println("human need good sleep");
        System.out.println(age);
    }

}
class student extends human{

}

public class intro {
    public static void main(String[] args) {
        student st=new student();
        st.sleep();
        
    }
    
}
