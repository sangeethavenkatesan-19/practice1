package PracticeExercises;
public class TypeCasting {
	public static void main(String[] args) {
		/*              implicit also known as autoboxing 
		                   byte --> short --> int --> long --> float --> double
		                         widening the data types from smaller to larger 
		*/
		byte a = 123;                      // 1 byte = -128 to 127
		short b = a;                      // short(2 byte) --> a = byte(1 byte) which is widended to short(2 byte) -- implicit 
		int c = b;                       // short to int
		long d = c;                     // int to long
		float e = d;                   // long to float
		double f = e;                 // float to double
		
	    //outputs
		System.out.println("---------Implicit typecasting-----------");
		System.out.println("Byte: "+a);
		System.out.println("short: "+b);
		System.out.println("Int: "+c);
		System.out.println("Long: "+d);
		System.out.println("Float: "+e);
		System.out.println("double: "+f);
		
		/*                       explicit opposite of explicit 
		                           double --> float --> long --> int --> short --> byte
		                              narrowing the data types from smaller to larger
	    */
		double  u = 167.3546d;                   // double u
		float v = (float)u;                     //double u is narrowed down to float v 
		long w =(long) v;                      //float v is narrowed down to long w
		int  x =(int) w;                      //long w is narrowed down to int x
		short y =(short) x;                  //int x is narrowed down to short y
		byte z = (byte)y;                   //short y is narrowed down to byte z
		
		//outputs
		System.out.println("------------------Explicit typecasting--------------");
		System.out.println("Double: "+u);
		System.out.println("Float: "+v);
		System.out.println("Long: "+w);
		System.out.println("Int: "+x);
		System.out.println("Short: "+y);
		System.out.println("Byte: "+z);
	}
}
