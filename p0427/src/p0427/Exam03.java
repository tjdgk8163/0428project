package p0427;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String grade;
		System.out.print("등급을 입력하세요 : ");
		grade=s.next();
		if(grade.equals("A")||grade.equals("a")){
			System.out.println("우수 회원입니다.");
		}else if(grade.equals("B")||grade.equals("b")){
			System.out.println("일반 회원입니다.");
		}else{
			System.out.println("손님입니다.");
		}

		s.close();}

}
