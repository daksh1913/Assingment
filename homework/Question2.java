package homework;

public class Question2 {

	public static void main(String args[]) {
	   
	 
		Clock c2 = new Clock(12,5,38); 
		System.out.println(c2);  
	   
	   
		c2.setClock(7265); 
	  
		c2.setHours(5); 
		c2.setMinutes(45); 
		c2.setSeconds(50); 
		c2.secincrement(); 
		System.out.println("Hourse : "+c2.getHours()+"  "+" Minutes : " +c2.getMinutes()+"  "+"Seconds : "+c2.getSeconds()); 
	   
		c2.secdecrement();
	}
}