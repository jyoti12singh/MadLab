/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args)
	{
	    int i,j,n=5;
	   for(i=0;i<n;i++)
	   {for(j=0;j<=i;j++)
	   {System.out.print(" ");}
	   for(j=n-i;j>1;j--)
	   {System.out.print("*"+" ");}
	   System.out.println();
	}
	}
}
