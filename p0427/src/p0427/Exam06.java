package p0427;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String grade;
		System.out.print("혜택 등급을 입력하세요 : ");
		grade=s.next();
		switch(grade){
		case "A":
			System.out.print("VVIP 혜택을 받으실 수 있습니다.");break;
		case "B":
			System.out.print("VIP 혜택을 받으실 수 있습니다.");break;
		case "C":
			System.out.print("우수 회원 혜택을 받으실 수 있습니다.");break;
		case "D":
			System.out.print("일반 회원 혜택을 받으실 수 있습니다.");break;
		default : 
			System.out.print("혜택이 없습니다.");break;
		}

		s.close();}

}
