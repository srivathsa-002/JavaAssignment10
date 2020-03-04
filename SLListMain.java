package javaAssignment10;

public class SLListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLList<Integer> sll = new SLList<Integer>();
		SListIterator<Integer> iterator = sll.iterator();
		System.out.println(sll);
		System.out.println("Inserting values....");
		iterator.insert(4);
		System.out.println(sll);
		iterator.insert(8);
		System.out.println(sll);
		iterator.insert(1);
		System.out.println(sll);
		iterator.insert(2);
		System.out.println(sll);
		System.out.println("Removing 1st value....");
		iterator.remove();
		System.out.println(sll);
		System.out.println("Removing 2nd value....");
		iterator.remove();
		System.out.println(sll);
	}

}
