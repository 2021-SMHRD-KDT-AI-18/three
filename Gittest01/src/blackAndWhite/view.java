package blackAndWhite;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class view {

	public static void main(String[] args) {
		int[] comNumber =new int[9]; //컴퓨터 숫자 생성
		ArrayList<Integer> playerNumber=new ArrayList<>(); //플레이어 숫자 생성 
		int count=0; //대결숫자
		int com=0;  //컴 낸숫자
		int player=0;// 플레이어 낸숫자
		int playerWin =0;//플레이어 승점
		int comWin=0; //컴퓨터 승점
		int history=0; //전적
		int draw=0; //비긴횟수
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		for(int i=0; i<comNumber.length; i++) {
			int cn=ran.nextInt(9);
			comNumber[i]=cn;
			for(int j=0; j<i; j++) {
				if(comNumber[i]==comNumber[j]) {i--; break;} //중복제거
				
				
			}
		}
		for(int k=0; k<=8; k++) {
			playerNumber.add(k);
			}
		//for(int b : playerNumber) {System.out.print(b+" ");}
		
		
		//게임시작
		while(count<9) {
			com=comNumber[count];
			if(com%2==0) {
				System.out.println("흑");
			}else {System.out.println("백");}
			System.out.println(com);
			System.out.print("[");
			for(int b : playerNumber) {System.out.print(b+" ");}
			System.out.println("]");
			System.out.print("남은 숫자 중 낼숫자: ");
			int select=sc.nextInt();
			player=playerNumber.get(draw);
			playerNumber.remove(select);
			if(com<player) {
				System.out.println("승리"); playerWin++; count++;
			}else if(com==player) {
				System.out.println("비겼습니다"); draw++; count++;
			}else {
				System.out.println("패배"); comWin++; count++;
			}
			if(playerWin>=5) {System.out.println("다음강 진출"); break;}
			if(comWin>=5) {System.out.println("xx강 탈락"); break;}
			if(count==9 && playerWin==comWin) {
				System.out.println("비겼습니다 재경기");
			}
			if(draw==2) {
				if(playerWin>=4) {System.out.println("다음강 진출"); break;}
				if(comWin>=4) {System.out.println("xx강 탈락"); break;}
			}
			if(draw==4) {
				if(playerWin>=3) {System.out.println("다음강 진출"); break;}
				if(comWin>=3) {System.out.println("xx강 탈락"); break;}
				if(draw==6) {
					if(playerWin>=2) {System.out.println("다음강 진출"); break;}
					if(comWin>=2) {System.out.println("xx강 탈락"); break;}
			
			
		}
		

	}

}
}
}
