import java.util.*;

class MatrixOpration
{
	int A[][]=new int[4][4];
	int B[][]=new int[4][4];
	int C[][]=new int[4][4];
	
	Scanner sc=new Scanner(System.in);
	
	void getdata()
	{
		System.out.println("Enter First matrix Element:");
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter second matrix Element:");
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				B[i][j]=sc.nextInt();
			}
		}
	}
	
	void Addition()
	{
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		
		System.out.println("Addition of two matrix is : ");
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void Subtraction()
	{
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				C[i][j]=A[i][j]-B[i][j];
			}
		}
		
		System.out.println("Subtraction of two matrix is : ");
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void Multiplication()
	{
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				C[i][j]=0;
				for(int k=0;k<=3;k++)
				{
					C[i][j]=C[i][j]+A[i][k]*B[k][j];
				}
			}
		}
	
		System.out.println("Multiplication of two matrix is : ");
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				
				for(int k=0;k<=3;k++)
				{
					System.out.print(C[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
public class Matrix
{
	public static void main(String args[])
	{
		MatrixOpration m1=new MatrixOpration();
		m1.getdata();
		m1.Addition();
		m1.Subtraction();
		m1.Multiplication();
	}
}