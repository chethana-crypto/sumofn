package sumofn;
import java.util.*;

public class sumofn {
	public static void main(String args[]) {
	
	
    System.out.println("Enter the numbers:" );
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int sum =0;
 
	for (int i=0;i<=num;i++) {
		sum = sum + i;
		
	}
	 System.out.println("the sum of the entered numbers is: "+sum );
		
	}

}
