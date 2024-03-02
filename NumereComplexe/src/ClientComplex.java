/**
 * 
 */

/**
 * 
 */
public class ClientComplex {

	/**
	 * This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex complex1 = new Complex(3, 7);
		complex1.displayComplex();
		
		Complex complex2 = new Complex(2, 5.4);
		
		Complex sum = complex1.addComplex(complex2);
		sum.displayComplex();
		
		Complex.dysplayNumberOfDisplays();
	}

}
