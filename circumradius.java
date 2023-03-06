import java.util.Scanner;
public class circumradius {
	public static void main(String args[]) {
		System.out.println("Enter the lengths of sides of a cyclic quadrilateral: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int numerator=(a*b+c*d)*(a*c+b*d)*(a*d+b*c);
		int denominator=(a+b+c-d)*(b+c+d-a)*(c+d+a-b)*(d+a+b-c);
		int num=numerator/denominator;
		double r=Math.sqrt(num);
		System.out.println("Radius: "+r);
	}
}
