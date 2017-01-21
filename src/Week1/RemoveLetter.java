package Week1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveLetter {

	public static void main(String[] args) {

		remove("harsha", "a");

	}

	public static void remove(String str, String c) {

		/*
		 * if(str.contains(c)) System.out.println(str.replaceAll((String)
		 * c,""));
		 * 
		 * Integer a = 12354;
		 * 
		 * StringBuilder str1 = new StringBuilder();
		 * 
		 * 
		 * while(a>0){
		 * 
		 * if(a%8 == 0) str1.append(0); else str1.append(a%8);
		 * 
		 * a= a/ 8; } System.out.println(str1.reverse());
		 */
		LinkedList<String> l = new LinkedList<>();

		l.add("two");
		l.add("six");
		l.addLast("one");
		l.add("Three");
		l.add("four");
		l.add(1, "ten");
		l.add(3, "five");

		ListIterator<String> li = l.listIterator();

		System.out.println("before " + l.size());

		while (li.hasNext()) {

			if (li.next().equals("one"))
				li.remove();

		}

		System.out.println("after " + l.size());
		System.out.println(l.getLast());
		System.out.println(l.getFirst());
		System.out.println(l.contains(40));
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println(l);

	}
}
