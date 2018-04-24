import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UniqeAssignment3 {


	public static void main(String[] a) {
		//create a map
		Map<String , String> Unique = new TreeMap <String , String>();
		// add key vale Pairs to the map

		Unique.put("Marty" , "Stepp");
		Unique.put("Stuart" , "Reges");
		Unique.put("Jessica" , "Miller");
		Unique.put("Amanda" , "Camp");
		Unique.put("Hal" , "Perkins");
		//print the map
		//System.out.println(isUnique);

		Map<String , String> TestUnique= new TreeMap <String , String>();
		TestUnique.put("Kendrick" , "Perkins");
		TestUnique.put("Stuart" , "Reges");
		TestUnique.put("Jessica" , "Miller");
		TestUnique.put("Bruce" , "Reges");
		TestUnique.put("Hal" , "Perkins");}

	/*Collection<String> secondValues = isUnique.values();
		for (String second: secondValues) {
			//System.out.println("second :   " + second);
		}*/

	private static boolean isUnique(Map<String, String> Unique, Map<String, String> TestUnique) {

		Collection<String> TestValues = TestUnique.values();
		Collection<String> secondValues = Unique.values();

		Set<String> Val = new HashSet<String>();
		Set<String> Vale = new HashSet<String>();


		for (String tes: TestValues) {
			for (String valu : secondValues) {
				Val.add(tes);
				Vale.add(valu);
				Val.contains(tes);
				Vale.contains(valu);
				if (Val.size() != Vale.size() && Val.contains(valu)== Vale.contains(valu)){
					System.out.println("true");

				}
				else {
					System.out.println("");

				}



			}
		}
		return false;
	}
}


