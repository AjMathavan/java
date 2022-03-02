import java.util.Scanner;
public class day2mult {

	public static void main(String[] args) {
	Scanner mani=new Scanner(System.in);
	System.out.println("Enter the any number:");
	int number=mani.nextInt();
	for (int i=0;i<16;i++) {
		System.out.println((i+1)+"x"+number+"="+number*(i+1));
		
	}
	
      
mani.close();
	}

}
