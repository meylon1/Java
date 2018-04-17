import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Partition {
public static void main(String[] args) {

	
		Integer elements[]= {15,1,6,12,-3,4,8,21,2,30,-1,9};
		List<Integer> list = new LinkedList<Integer>(Arrays.asList(elements));

		partitionss(list, 5);

		System.out.println(list);

	}
	//create method 

	private static void partitionss (List<Integer> list, int E){

		//instance of iterator

		Iterator<Integer> iterat = list.iterator();

		List<Integer> newList = new LinkedList<Integer>();

		// remove values

		while(iterat.hasNext()) {

			int numbers = iterat.next();

			if(numbers<= E) {

				iterat.remove();

				newList.add(numbers);

			}else {

			}

		}
			//adding the numbers to list 

		 list.addAll(0, newList);

	}

}
