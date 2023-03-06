import java.util.Scanner;
public class sum_of_cubes {
	public static void main(String args[]) {
		System.out.println("Sum of cubes of n terms");
		System.out.println("Enter the no of terms,first term and common difference: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		System.out.println("Formula used: ");
		System.out.println("((n(n+1))/2)^2");
		float sum=(n*(n+1))/2;
		sum=sum*sum;
		System.out.println("The sum to n terms is: ");
		System.out.println(sum);
	}
}
