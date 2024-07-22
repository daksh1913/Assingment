/*take percentage from user
*if per > 90 then print grade A
*if between 80 to 90 then grade b
*if less than 80 grade c
*/

package firstprojectwithsrc;

import java.util.Scanner;

public class Firstclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double per;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your percentage");
		
		per = s.nextDouble();
		
		if(per>90)
		{
			System.out.println("you got the grade A");
		}
		
		else if(per>80 && per<90)
		{
			System.out.println("you got the grade B");
		}
		
		if (per<80)
		{
			System.out.println("you got the grade C");
		}
		
				
	}

}
