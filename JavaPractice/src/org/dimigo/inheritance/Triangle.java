/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *     l_ Triangle
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 8. 17.
 * </pre>
 * 
 * @author		: 김종윤
 * @version	: 1.0
 */
public class Triangle extends Figure {
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea() {
		return (width*height)/2;
	}
	
	protected void printCenter(){ 
		System.out.print("삼각형 "); 
		super.printCenter();
	}
}
