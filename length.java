
public class length
{
    public static void main(String[] args)
    {
        int num =1234567;
        
        int c=0;
        
        while(num>0)
        {
            num=num/10;
            c++;
        }
        System.out.println("No. of digits: "+c);
    }
}