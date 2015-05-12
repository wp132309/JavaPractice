/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *     l_ Question
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 * 
 * @author		: 김종윤
 * @version	: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("내가 가장좋아하는 운동은?");
		String answer1 = scanner.nextLine();
		if("배드민턴".equals(answer1)) {
			System.out.println("정답입니다!! ^^\n");
		} else {
			System.out.println("틀렸습니다!! ㅠ\n");
		}
		
		System.out.println("우리반 담임선생님 과목은?");
		String answer2 = scanner.nextLine();
		if("수학".equals(answer2)) {
			System.out.println("정답입니다!! ^^\n");
		} else {
			System.out.println("틀렸습니다!! ㅠ\n");
		}
		
		System.out.println("오늘점심 우리과 체육 예선경기는?");
		String answer3 = scanner.nextLine();
		if("농구".equals(answer3)) {
			System.out.println("정답입니다!! ^^\n");
		} else {
			System.out.println("틀렸습니다!! ㅠ\n");
		}
		
		scanner.close();
	}

}
