package inclassProject;

public class ReplaceIndex {
		
	//instance vars
	private int[] elementData;
	private int size;
	
	
	public ReplaceIndex() {
		elementData =new int [100]; 
		size = 0;
		
		
	}
	public void add(int Value) {
		elementData[size] = Value;
		size++;
	}
   public void resu() { //get result
	   if(size==0) {
		   System.out.println("[]");
		   }
	   else {
		  System.out.print("[" + elementData[0]);
		  for(int i = 1; i<size;i++)
			  System.out.print("," + elementData[i]);
		  System.out.println(" ]");
	   }
   }
   //replace all 
   public void replaceAll(int val , int rep) {
	   for(int i=0; i<size; i++)
		   if(elementData[i]==val)
			   elementData[i]=rep;
   }
}
