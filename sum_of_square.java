import java.util.Scanner;
public class sum_of_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of squares of n terms of AP");
		System.out.println("Enter no of terms, first term and common difference");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		System.out.println("Formula used is : ");
		System.out.println("((((2n-1)d^2/6)+ad)(n-1)+a^2)*n");
		float m=(float)((((2*n)-1)*Math.pow(d,2)))/6;
		m+=a*d;
		m*=(n-1);
		m+=Math.pow(a, 2);
		m*=n;
		float sum=m;
		System.out.println("The Sum to n terms is: "+ sum);
	}

}
