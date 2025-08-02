class animal1{
    final int age=19;
    final void sleep(){
        System.out.println("I am sleeping");
    }

}
class tiger1 extends animal{
    //void sleep() final method we cannot use override in child class
}
public final{
    public static void main(String[] args) {
        tiger1 t=new tiger1();
        t. sleep();
}
}
