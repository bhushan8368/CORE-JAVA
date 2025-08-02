public class launch{
    public static void main(String[] args) {
        String brand="pwskills";
        System.out.println(brand);
        brand.concat("bengali");
        System.out.println(brand);

        StringBuilder brand1= new StringBuilder("pwskills");
        System.out.println(brand1);
        brand1.append("bengali");
        System.out.println(brand1);

        String s1=new String("harry");
        String s2=new String("harry");
        System.out.println(s1==s2);
        

    }
}
        