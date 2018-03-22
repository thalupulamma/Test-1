package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;

public class TestingListEquals {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setfName("A");
		emp.setlName("A");
		
		Emp emp1 = new Emp();
		emp1.setfName("B");
		emp1.setlName("B");
		
		Emp emp11 = new Emp();
		emp11.setfName("C");
		emp11.setlName("C");
		
		Emp emp2 = new Emp();
		emp2.setfName("A");
		emp2.setlName("A");
		
		Emp emp3 = new Emp();
		emp3.setfName("B");
		emp3.setlName("B");
		
		List<Emp> l1 = new ArrayList<>();
		l1.add(emp);
		l1.add(emp1);
//		l1.add(emp11);
		
		List<Emp> l2 = new ArrayList<>();
		l2.add(emp2);
		l2.add(emp3);
		l2.add(emp11);
		
		/*System.out.println(l1.equals(l2));
		System.out.println(l1.containsAll(l2) && l2.containsAll(l1));
		System.out.println(CollectionUtils.isEqualCollection(l1, l2));
		System.out.println(haveSameElements(l1, l2));
		boolean result = new HashSet(l1).equals(new HashSet(l2));
		System.out.println(result);
		System.out.println(isCollectionMatch(l1, l2));*/
		
		Set<Emp> unavailableItems = l2.stream()
			    .map(emp12 -> {
//			    	System.out.println(emp12.getfName());
			    	return emp12;
			    
			    })
			    .collect(Collectors.toSet());

		for (Emp s : unavailableItems) {
		    System.out.println(s.getfName() + "l1");
		}
		
			// stream the list and use the set to filter it
			List<Emp> unavailable = l1.stream()
			            .filter(e -> { 
					    	System.out.println(e.getfName());
					    	System.out.println(unavailableItems.contains(e));
			            	 return unavailableItems.contains(e);
			            	})
			            .collect(Collectors.toList());
			System.out.println(unavailable.size());
	}
	
	
	
	
	public static <T> boolean haveSameElements(Collection<T> col1, Collection<T> col2) {
	    if (col1 == col2)
	        return true;

	    // If either list is null, return whether the other is empty
	    if (col1 == null)
	        return col2.isEmpty();
	    if (col2 == null)
	        return col1.isEmpty();

	    // If lengths are not equal, they can't possibly match
	    if (col1.size() != col2.size())
	        return false;

	    // Helper class, so we don't have to do a whole lot of autoboxing
	    class Count
	    {
	        // Initialize as 1, as we would increment it anyway
	        public int count = 1;
	    }

	    final Map<T, Count> counts = new HashMap<>();

	    // Count the items in list1
	    for (final T item : col1) {
	        final Count count = counts.get(item);
	        if (count != null)
	            count.count++;
	        else
	            // If the map doesn't contain the item, put a new count
	            counts.put(item, new Count());
	    }

	    // Subtract the count of items in list2
	    for (final T item : col2) {
	        final Count count = counts.get(item);
	        // If the map doesn't contain the item, or the count is already reduced to 0, the lists are unequal 
	        if (count == null || count.count == 0)
	            return false;
	        count.count--;
	    }

	    // If any count is nonzero at this point, then the two lists don't match
	    for (final Count count : counts.values())
	        if (count.count != 0)
	            return false;

	    return true;
	}
	
	
	public static <T> boolean isCollectionMatch(Collection<T> one, Collection<T> two) {
	    if (one == two)
	        return true;

	    // If either list is null, return whether the other is empty
	    if (one == null)
	        return two.isEmpty();
	    if (two == null)
	        return one.isEmpty();

	    // If lengths are not equal, they can't possibly match
	    if (one.size() != two.size())
	        return false;

	    // copy the second list, so it can be modified
	    final List<T> ctwo = new ArrayList<>(two);

	    for (T itm : one) {
	        Iterator<T> it = ctwo.iterator();
	        boolean gotEq = false;
	        while (it.hasNext()) {
	            if (itm.equals(it.next())) {
	                it.remove();
	                gotEq = true;
	                break;
	            }
	        }
	        if (!gotEq) return false;
	    }
	    // All elements in one were found in two, and they're the same size.
	    return true;
	}
}
