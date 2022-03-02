import java.util.Scanner;
public class day4 {
	static int addin(int x,int y) {
		int total;
	 total=x+y;
	 return total;
	}

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the x:");
	int x=in.nextInt();
	System.out.println("Enter the y:");
	int y=in.nextInt();
	addin(x,y);
	in.close();

	}

}
