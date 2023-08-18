import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 1st num: ");
        int a=sc.nextInt();
        
        System.out.println("Enter 2nd num: ");
        int b=sc.nextInt();
        
        int s=a+b;
        System.out.println("Sum is: "+s);
    }
}
