package ma.education.tp5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestList {
	public static void main (String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(12);
		list1.add(23);
		list1.add(23);
		list1.add(12);
				
		
		System.out.println("Boucle Classique ");
		// boucle classique:
		for(int i = 0; i<list1.size();i++){
			System.out.println(" element " + i + " : " +list1.get(i));
		}
		
		System.out.println("Boucle avancée ");
		// boucle avancée
		for(Integer e :list1) {
			System.out.println("element : "+e );
		}
		
		System.out.println("Iterator");
		// Iterator:
		Iterator<Integer> iter1 =  list1.iterator();
		while(iter1.hasNext()) {
			Integer e = iter1.next();
			System.out.println(" element : " + e);
		}
		System.out.println("Foreach");
		//foreach :
		list1.forEach(i-> System.out.println(" element : "+i));
	
	
		//List 2 :
		List<Integer> list2 = Arrays.asList(1,5,6,9,16);
		list2.stream().map(i->i*i).filter(i->i>37).forEach(i->
		System.out.println(i));

		System.out.println("Element list 3");
		List<Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(10);
		list3.add(15);
		list3.add(20);
		list3.add(2,10);

		list3.forEach(i-> System.out.println(i));
		
		System.out.println("HashSet Element ");
		Set<String> set1 = new HashSet<String>();
		set1.add("ABC1");
		set1.add("ABC2");
		set1.add("ABC3");
		set1.add("ABC1");
		set1.add("ABC4");
		set1.add("ABC5");
		 set1.forEach(i-> System.out.println(i));
		
		 System.out.println("List Client");
		 Set<Client> set2 = new HashSet<Client>();
		 set2.add(new Client(1,"ALAMI"));
		 set2.add(new Client(1,"ALAMI"));
		 set2.add(new Client(2,"SOUHAIL"));
		 set2.forEach(i-> System.out.println(i));
		 
		 System.out.println("treeSet Element ");
		 Set<Integer> set3 = new TreeSet<>();
		 set3.add(22);
		 set3.add(11);
		 set3.add(15);
		 set3.add(9);
		 set3.forEach(i-> System.out.println(i));
		 
		 System.out.println("Element TreeSet avec Client");
		 Set<Client> set4 = new TreeSet<>();
		 set4.add(new Client(1,"OMAR"));
		 set4.add(new Client(3,"SAID"));
		 set4.add(new Client(2,"HASSAN"));
		 set4.forEach(i-> System.out.println(i));
		 
		 System.out.println("La classe TestSet avec l’utilisation du comparateur:");
		 Comparator<Client> c = new CodeComparator();
		 Set<Client> set5 = new TreeSet<>(c);
		 set4.add(new Client(1,"OMAR"));
		 set4.add(new Client(3,"SAID"));
		 set4.add(new Client(2,"HASSAN"));
		 set4.forEach(i-> System.out.println(i));
		 
		 System.out.println("Element  expressions Lambda avec le code");
		 Set<Client> set6 = new TreeSet<>((c1,c2) -> c1.code-c2.code);
		 set4.add(new Client(1,"OMAR"));
		 set4.add(new Client(3,"SAID"));
		 set4.add(new Client(2,"HASSAN"));
		 set4.forEach(i-> System.out.println(i));

		 
	}
	
}
