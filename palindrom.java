import java.util.Scanner;
public class palindrom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int pal = num;
        
        int rev=0;
        
        while(num!=0)
        {
            rev=rev*10 + num%10;
            num=num/10;
        }
        if(pal==rev)
        {
            System.out.print("Palindrom number");
        }
        else
        {
            System.out.print("Not a Palindrom number");
        }
    }
}