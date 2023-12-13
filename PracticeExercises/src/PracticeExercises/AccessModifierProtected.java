package PracticeExercises;
class Parent {
    protected int protectedVariable = 10;

    protected void protectedMethod() {
        System.out.println("This is a protected method in the Parent class.");
    }
}

// Subclass extending the Parent class
class Child extends Parent {
    void accessProtectedMember() {
        System.out.println("Accessing protected member from subclass: " + protectedVariable);
    }

    void callProtectedMethod() {
        protectedMethod();
    }
}
public class AccessModifierProtected {
	public static void main(String[] args) {
		Child childObj = new Child();

        // Accessing protected member and method in the subclass
        childObj.accessProtectedMember(); // Accessing protected variable
        childObj.callProtectedMethod();   // Accessing protected method
    }
}