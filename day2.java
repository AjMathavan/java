import java.util.Scanner;
public class day2 {

	public static void main(String[] args) {
	Scanner Aj=new Scanner(System.in);
	System.out.println("Enter the first input:");
	int firstinput=Aj.nextInt();
	System.out.println("Enter the second input:");
	int secondinput=Aj.nextInt();
	System.out.println(firstinput+ "+" +secondinput+ "=" +(firstinput+secondinput));
	System.out.println(firstinput+ "-" +secondinput+ "=" +(firstinput-secondinput));
	System.out.println(firstinput+ "x" +secondinput+ "=" +(firstinput*secondinput));
	System.out.println(firstinput+ "/" +secondinput+ "=" +(firstinput/secondinput));
	System.out.println(firstinput+ "mod" +secondinput+ "=" +(firstinput%secondinput));
	Aj.close();
	
	
	

}
}
