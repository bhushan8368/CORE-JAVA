enum result1{
    Pass,fail,NR;
}

public class enumsSwitchcase {
    public static void main(String[] args) {
        result1 res = result1.Pass;
        switch(res){
            case Pass:System.out.println("passes");
            break;
            case fail:System.out.println("failed");
            break;
            case NR:System.out.println("no result");
        }


    
}
}
