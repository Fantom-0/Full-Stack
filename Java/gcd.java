import java.util.Scanner;
class gcd
{
    public static void main(String arg[])	
	{
	 long n1,n2,n3;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter  number 1");
                n1=sc.nextLong();
             	 System.out.println("enter  number 2");
                n2=sc.nextLong();
                System.out.println("enter the third digit");
                n3= sc.nextLong();
	 if(n1>0 && n2>0)
	 {
	   long result=gcdCal(n1,n2);
     	   System.out.println("Gcd of two numbers = "+result);
	 }  
	else
	    System.out.println("Please enter numbers greater than zero");
}
static long gcdCal(long a,long b)
  {
    while (b > 0)
    {
        long temp = b;
        b = a % b; 
        a = temp;
    }
    System.out.println("thanks for using our program");
    System.out.println("enter the specific character you want to perform GCD on");
    return a;
   }
   
}