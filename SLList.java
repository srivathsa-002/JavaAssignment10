package javaAssignment10;

public class SLList<E> {
	SLLNode<E> head;
	SListIterator<E> iterator;
	public SLList() {
		 this.head = new SLLNode<>(null);
		 iterator = new SListIterator<E>(head);
	}
	
	public String toString() {
		SListIterator<E> iter = this.iterator();
		if(iter.getHead() == null)
			return "Single Linked List:[]";
		String s = "";
		while(iter.hasNext()) {
			s += iter.nextElement();
			if(iter.hasNext())
				s += ", ";
			else
				s += "";
		}
		iter.updateNode();
		return "Single Linked List: [" + s.toString() + "]";
	}
	
	public SListIterator<E> iterator() {
        return iterator;
    }
}
