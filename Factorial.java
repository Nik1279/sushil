import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num,res=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to find Factorial");
		num=sc.nextInt();
		
		for(int i=2;i<=num;i++) {
			res=res*i;
		}
        System.out.println("Factorial of "+num+" is "+res);
        sc.close();
	}
        
}