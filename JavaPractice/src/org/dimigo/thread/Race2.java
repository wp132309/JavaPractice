/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *     l_ Race
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 6.
 * </pre>
 * 
 * @author		: 김종윤
 * @version	: 1.0
 */
public class Race2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		Thread t1 = new Thread(new Runner2("홍길동"));
		Thread t2 = new Thread(new Runner2("홍길순"));
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}

}
