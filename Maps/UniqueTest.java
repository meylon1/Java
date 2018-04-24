import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class uniTest {

	@Test
	void test() {

      

		Map<String , String> isUnique = new HashMap <String , String>();


		isUnique.put("Marty" , "Stepp");
		isUnique.put("Stuart" , "Reges");
		isUnique.put("Jessica" , "Miller");
		isUnique.put("Amanda" , "Camp");
		isUnique.put("Hal" , "Perkins");
		Map<String , String> TestUnique = new HashMap <String , String>();


		TestUnique.put("Marty" , "Stepp");
		TestUnique.put("Stuart" , "Reges");
		TestUnique.put("Jessica" , "Miller");
		TestUnique.put("Amanda" , "Camp");
		TestUnique.put("Hal" , "Perkins");

		Assert.assertEquals(isUnique, TestUnique);



		Assert.assertEquals("Size mismatch for maps;", isUnique.size(), TestUnique.size());


	}




}


