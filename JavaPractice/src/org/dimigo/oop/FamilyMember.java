/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *     l_ FamilyMember
 *
 * 1. 개요 : 
 * 2. 작성일 : 2015. 6. 16.
 * </pre>
 * 
 * @author		: 김종윤
 * @version	: 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
}
