package p0427;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String grade;
		System.out.print("혜택 등급을 입력하세요 : ");
		grade=s.next();
		if(grade.equals("A")){
			System.out.println("VVIP 혜택을 받으실 수 있습니다.");
		}else if(grade.equals("B")){
			System.out.println("VIP 혜택을 받으실 수 있습니다.");
		}else if(grade.equals("C")){
			System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
		}else if(grade.equals("D")){
			System.out.print("일반 회원 혜택을 받으실 수 있습니다.");
		}else{
			System.out.print("혜택이 없습니다.");
		}

		s.close();}

}
