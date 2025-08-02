import java.util.Scanner;
public class demo{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of string");
        String s1=scan.next();
        String s2="";
        boolean isDuplicate=false;
        for(int i=0;i<s1.length();i++){
            
            for ( int j=i+1;j<s1.length();j++) {
                if(s1.charAt(i)==s1.charAt(j)){
                    System.out.println(s1.charAt(i));
                    isDuplicate=true;
                    break;

                }
                
            }
            if(!isDuplicate){
                s2=s2+s1.charAt(i);
            }
        }
    System.out.println(s2);
    }
}

       
