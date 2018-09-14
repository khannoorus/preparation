package com.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMultiplefieldComparator {
	
	//sorting order : name - id - department

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Employees e1 = new Employees(1,"a","ab");
		Employees e2 = new Employees(3,"d","bc");
		Employees e3 = new Employees(4,"b","cd");
		Employees e4 = new Employees(2,"b","de");
		Employees e5 = new Employees(4,"b","ce");

		List<Employees> emp = new ArrayList<Employees>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);

		ComparatorToSortByMultipleFeild.applySorting(emp,new ByEmployeesName(), new ByEmployeesId(), new ByEmployeesDepartment());

		System.out.println("*****output*****");
		System.out.println("id "+"name "+"department");
		for(Employees e:emp){
			System.out.println(e.id+"    "+e.name+"    "+e.department);
		}
	}
	
}

@SuppressWarnings("hiding")
class ComparatorToSortByMultipleFeild<Employees> implements Comparator<Employees> {
	
    private final List<Comparator<? super Employees>> comparators;

    public ComparatorToSortByMultipleFeild(List<Comparator<? super Employees>> comparators) {
        this.comparators = comparators;
    }

    /*
       Arrays.asList(comparators)
       =========================
     This method also provides a convenient way to create a fixed-size list initialized to contain several elements:
     List<String> stooges = Arrays.asList("Larry", "Moe", "Curly"); 
     Parameters:
               a - the array by which the list will be backed 
     Returns:
               a list view of the specified array
    */
    
    @SuppressWarnings("unchecked")
	public ComparatorToSortByMultipleFeild(Comparator<? super Employees>... comparators) {
        this(Arrays.asList(comparators));
    }

    public int compare(Employees o1, Employees o2) {
        for (Comparator<? super Employees> c : comparators) {
            int result = c.compare(o1, o2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }

    @SuppressWarnings("unchecked")
	public static <Employees> void applySorting(List<Employees> list, Comparator<? super Employees>... comparators) {
        Collections.sort(list, new ComparatorToSortByMultipleFeild<Employees>(comparators));
    }
}

class ByEmployeesName implements Comparator<Employees>{

	@Override
	public int compare(Employees e1, Employees e2) {
		return e1.name.compareTo(e2.name);
	}
}

class ByEmployeesId implements Comparator<Employees>{

	@Override
	public int compare(Employees e1, Employees e2) {
		if(e1.id == e2.id)
			return 0;
		if(e1.id > e2.id)
			return 1;

		return -1;
	}
}

class ByEmployeesDepartment implements Comparator<Employees>{

	@Override
	public int compare(Employees e1, Employees e2) {
		return e1.department.compareTo(e2.department);
	}
}

class Employees {
	int id;
	String name;
	String department;

	public Employees(int id, String name,String department) {
		super();
		this.id = id;
		this.name = name;
		this.department=department;
	}
}
