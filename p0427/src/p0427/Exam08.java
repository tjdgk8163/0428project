package p0427;

public class Exam08 {

	public static void main(String[] args) {
		int i=1,sum=0;
		while(i<=100){
			if(i%3==0){
				System.out.println(i);
				sum=sum+i;
			}i++;
		}System.out.print("sum : " + sum);

	}

}
