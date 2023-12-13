package PracticeExercises;
public class Finally_Block {
	public static void main(String args[]){  
		try{
			int number=25/5;  
			System.out.println(number);  
		 }  
		catch(NullPointerException e){
			System.out.println(e);
		 }  
		finally{
				System.out.println("The Execution of final block always happen ");
		}  
		System.out.println("-------------after final the rest of the code....");
		
		try{
			int number=5/0;  
			System.out.println(number);  
		}  
		catch(NullPointerException e){
				System.out.println(e);}  
		finally {
			System.out.println("finally block is always executed"); }
		System.out.println("--------------then rest of the code...");  
		
		try{
			int number=25/0;  
			System.out.println(number);  
		}  
		catch(ArithmeticException e){
			System.out.println(e);
		}  
		finally{
			System.out.println("finally block is always executed");
		}  
		System.out.println("------------------rest of the code...");  

	} 
}  