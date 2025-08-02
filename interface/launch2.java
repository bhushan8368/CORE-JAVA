interface computer{
     void compilecode();
}

class laptop implements computer{
    public void compilecode(){
        System.out.println("you got 5 errors");
    }
}

class developer{
    
    public void buildapp(computer obj){
        System.out.println("building app");
        
        obj.compilecode();

    }
}
class desktop implements computer{
     public void compilecode(){
        System.out.println("you got 5 errors ,faster");
    }

}
class main{
    public static void main(String[] args){
        //laptop obj=new laptop();
       // computer obj=new computer();
       // developer dev=new developer();
       // dev.buildapp();
    }
}