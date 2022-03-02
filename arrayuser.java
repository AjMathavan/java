import java.util.Scanner;
public class arrayuser {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array Size:");
		int size =sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the value:");
			array[i]=sc.nextInt();
			
		}
		
		sc.close();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
}
}