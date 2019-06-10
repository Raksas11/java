// I am actually learning to add file on my github account from computer using git..
// so dont take it serious ....
import java.io.*;
public class rev
{
 	public static void main(String args[])
	{
		try
		{
	      DataInputStream in=new DataInputStream(System.in);
	      int n;
	      System.out.println("enter the number");
	      n=Integer.parseInt(in.readLine());
	      int rem,rev=0;
	      while(n>0)
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		System.out.println(rev);
		}
		catch(Exception e)
		{
		}
	}
}
              
