enum Result{
    Pass,Fail,NR;

//public static final result Pass=new  result();
//public static final result fail=new  result();
//public static final result nr=new  result();

int marks;

Result(){
    System.out.println("constructor in enum");
}
void setmarks(int marks){
    this.marks=marks;
}
int getmarks(){
    return marks;
}
}

public class enum2 {
    public static void main(String[] args) {
        Result.Pass.setmarks(50);

        int m1=Result.Pass.getmarks();
        System.out.println(m1);

        int m2=Result.Fail.getmarks();
        System.out.println(m2);

        Result.NR.setmarks(45);
        int m3=Result.NR.getmarks();
        System.out.println(m3);


    
}
}
