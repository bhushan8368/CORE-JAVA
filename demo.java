class myexception extends Exception{
    public myexception(){

    }
    pubic myexception(String msg){
        super(msg);

    }


}
public static void main (String[] args){
    int num1=6;
    int num2=-2;
    try{
        if(num2<0){
            Exception e=new myexception("negative no");
            throw  e;
        }
        else{
            int result=num1/num2;
            System.out.println(result);
        }
    }
    catch(Exception e){
        System.out.println("enter a valid no");
    }


}