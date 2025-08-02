public class pangram{
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean flag=false;
       
        str = str.toUpperCase().replace(" ", "");

        char[] ch=str.toCharArray();
        int ar[]=new int[26];

        for(int i=0;i<ch.length;i++){
            ar[ch[i]-65]++;
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]==0){
                System.out.println("it is not pangram");
                flag=true;
            }
            
        }
        if (flag==false){
            System.out.println("it is pangram");
        }
        
}
}