package p0427;

public class Exam09 {

	public static void main(String[] args) {
		int i=1,sum=0;
		do{
			if(i%3==0){
				System.out.println(i);
				sum=sum+i;
			}i++;
			
		}while(i<=100);
		System.out.print("sum : " + sum);

	}

}
