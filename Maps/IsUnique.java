import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;


public class UniqeAssignment3 {


	public static void main(String[] args) {
		//create a map
		Map<String , String> Unique = new HashMap <String , String>();
		// add key vale Pairs to the map

		Unique.put("Marty" , "Stepp");
		Unique.put("Stuart" , "Reges");
		Unique.put("Jessica" , "Miller");
		Unique.put("Amanda" , "Camp");
		Unique.put("Hal" , "Perkins");
		//print the map
		System.out.println(isUnique);

		Map<String , String> TestUnique= new HashMap <String , String>();
		TestUnique.put("Kendrick" , "Perkins");
		TestUnique.put("Stuart" , "Reges");
		TestUnique.put("Jessica" , "Miller");
		TestUnique.put("Bruce" , "Reges");
		TestUnique.put("Hal" , "Perkins");
		System.out.println(TestUnique);
	}

	static boolean isUnique(Map<String, String> TestU) {

		Collection<String> values = TestU.values();
		Set<String> Val = new HashSet<String>();
	

		for(String tes: values) {	
				Val.add(tes);
	
			 }
		return Val.size()== values.size();
		}
	}



