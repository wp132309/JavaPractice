package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance = 10;
		String carType = "고속버스";
		int money;
		
		switch(carType) {
		case "고속버스":
			money = 850 + ((distance-1) / 10) * 300;
			break;
		case "경차":
			money = 300 + ((distance-1) / 10) * 200;
			break;
		default:
			money = 600 + ((distance-1) / 10) * 200;
		}
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + carType);
		System.out.println("통행료 : " + money + "원");
	}

}
