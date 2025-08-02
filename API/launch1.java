public class launch1{
    public static void main(String[] args) {
        java.util.Date dt=new java.util.Date();
        System.out.println(dt);

        long timeinms1=dt.getTime();

        java.sql.Date dt1 =new java.sql.Date(timeinms1);
        System.out.println(dt1);

}
}