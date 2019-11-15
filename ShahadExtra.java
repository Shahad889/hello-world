/* Shahad Alneesan
 Nov 12, 2019
 ShahadExtra.java
Demo of using arguments straight from the command line
Dependencies: none
Credit: https://www.javatpoint.com/java-string-to-int
*/
public class  ShahadExtra
{
	public static void main(String[] parameters)
	{ 
		
	    if(parameters.length > 0)
	    {
		System.out.printf("The number of the arguments entered: %d%n", parameters.length);
		printstringArray(parameters);
	    }
		else
		{
		System.out.println("No argument entered.");	
		}	
	}
	//method prints a String array all on the same line 
	private static void printstringArray(String[] stringArray )
	{
		String i =  stringArray[1];
        int index = Integer.parseInt(i);// change the sting to integer
		for(int a = 0; a < index; a++)
		{
			System.out.printf("%s " , stringArray[0]);
		}
		System.out.println("");
	}
}