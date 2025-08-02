public class conditional {
    public static void main(String[] args) {

    /*    int age = 18;

        if (age >= 18) {
            System.out.println("legal");
        } else {
            System.out.println("you are kid");
        } */
        int age=21;

        if (age>=18 && age<60)
        {
            if(age>20 && age<30)
            {
                System.out.println("you are in 20s");
            }
            else if (age>=30 && age<=40)
            {
                System.out.println("you are in 30s");
            }
            else
            {
                System.out.println("you are still teen");
            }
   
        }
        else if (age>=60)
        {
            System.out.println("you are old man");
        }
        else
        {
            System.out.println("you are still a kid");
        }

    }
}
