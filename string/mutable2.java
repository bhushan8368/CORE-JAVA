public class mutable2 {
    public static void main(String[] args) {
        /* 
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.capacity());
        sb.append("abcefghikmnopmnghs");
        System.out.println(sb.capacity());
        sb.append("s");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuffer sb2=new StringBuffer("sachin");
        System.out.println(sb2);
        System.out.println(sb2.capacity());
        System.out.println(sb2.charAt(1));
        sb2.setCharAt(1, "a");
        System.out.println(sb2);*/

        StringBuffer sb=new StringBuffer(150);
        System.out.println(sb.capacity());
        sb.append("java");
        System.out.println(sb);
        sb.trimToSize();
        System.out.println(sb.capacity());

        StringBuffer sb3=new StringBuffer("pwjava");
        System.out.println(sb3);
        System.out.println(sb3.reverse());



        
    }
}
