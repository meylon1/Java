import java.util.Iterator;
import java.util.LinkedList;

public class test2 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList<String>();
		list.add("cat");
		list.add("cats");
		list.add("dog");
		list.add("dogs");
	
		
		System.out.println(list);
		removedEvenLength(list);
		System.out.println("Linked list  with iterator after...");
		System.out.println(list);
		

	}
	
	// remove all string of even length from a list
	// we use array list // linked
	//not efficient call get and remove many times
	
	public static void removedEvenLength(LinkedList<String> list){ //ARRAY AND LINKED 
		
		Iterator< String> i = list.iterator();// call iterator
		while ( i.hasNext()){
			String element = i.next();
			if (element.length()%2 == 0){// even
				i.remove();
			}
		}
		
			}
		
		

	}


