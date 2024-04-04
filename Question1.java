import java.util.Scanner;
import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Enter the values of m & n: ");
		m=sc.nextInt();
		n=sc.nextInt();
		
		int[] X=new int[m];
		int[] Y=new int[n];
		
		System.out.println("Array X: ");
		for(int i=0;i<m;i++) {
			X[i]=sc.nextInt();
		}
		System.out.println("Array Y: ");
		for(int i=0;i<n;i++) {
			Y[i]=sc.nextInt();
		}
		
		for(int i=0, j=0;i<m;i++) {
			if(X[i]==0) {
				X[i]=Y[j];
				j++;
			}
		}
		System.out.print("Output: {");
		Arrays.sort(X);
		for(int i=0;i<m;i++) {
			System.out.print(X[i]);
			if(i!=m-1) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
	}
}