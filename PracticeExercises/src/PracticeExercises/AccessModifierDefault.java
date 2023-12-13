package PracticeExercises;
class bank1{
	//default data members
	String title="City union bank";//
	String branchName = "Chennai";//
	int staffs = 12;//
	int avgCustomersDaily = 150;
	int withdraw = 100;
	int deposit = 50;
	//default methods
	void display_bank() {
		System.out.println("The bank name is "+this.title+". It is situated in "+this.branchName+". There are "+this.staffs+" staffs.");
	}
	void display_customer() {
		System.out.println("Daily avg customer visit is "+this.avgCustomersDaily+". The minimum withdraw amount for customers is "+this.withdraw+", the minimum deposit amount is "+this.deposit+".");
	}
	bank1(){}//default constructor : A constructor without any arguments or with the default value for every argument
}
public class AccessModifierDefault {
	public static void main(String[] args) {
		
		bank1 a = new bank1();            // object creation for the class bank
		
		System.out.println("Bank name: "+a.title);
		System.out.println("Branch: "+a.branchName);
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		a.display_bank();
		a.display_customer();
		
	}

}
