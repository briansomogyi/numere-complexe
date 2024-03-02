/**
 * 
 */

/**
 * 
 */
public class Complex {

	private static int numberOfDisplays = 0;
	
	private double re, img;
	
	/**
	 * @param re represents the real part of the complex number
	 * @param img represents the imaginary part of the complex number
	 */
	public Complex(double re, double img) {
		this.re = re;
		this.img = img;
	}
	
	public double absoluteValue() {
		return Math.sqrt(this.re * this.re + this.img * this.img);
		
	}
	
	public String toString() {
		return this.re + " + i * " + this.img;
	}
	
	public void displayComplex() {
		System.out.println(this);
		numberOfDisplays++;
	}
	
	public Complex addComplex(Complex complex) {
		Complex temp = new Complex(this.re + complex.getRe(), this.img + complex.getImg());
		return temp;
		
	}

	/**
	 * @return the re
	 */
	public double getRe() {
		return this.re;
	}

	/**
	 * @param re the re to set
	 */
	public void setRe(double re) {
		this.re = re;
	}

	/**
	 * @return the img
	 */
	public double getImg() {
		return this.img;
	}

	/**
	 * @param img the img to set
	 */
	public void setImg(double img) {
		this.img = img;
	}

	/**
	 * @return the numberOfDisplays
	 */
	public static int getNumberOfDisplays() {
		return Complex.numberOfDisplays;
	}

	/**
	 * @param numberOfDisplays the numberOfDisplays to set
	 */
	public static void setNumberOfDisplays(int numberOfDisplays) {
		Complex.numberOfDisplays = numberOfDisplays;
	}

	public static void dysplayNumberOfDisplays() {
		System.out.println("There were " + Complex.getNumberOfDisplays() + " complex numbers displayed.");
	}
	
	/**
	 * This is the main point of entrance in my app.
	 * @param args represents user's arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
