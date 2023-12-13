package PracticeExercises;
class bank{
	//public data members
	public String title="City union bank";
	public String branchName = "Chennai";
	public int staffs = 12;
	public int avgCustomersDaily = 150;
	public int withdraw = 100;
	public int deposit = 50;
	//public methods
	public void display_bank() {
		System.out.println("The bank name is "+this.title+". It is situated in "+this.branchName+". There are "+this.staffs+" staffs.");
	}
	public void display_customer() {
		System.out.println("Daily avg customer visit is "+this.avgCustomersDaily+". The minimum withdraw amount for customers is "+this.withdraw+", the minimum deposit amount is "+this.deposit+".");
	}
	public bank() {}//public constructor
}
public class AccessModifierPublic {
	public static void main(String[] args) {
		
		bank a = new bank();            // object creation for the class bank
		
		System.out.println("Bank name: "+a.title);
		System.out.println("Branch: "+a.branchName);
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		a.display_bank();
		a.display_customer();
	}
}