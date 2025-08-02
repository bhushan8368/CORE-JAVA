class calc{
    public int add(int nums[])
    {
        int result=0;
        for(int n:nums)
        {
            result=result+ n;
        }
        return result;
    }
}
public class demo{
    public static void main(String[] args) {
        calc obj=new calc();
        int result=obj.add(new int[]{5,3,4,7});
        System.out.println(result);
    }


}



    


