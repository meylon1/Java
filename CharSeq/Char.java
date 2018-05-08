package inclassProject;

public class CharSeq{

	public static void main(String[] args) {
		
		System.out.println("------------------");
		writeChars(1);
		System.out.println();
		writeChars(2);
		System.out.println();
		writeChars(3);
		System.out.println();
		writeChars(4);
		System.out.println();
		writeChars(5);
		System.out.println();
		writeChars(6);
		System.out.println();
		writeChars(7);
		System.out.println();
		writeChars(8);
		System.out.println();
		writeChars(9);
		System.out.println();
		writeChars(10);
		System.out.println();
		System.out.println("------------------");

	}
	// recursive
	public static void writeChars(int num) {
		String Less = "<";
		String Gre = ">";
		if (num <= 0) { // base case
			throw new IllegalArgumentException(); // throw Exception if num is <= 0
		} else if ( num == 1) { //num = 1 print *
			System.out.print("*");
		}else if ( num == 2) {
			System.out.print( "**" );
		}
		else {
			System.out.print(Less);
			writeChars(num-2);
			System.out.print(Gre);
	

		}
	}
}



