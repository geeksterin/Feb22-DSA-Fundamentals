package geeksterArrayListSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int arr2[] = new int[5];
		/*// exammple
		 * class A{
		 * 
		 * method1(){
		 * 
		 * } }
		 * 
		 * class B extends A{ method2(){
		 * 
		 * }
		 * 
		 * 
		 * }
		 * 
		 * psvm(string args){ // all the possible variation
		 * 
		 * A obj = new A();// VALID A obj2 = new B();//Valid B obj3 = new A();//
		 * invalid B obj4 = new B(); // VALID
		 * 
		 * // RUN TIME - method overriding // Compile time - method overloading
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		// TODO Auto-generated method stub
		// Arraylist is a class and data structure which store similar data
		// Arraylist default size 10.
		// create a arraylist
		ArrayList<Integer> list = new ArrayList<Integer>();
		// ArrayList<Integer> list2 = new List<Integer>();//invalid
		List<Integer> list2 = new ArrayList<Integer>();// valid
		list2.add(25);
		list2.add(30);
		list2.add(35);
		list2.add(40);
		System.out.println(list2);

		List<Person> list3 = new ArrayList<Person>();
		Person obj = new Person();
				
		list3.add(obj);
		
		
		
		int arr5[] = {1,2,3,5,12,34,6,67};
		
		for(int elemnt : arr5){
			System.out.println(elemnt);
		}

		for (Person element : list3) {
			System.out.println(element.age);
		}

		// below is wrt class
		// We are restricting the use of functons which are not declared in the
		// parent class
		// only those child function can be called which are defined in parent
		// class
		
		
		// Collection is a framework
		// Collections is util library
		
		List<String> listNames = new ArrayList<>();
		
		listNames.add("Priya");
		listNames.add("Chandra");
		listNames.add("Anshu");
		listNames.add("Ali");
		listNames.add("Prince");
		listNames.add("Bishal");
		listNames.add("Kaushal");
		
		Collections.sort(listNames);
		
		System.out.println("List of sorted objects:");
		System.out.println(listNames);
		//Array list is will allow you expandable array
		//access element of array list O(1)
		//Insertion and deletion takes O(N)
		// ARRAY LIST can be traversed using for each iterators,
		//
		
		
		
		
		
		
	}

}
