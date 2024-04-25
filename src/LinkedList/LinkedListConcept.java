package LinkedList;

public class LinkedListConcept {
	
	/*
	 *  head 			 LinkedList
	 *    |->	10 | n  ->  20 | n -> 30 | n -
	 *  										}
	 *  									   Null
	 *
	 *  									  
	 */
	
	Node head;
	
	class Node {
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void printMyLinkedList() {
		
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListConcept llc = new LinkedListConcept();
		
		Node first = llc.new Node(10);
		llc.head = first;
		
		Node second = llc.new Node(20);
		first.next = second;
		
		Node third = llc.new Node(30);
		second.next = third;
		
		llc.printMyLinkedList();
		

	}

}
