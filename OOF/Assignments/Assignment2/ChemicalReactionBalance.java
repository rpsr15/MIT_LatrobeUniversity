// RAVI RATHORE
import java.util.Scanner;
public class ChemicalReactionBalance {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean isBalanced = true;
		String  reactant1 = "",	
				reactant2 = "",
				product1 = "",
				product2 = "";
		int     coR1 = 1,
				coR2 = 1,
				coP1 = 1,
				coP2 = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("**19539061 Ravi Rathore Assignment B**");
		System.out.println("Chemical Reaction Balance Check");
		System.out.println("Enter Reactant 1: ");
		reactant1 = input.nextLine();
		System.out.println("Enter Reactant 2: ");
		reactant2 = input.nextLine();
		System.out.println("Enter Product 1: ");
		product1 = input.nextLine();
		System.out.println("Enter Product 2: ");
		product2 = input.nextLine();
		System.out.println();
		coR1 = getCoefficient(reactant1);
		if (coR1 > 1){
			// remove coefficient and store it in separate int variable
			reactant1 = reactant1.substring(1);
		}
		coR2 = getCoefficient(reactant2);
		if (coR2 > 1){
			// remove coefficient
			reactant2 = reactant2.substring(1);
		}
		coP1 = getCoefficient(product1);
		if (coP1 > 1){
			// remove coefficient
			product1 = product1.substring(1);
		}
		coP2 = getCoefficient(product2);
		if (coP2 > 1){
			// remove coefficient
			product2 = product2.substring(1);

		}
		String reactants = reactant1 + reactant2;
		String products = product1 + product2;
		int lengthReactants = reactants.length();
		int lengthProducts = products.length();
		String currentElement = "";
		// Iterate through combine reactants and look for elements, and for each element match the count in reactants 
		for (int i = 0 ;  i < lengthReactants ; i++)// and products
		{   
			char theChar = reactants.charAt(i);
			if(isNumeric(theChar)) // if you encounter a numeric character update/match the count for current element
			{		if (!(i >= reactant1.length() && reactant1.contains(currentElement))){
				if (!match(currentElement,coR1,coR2,coP1,coP2,reactant1,reactant2,product1,product2))
				{
					isBalanced = false;
				}
			}
			currentElement = "";
			}
			else if (isUpperCase(theChar)) // if upper case handle it
			{
				if ( !currentElement.isEmpty() && isUpperCase(currentElement.charAt(0))){
					if (!(i >= reactant1.length() && reactant1.contains(currentElement)))
					{
						if (!match(currentElement,coR1,coR2,coP1,coP2,reactant1,reactant2,product1,product2))
						{
							isBalanced = false;
						}
					}
				}
				currentElement = theChar+"";
			}
			else if (isLowerCase(theChar)) // if small case add
			{
				currentElement += theChar;
				//perform check
				if (!(i >= reactant1.length() && reactant1.contains(currentElement)))
				{
					if (!match(currentElement,coR1,coR2,coP1,coP2,reactant1,reactant2,product1,product2))
					{
						isBalanced = false;
					}
				}
				currentElement = "";
			}
			if ( (i == (reactants.length()-1)) && !isNumeric(theChar))
			{
				if (!(i >= reactant1.length() && reactant1.contains(currentElement)))
				{
					if (!match(currentElement,coR1,coR2,coP1,coP2,reactant1,reactant2,product1,product2))
					{
						isBalanced = false;
					}//perform check
				}
			}
		}// prepare chemical reaction string
		String reactionString =    (reactant1.isEmpty()  ? "" : (coR1 > 1? coR1+reactant1 : reactant1))
				+ ((reactant1.isEmpty() || reactant2.isEmpty()) ? "" : " + ")
				+ (reactant2.isEmpty()  ? "" : (coR2 > 1? coR2+reactant2 : reactant2))
				+ " -> "
				+ (product1.isEmpty()  ? "" : (coP1 > 1? coP1+product1 : product1))
				+  ((product1.isEmpty() || product2.isEmpty()) ? "" : " + ")
				+ (product2.isEmpty()  ? "" : (coP2 > 1? coP2+product2 : product2));
		if(!isBalanced)
		{	// if equation is not balanced give a new line before giving result
			System.out.printf("%n");
		}

		System.out.println(reactionString);					

		if (isBalanced)
		{
			System.out.println("is Balanced");
		}
		else {
			System.out.println("is NOT Balanced");
		}
	}

	// method to match an element in prodcuts and reactants
	private static boolean match(String element,int coR1,int coR2,int coP1,int coP2,String r1,String r2,String p1,String p2)
	{	
		int countInReactant = getCountOf(element,r1,coR1) + getCountOf(element,r2,coR2);
		int countInProduct = getCountOf(element,p1,coP1) + getCountOf(element,p2,coP2);
		if (countInProduct != countInReactant)
		{	
			System.out.printf("%-2s %d != %d%n",element,countInReactant,countInProduct);
			return false;
		}
		return true;

	}
	// get count of an element in a compound
	private static int getCountOf(String element, String compound,int multiplicationCo)
	{	int lengthElement = element.length();
	int indexOfElement = compound.indexOf(element);
	if( compound.isEmpty() || element.isEmpty()){
		return 0;
	}
	if (indexOfElement == -1){
		return 0;
	}
	else 
	{
		int indexOfAtoms = lengthElement + indexOfElement;
		if((indexOfAtoms  < compound.length()) && (isNumeric(compound.charAt(indexOfAtoms))))
		{
			return (compound.charAt(indexOfAtoms) - 48)*multiplicationCo;
		}
		else 
			return multiplicationCo*1;
	}
	}// check if an element exist in a given compound
	private static boolean doesExist(String chemical,String inCompound){
		return inCompound.contains(chemical) ? true : false ;

	}
	private static boolean isLowerCase(char theChar){ // check for lower case
		return  theChar >= 97 && theChar <= 122 ? true : false;
	}
	// find if a  char is uppercase 
	private static boolean isUpperCase(char theChar)
	{
		return  theChar >= 65 && theChar <= 90 ? true : false;
	}
	// check if a character is numeric
	private static boolean isNumeric(char theChar)
	{
		return (theChar >= 50 && theChar <= 57) ? true : false ;

	}
	// get coefficient of a formula
	private static int getCoefficient(String chemicalFormula)
	{  
		if (chemicalFormula.isEmpty())
		{
			return 0;
		}
		char firstChar = chemicalFormula.charAt(0);
		if(firstChar >= 49 && firstChar <= 57)
		{
			return (int)firstChar - 48;
		}
		return 1;
	}

}
