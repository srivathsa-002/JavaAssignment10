package javaAssignment10;

public class SListIterator<E> {

	int size;
	SLLNode<E> head;
	SLLNode<E> curNode;
	public SListIterator(SLLNode<E> head) {
		size = 0;
		this.head = head;
	}
	
	public void insert(E data) {
		SLLNode<E> newNode = new SLLNode<E>(data);
		SLLNode<E> tempNode = curNode;
		if(curNode == null) {
			curNode = newNode;
			head.next = curNode;
			size++;
		}
		else {
			//int tempSize = size;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
				//tempSize--;
			}
			tempNode.next = newNode;
			newNode.next = null;
			size++;
		}
	}
	
	public void remove() {
		 E data;
		 SLLNode<E> tempNode = curNode;
		 if(size == 0) {
	            System.out.println("LIST EMPTY!!!");
	     }
		 else if(size == 1) {
	    	 data = tempNode.data;
	         tempNode = null;
	         System.out.println("Removed Element is: " + data);
	         size--;
	     }
		 else {
			 int tempSize = size-1;
	         while (tempSize != 1 ) {
	        	 tempNode = tempNode.next;
	        	 tempSize--;
	         }
	         data = tempNode.next.data;
	         tempNode.next = null;
	         System.out.println("Removed Element is: " + data);
	         size--;
	     }
	}
	
	public boolean hasNext() {
		return curNode != null;
	}
	
	public E nextElement() {
		E data = curNode.data;
        curNode = curNode.next;
        return data;
	}

	public SLLNode<E> getHead() {
		return head.next;
	}
	
	public void updateNode() {
		curNode = head.next;
	}
}
