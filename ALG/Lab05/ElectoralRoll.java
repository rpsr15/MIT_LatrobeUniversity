import java.io.*;		//	PrintWriter, IOException
import java.util.*;	//	Scanner

public class ElectoralRoll
{
	private BinarySearchTree<Person> voters;

	public ElectoralRoll()
	{
     	voters = new BinarySearchTree<Person>();
	}

	public boolean insertElement(String firstName, String lastName,
		String address, String suburb, String state, int postCode)
	{
		Person temp = new Person(firstName, lastName, address,
                               suburb, state, postCode);
		voters.insertElement(temp);
		return true;
	}

	public boolean removeElement(String firstName, String lastName,
                                String address, String suburb,
                                String state, int postCode)
	{
		return voters.removeElement( new Person(firstName, lastName,
                                address, suburb, state, postCode));
	}

	public Person contains(String firstName, String lastName, int postCode)
	{
		return voters.search(new Person(firstName, lastName,
                                    "", "", "", postCode));
	}

	public void displayElements() throws IOException
	{
		PrintWriter z = new PrintWriter(System.out, true);
		voters.displayElements(z);
	}

}
