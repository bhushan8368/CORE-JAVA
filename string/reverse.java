public class reverse{
    public static void main(String[] args) {
        /*case 1 */
        /*String str1="pwjava";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        }
        System.out.println("before reversing:"+ str1);
        System.out.println("after reversing: "+ str2);

        /*case 2 */
        /* 
        
        String str1="PW java";
        String str2="";
        String str[]=str1.split(" ");
        
        for(int i=str.length-1;i>=0;i--){
            str2=str2+str[i]+" ";
            
        }
        System.out.println("before reversing:"+ str1);
        System.out.println("after reversing"+str2);*/

        /*case 3 */

        /* 

        String str1="pwskill java";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);

        }
        System.out.println(str2); */

        /*case 4 */
        String str1="pwskill java";
        String str2="";
        String arr[]=str1.split("");
        for(String elem:arr){
            for(int i=elem.length()-1;i>=0;i--){
                str2=str2+elem.charAt(i);
            }
            str2=str2+" ";
        }
        System.out.println(str2);


        




}
}