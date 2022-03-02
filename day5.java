import java.util.Scanner;
public class day5 {

	public static void main(String[] args) {
		int num1,num2;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number1: ");
	num1=in.nextInt();
	System.out.println("Enter the number2:");
	 num2=in.nextInt();
	 if(num1 == num2) {
		 System.out.printf("%d == %d\n",num1,num2);
	 }
	 if(num1 != num2) {
		 System.out.printf("%d != %d\n",num1,num2);
	 }
	 if(num1 < num2) {
		 System.out.printf("%d < %d\n",num1,num2);
		 
	 }	 if(num1 > num2) {
		 System.out.printf("%d > %d\n",num1,num2);
	 }
	 if(num1 <= num2) {
		 System.out.printf("%d <= %d\n",num1,num2);
	 }if(num1 >= num2) {
		 System.out.printf("%d >= %d\n",num1,num2);
	 }
   in.close();
	}

}
