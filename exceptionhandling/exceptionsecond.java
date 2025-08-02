public class exceptionsecond {
    public static void main(String[] args) {
        
            int num1=6;
            int num2=0;
            int result=0;
            int values[]={4,2,6,8};
            String name=null;
            try {
                result=num1/name.length();
                System.out.println(values[5]);
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index Out of Bounds");
            }
            catch(Exception e){
                System.out.println("Exception");
            }
            System.out.println(result);
            System.out.println("bye");

        }
}
