package p0427;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String grade;
		System.out.print("등급을 입력하세요 : ");
		grade=s.next();
		switch(grade){
		case "A":
		case "a": 
			System.out.println("우수 회원입니다.");break;
		case "B":
		case "b":
			System.out.println("일반 회원입니다.");break;
		default : 
			System.out.println("손님입니다.");break;
		}
		s.close();}

}
