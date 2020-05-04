package p0427;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1,n2,n3,sum;
		System.out.print("첫번째 수 : ");
		n1=s.nextInt();
		System.out.print("두번째 수 : ");
		n2=s.nextInt();
		System.out.print("세번째 수 : ");
		n3=s.nextInt();
		sum=n1+n2+n3;
		System.out.printf("%d + %d + %d = %d\n",n1,n2,n3,sum);
		System.out.printf("(%d + %d + %d) 세수의 평균 : %.2f",n1,n2,n3,(double)sum/3);
		
		
		s.close();
	}

}
