package p0427;

public class Exam07 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%3==0){
				System.out.println(i);
			    sum=sum+i;
			}
		}System.out.print("sum : " + sum);

	}

}
