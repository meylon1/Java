package inclassProject;

public class replacemain {

	public static void main(String[] args) {
		
		int [] num = {11,-7,3,42,3,0,14,3};
		
		ReplaceIndex FirstNum = new ReplaceIndex();
		for (int n : num) {
			FirstNum.add(n);
		}
		System.out.println("number list:" );
		FirstNum.resu();
		
		FirstNum.replaceAll(3, 999);
		System.out.println("number list :");
		FirstNum.resu();
		
	}

}
