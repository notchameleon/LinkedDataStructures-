package lab10;

import lists.LinkedUnorderedList;
import exceptionclasses.ElementNotFoundException;
import exceptionclasses.EmptyListException;

/*
 * Test application for LinkedList and LinkedUnorderedList classes.
 * Contains comprehensive tests for remove, addToRear, removeFirst, and addAfter methods.
 * 
 * @author Steffano & Ibrahim 
 * n00963924 , n00982959
 * 
 */


public class Lab10App {
	public static void main(String[] args)
	{

		LinkedUnorderedList<Product> theList = new LinkedUnorderedList<>();


		//REMOVEMETHOD FIRST PART 

		System.out.println("Testing the remove() on empty list\n");

		System.out.println("Intital State " + theList + "\n");

		System.out.println("The size " + theList.size());

		System.out.println();

		
		
		
		
		try 
		{
			Product removed = theList.remove(new Product("555", 0, 0.0));
			System.out.println("Removed: " + removed.getId());
			System.out.println(theList);
		} 
		catch (EmptyListException e) 
		{
			System.out.println("Error- Correct Throws EmptyListException  " + e.getMessage()+"\n");
		}

		System.out.println("Size after attempt " + theList.size() + "\n");

		//EMPTY LIST DONE 

		//Test With One Item.

		System.out.println("Testing part two(ONE ITEM) of the remove()\n");

		theList.addToFront(new Product("555", 0, 0.0));

		System.out.print("Initial list\n" + theList);
		System.out.println("The Size " + theList.size());

		try {
			Product removed = theList.remove(new Product("555" , 0, 0));
			System.out.println("Removed: " + removed.getId());
			System.out.println("List after removal " + theList);
			System.out.println("Size after removal " + theList.size());
			System.out.println("Is the List empty? " + theList.isEmpty());
		} catch (ElementNotFoundException e) {
			System.out.println("Error " + e.getMessage());
		}
		System.out.println();

		//Test 3 Remove first item from multipe items.
		System.out.println("Test 3: Remove() first item from multipe items");
		theList.addToFront(new Product("888", 0, 0.0));
		theList.addToFront(new Product("555", 0, 0.0));
		theList.addToFront(new Product("111", 0, 0.0));
		theList.addToFront(new Product("333", 0, 0.0));

		System.out.println("\nInitial list\n" + theList);
		System.out.println("The Size " + theList.size());
		System.out.println("First element: " + theList.first().getId() + "\n");

		try 
		{
			Product removed = theList.remove(new Product("333" , 0 ,0.0));
			System.out.println("Removed " + removed.getId());
			System.out.println("List after removal " + theList  +"\n" );
			System.out.println("Size after removal " + theList.size());
			System.out.println("First element now " + theList.first().getId());
		} 
		catch (ElementNotFoundException e) 
		{
			System.out.println("Error " + e.getMessage());
		}
		System.out.println();

		//Test 4 Remove last item from multiple items
		System.out.println("Test 4: Remove() last item from multipe items");
		theList.addToFront(new Product("888", 0, 0.0));
		theList.addToFront(new Product("555", 0, 0.0));
		theList.addToFront(new Product("111", 0, 0.0));
		theList.addToFront(new Product("333", 0, 0.0));
		System.out.println("\nInitial list\n" + theList);
		System.out.println("The Size " + theList.size());
		System.out.println("Last element: " + theList.last().getId() + "\n");
		
		try 
		{
			Product removed = theList.remove(new Product("888", 0 , 0.0));
			System.out.println("Removed " + removed.getId());
			System.out.println("List after removal\n" + theList);
			System.out.println("The size after removal " + theList.size());
			System.out.println("The current last element now " + theList.last().getId());
		} 
		catch (ElementNotFoundException e)
		{
			System.out.println("Error" + e.getMessage());
		}
		System.out.println();


		System.out.println("Test 5. Remove() middle item from multiple items");
		System.out.println("\nThe List \n" + theList);
		try {
			Product removed = theList.remove(new Product("555", 0 , 0.0));
			System.out.println("Removed " + removed.getId());
		} catch (EmptyListException e)
		{
			System.out.println("Error " + e.getMessage());
		}


		//Add to rear Method
		System.out.println("\nCurrent list from previous test \n" + theList);
		System.out.println("Current size " + theList.size());
		System.out.println("Current last element " + theList.last().getId());

		System.out.println("\nTest 1: addToRear() on list with items\n");
		System.out.println("Adding '999' to rear");
		theList.addToRear(new Product("999", 0, 0));
		System.out.println("List after the add \n" + theList );
		System.out.println("Size " + theList.size());
		System.out.println("Last element " + theList.last().getId());


		System.out.println("\nTest 2: addToRear() on a list with items\n");
		System.out.println("Adding '777' to rear\n");
		theList.addToRear(new Product("777", 0 , 0));
		System.out.println("List after addToRear '777' \n" + theList);
		System.out.println("Size " + theList.size());
		System.out.println("Last element " + theList.last().getId());


		//addToRear on empty list 
		System.out.println("\nTest 3 addToRear() on empty list\n");
		LinkedUnorderedList<Product> emptyList = new LinkedUnorderedList<Product>();

		System.out.println("Empty list size " + emptyList.size());
		System.out.println("Adding '123' to rear of empty list");
		emptyList.addToRear(new Product("123", 0 , 0));
		System.out.println("\nList after adding '123' to rear\n" + emptyList + "\n");
		System.out.println("Current Size " + emptyList.size());
		System.out.println("First element " + emptyList.first().getId());
		System.out.println("Last element " + emptyList.last().getId());



		System.out.println("\nTesting removeFirst()\n");

		System.out.println("Test 1: removeFirst() on empty list\n");

		LinkedUnorderedList<Product> tuckList = new LinkedUnorderedList<Product>();

		System.out.println("Empty list size: " + tuckList.size());

		try 
		{
			tuckList.removeFirst();
			System.out.println("Error");
		} 
		catch (EmptyListException e)
		{
			System.out.println("Correctly throws EmptyListException " + e.getMessage());
		}

		System.out.println("\nTest 2 removeFirst() on list with one item\n");
		tuckList.addToFront(new Product("555", 0, 0.0));
		System.out.println("Intial List \n" + tuckList);
		System.out.println("Size " + tuckList.size());
		System.out.println("Is empty? " + tuckList.isEmpty());

		Product removed = tuckList.removeFirst();

		System.out.println("Removed item " + removed.getId());
		System.out.println("\nList after removal " + tuckList);
		System.out.println("Size " + tuckList.size());
		System.out.println("Is empty? " + tuckList.isEmpty());

		//Test 3: removeFirst on list with multiple items

		System.out.println("\nTest 3 removeFirst() on list with multiple items\n");
		tuckList.addToFront(new Product("888", 0, 0.0));
		tuckList.addToFront(new Product("555", 0, 0.0));
		tuckList.addToFront(new Product("111", 0, 0.0));
		tuckList.addToFront(new Product("333", 0, 0.0));
		System.out.println("Initial list " + tuckList);
		System.out.println("Size " + tuckList.size());
		System.out.println("First element " + tuckList.first().getId());
		System.out.println("Last element " + tuckList.last().getId());

		removed = tuckList.removeFirst();
		System.out.println("Removed item " + removed.getId());
		System.out.println("\nList after removal\n" + tuckList);
		System.out.println("Size " + tuckList.size());
		System.out.println("First element " + tuckList.first().getId());
		System.out.println("Last element " + tuckList.last().getId());

		System.out.println("\nRemoving first element again \n");
		removed = tuckList.removeFirst();
		System.out.println("Removed item " + removed.getId());
		System.out.println("\nList after removal\n" + tuckList);
		System.out.println("Size " + tuckList.size());
		System.out.println("First element " + tuckList.first().getId());
		System.out.println("Last element " + tuckList.last().getId());

		System.out.println("\nTest 4 Size change verification for removeFirst()\n");
		System.out.println("Current size: " + tuckList.size());
		tuckList.removeFirst();
		System.out.println("Size after removeFirst() " + tuckList.size());
		tuckList.removeFirst();
		System.out.println("Size after another removeFirst() " + tuckList.size());
		System.out.println("Is empty: " + tuckList.isEmpty());

		//addAfter part.

		System.out.println("\nTesting addAfter() method\n");

		//Test 1 addAfter on empty list

		System.out.println("Test 1 addAfter() on empty list\n");
		LinkedUnorderedList<Product> testList = new LinkedUnorderedList<Product>();
		System.out.println("Empty list size: " + testList.size());

		try 
		{
			testList.addAfter(new Product("999", 0, 0.0), new Product("555", 0, 0.0));
			System.out.println("ERROR: Should have thrown exception");
		} catch (ElementNotFoundException e)
		{
			System.out.println("Success: Correctly throw ElementNotFoundException " + e.getMessage()); 
		}
		System.out.println("Size after attempt: " + testList.size());


		// Setup list for remaining tests
		testList.addToFront(new Product("888", 0, 0.0));
		testList.addToFront(new Product("555", 0, 0.0));
		testList.addToFront(new Product("111", 0, 0.0));
		testList.addToFront(new Product("333", 0, 0.0));
		System.out.println("\nInitial list for tests:");
		System.out.println(testList);
		System.out.println("Size: " + testList.size());
		System.out.println("First: " + testList.first().getId() + ", Last: " + testList.last().getId());

		// Test 2: addAfter with target not in list
		System.out.println("\nTest 2 addAfter() with target not in list\n");
		try {
			testList.addAfter(new Product("999", 0, 0.0), new Product("777", 0, 0.0));
			System.out.println("ERROR: Should have thrown exception");
		} catch (ElementNotFoundException e) {
			System.out.println("Success: Correctly throw ElementNotFoundException: " + e.getMessage());
		}
		System.out.println("List unchanged:");
		System.out.println(testList);
		System.out.println("Size: " + testList.size());

		// Test 3: addAfter first item
		System.out.println("\nTest 3 addAfter() first item (333)\n");
		System.out.println("Adding '222' after first element '333'");
		testList.addAfter(new Product("222", 0, 0.0), new Product("333", 0, 0.0));
		System.out.println("List after addAfter:");
		System.out.println(testList);
		System.out.println("Size: " + testList.size());
		System.out.println("First: " + testList.first().getId() + ", Last: " + testList.last().getId());

		// Test 4: addAfter middle item
		System.out.println("\nTest 4 addAfter() middle item (555)\n");

		System.out.println("Adding '666' after middle element '555'");
		testList.addAfter(new Product("666", 0, 0.0), new Product("555", 0, 0.0));
		System.out.println("List after addAfter:");
		System.out.println(testList);
		System.out.println("Size: " + testList.size());
		System.out.println("First: " + testList.first().getId() + ", Last: " + testList.last().getId());

		// Test 5: addAfter last item
		System.out.println("\nTest 5 addAfter() last item (888)\n");
		System.out.println("Adding '999' after last element '888'");
		testList.addAfter(new Product("999", 0, 0.0), new Product("888", 0, 0.0));
		System.out.println("List after addAfter:");
		System.out.println(testList);
		System.out.println("Size: " + testList.size());
		System.out.println("First: " + testList.first().getId() + ", Last: " + testList.last().getId());

		// Test 6: addAfter last item again (after using addAfter)
		System.out.println("\nTest 6 addAfter()  last item AGAIN (999)\n");
		System.out.println("Adding '777' after the new last element '999'");
		testList.addAfter(new Product("777", 0, 0.0), new Product("999", 0, 0.0));
		System.out.println("List after addAfter:");
		System.out.println(testList);
		System.out.println("Size: " + testList.size());
		System.out.println("First: " + testList.first().getId() + ", Last: " + testList.last().getId());

		// Test 7: Size change verification
		System.out.println("\nTest 7  addAfter() Size change verification\n");
		System.out.println("Final size for addAfter(): " + testList.size());
		System.out.println("Expected size: 8 (started with 4, added 4 more)");


	}

}
