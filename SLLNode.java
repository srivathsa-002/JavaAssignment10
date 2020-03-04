package javaAssignment10;

public class SLLNode<E> {
	SLLNode<E> next;
	E data;
	public SLLNode(E e){
		this.data = e;
		this.next = null;
	}
}
