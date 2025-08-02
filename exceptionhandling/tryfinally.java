import java.util.Scanner;
import java.util.InputMismatchException;

public class tryfinally {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in); 

        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("please input number");
        } finally {
            sc.close();
            System.out.println("resource closed");
        }

        System.out.println(num);
    }
}

//try with resource
/*
try(Scanner sc=new Scanner(System.in)){
    num=sc.nextInt();
}
System.out.println(num);
*/

