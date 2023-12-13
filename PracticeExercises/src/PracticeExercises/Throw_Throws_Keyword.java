package PracticeExercises;
public class Throw_Throws_Keyword {
	static void validate(int age){  
		if(age<18)  
		throw new ArithmeticException("not valid");  
		else
		System.out.println("welcome to vote");  
	}
	public static void main(String args[]){  
		validate(21);  
		System.out.println("rest of the code...");
		validate(13);  
		System.out.println("rest of the code...");
	}  
}
