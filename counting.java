public class counting {
    
    public static void main(String[] args)
    {
        int num =1234567;
        
        int ce=0;
        int co=0;
        
        while(num>0)
        {
            int rem=num%10;
            if(rem%2==0)
            {
                ce++;
            }
            else
            {
                co++;
            }
            num=num/10;
        }
        System.out.println("No. of even no: "+ce);
        System.out.println("No. of odd no: "+co);
    }
}