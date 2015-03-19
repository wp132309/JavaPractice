package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int sa1 = 9, sa2 = 10;
		int p1 = 9;
		double sah = 5.8, ph = 5.4;
		double s, p;
		
		s = (sa1 + sa2) * sah / 2;
		p = p1 * ph;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + s);
		System.out.println("평행사변형 넓이 : " + p);
		
		if(s > p) {
			System.out.println("사다리꼴이 평행사변형 보다 " + (s - p) + "더 큽니다.");
		} else if(p > s) {
			System.out.println("평행사변형이 사다리꼴 보다 " + (p - s) + "더 큽니다.");
		} else {
			System.out.println("사다리꼴과 평행사변형은 같습니다.");
		}
	}

}
