package Assignment3;

//Linked List implementation without using Collection 

public class LinkedList {

	int N;  // Declare variable N
	LinkedList next=null;  // Class type variable 
	public LinkedList(int N, LinkedList next) //  Method 
	{
	this.N = N;  // reference variable of N
	this.next = next; //Reference variable of next
	}

	public static void main(String[] args) // Main Function 
	{
		//Now I'm  creating  objects here.
		
		LinkedList first = new LinkedList(75, null); 
		LinkedList second = new LinkedList(86, null);
		LinkedList third = new LinkedList(96, null );
		LinkedList fourth = new LinkedList(80, null);
		LinkedList fifth = new LinkedList(77,null);
		LinkedList sixth = new LinkedList(91,null);
		LinkedList seventh = new LinkedList(79,null);
		



	 /** Takes the next reference from the current node 
         and makes it the current element.
     **/
	first.next = second;  
	second.next = third;
	third.next=fourth; 
	fourth.next = fifth;
	fifth.next = sixth;
	sixth.next = seventh;
	

	System.out.print("Linked list: ");// window console
	
	// here we are using pointer to refer the address of the next element in the list.
	for(LinkedList ptr = first; ptr!=null; ptr=ptr.next)  
	{
	System.out.print(ptr.N +"-->" );
	
	
	}
	
	
	}

	
	}

