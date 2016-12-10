package Session6;

import java.util.*;


public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String>elements = new ArrayList<String>();
		elements.add("Puma");
		elements.add("Addidas");
		elements.add("Nike");
		elements.add("Calvin Klein");
		
		System.out.println("Iterating through ArrayList: ");
		System.out.println("------------------------------------------------------------------");
		Iterator<String> iter = elements.iterator();
			while(iter.hasNext()){
				String loop = iter.next();
				System.out.println("ArrayList value :" +loop);
		};

		System.out.println("------------------------------------------------------------------");
		
	}

}
