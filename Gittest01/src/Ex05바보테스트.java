import java.util.Random;
import java.util.Scanner;

public class Ex05바보테스트 {

	public static void main(String[] args) {
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int n=sc.nextInt();
		int a=ran.nextInt(2);
		if(n%2==a) {System.out.println("천재입니다");}
		else {System.out.println("바보입니다");}
		//실행 해주세요

	}

}
