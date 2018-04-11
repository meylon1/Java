import java.util.ArrayList;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList<String>();
		list.add("cat");
		list.add("cats");
		list.add("dog");
		list.add("dogs");
	
		
		System.out.println(list);
		removedEvenLength(list);
		System.out.println("Linked list after...");
		System.out.println(list);
		

	}
	
	// remove all string of even length from a list
	// we use array list // linked
	//not efficient call get and remove many times
	
	public static void removedEvenLength(LinkedList<String> list){ //ARRAY AND LINKED 
		
		int i =0;
		while(i < list.size()){
			String element = list.get(i);
			if(element.length()%2 == 0){//even
				list.remove(i);
				
			}
			else{
				i++; // skip to the next element
			}
		}
		
	}

}
