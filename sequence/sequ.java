package inclassProject;

public class Sequ {

	public static void main(String[] args) {

		System.out.println("*************************");
		writeSeq(1);
		System.out.println(" ");
		writeSeq(2);
		System.out.println(" ");
		writeSeq(3);
		System.out.println(" ");
		writeSeq(4);
		System.out.println(" ");
		writeSeq(5);
		System.out.println(" ");
		writeSeq(6);
		System.out.println(" ");
		writeSeq(7);
		System.out.println(" ");
		writeSeq(8);
		System.out.println(" ");
		writeSeq(9);
		System.out.println(" ");
		writeSeq(10);
		System.out.println(" ");
		System.out.println("***************************");

	}
	// recursive
	public static void writeSeq(int num) {


		int number;
		if (num < 1) { // base case
			throw new IllegalArgumentException(); // throw Exception if n is < 1
		} else if ( num == 1) {
			System.out.print(num);
		}else if ( num == 2) {
			System.out.print( "1  1" );
		}
		else {
			number = (num + 1) /2;
			System.out.print(number  + " ");

			// 
			writeSeq(num-2);
			System.out.print("  "  + number  );



		}
	}
}



