package blackAndWhite;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class view {

	private static int mapPattern;

	public static void main(String[] args) {
		int[] comNumber =new int[9]; //컴퓨터 숫자 생성
		int[] array =new int[9]; //에레이 리스트 중복체크 
		ArrayList<Integer> playerNumber=new ArrayList<>(); //플레이어 숫자 생성 
		int count=0; //대결숫자
		int com=0;  //컴 낸숫자
		int player=0;// 플레이어 낸숫자
		int playerWin =0;//플레이어 승점
		int comWin=0; //컴퓨터 승점
		int history=0; //전적
		int draw=0; //비긴횟수
		int c=0;//내가고른숫자와 값을가진숫자가 같은 어레이리스트의 인덱스번호
		int mapPattern=0; //맵패턴
		int nextStage=0; // 연승수 캐릭난이도	
		int ra=0; //2번째 캐릭터 능력 변수
		String win=" ";
		String lose=" ";
		int l=0;
		
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		for(int i=0; i<comNumber.length; i++) {
			int cn=ran.nextInt(9);
			comNumber[i]=cn;
			for(int j=0; j<i; j++) {
				if(comNumber[i]==comNumber[j]) {i--; break;} //중복제거
				
				
			}
		}
		
		
		
		//게임시작
		while(nextStage<=3) {
			if(nextStage==0) {System.out.println("16강 상대 캐릭터능력: 없음 ");}
			if(nextStage==1) {System.out.println("8강 상대 캐릭터능력: 항상+1"); }
			if(nextStage==2) {System.out.println("4강 상대 캐릭터능력: 값+2 or -1"); }
			if(nextStage==3) {System.out.println("결승 상대 캐릭터능력: 3턴마다 값+5"); }
			playerNumber.clear();
			for(int k=0; k<=8; k++) {
				playerNumber.add(k);
				}//값추가
			count=0;
			comWin=0;
			draw=0;
			playerWin=0;
		while(count<9) {


			if(nextStage==0) {com=comNumber[count];}
			else if(nextStage==1) {
				com=comNumber[count]+1;
				}
			else if(nextStage==2) {
				 ra=ran.nextInt(2)+1;
				if(ra==1) {
				com=comNumber[count]+2;
				}
				if(ra==2) {
				com=comNumber[count]-1;
				}
			}
			else if(nextStage==3) {
				if(count%3==0) {
				com=comNumber[count]+5;
				}else {
					com=comNumber[count];
					}
				}
			

			if(com%2==0) {
				System.out.print("흑");
			}else {System.out.print("백");}
			System.out.println(com);
			if(nextStage==1 ) {
				System.out.println("+1 능력 발동중");}
			if(nextStage==2 && ra==1 ) {
				System.out.println("+2 능력 발동턴 입니다");
				}
			else if(nextStage==2 && ra==2 ) {
				System.out.println("-1 능력 발동턴 입니다");
				}
			if(nextStage==3 && count%3==0 &&count>0) {
				System.out.println("+5 능력 발동턴 입니다.");
			}
			
				
			System.out.print("[");
			for(int b : playerNumber) {System.out.print(b+" ");}
			System.out.print("]");
			System.out.print(" 남은 숫자 중 낼숫자: ");
			int select=sc.nextInt();
			array[count]=select;
			if(select>8 || select <0) {
				System.out.print("[");
				for(int b : playerNumber) {System.out.print(b+" ");}
				System.out.print("]");
				System.out.print("0부터 ~ 8까지의 값을 입력해주세요: ");
				select=sc.nextInt();
				array[count]=select;
			}
			
			
			if(count>0) {
			for(l=0; l<count; l++) {
				if(array[l]==select) {
					System.out.print("[");
					for(int b : playerNumber) {System.out.print(b+" ");}
					System.out.print("]");
					System.out.print(" 남은 숫자 중 낼 숫자: ");
					select=sc.nextInt();
					array[count]=select;
				}
			}
			}
		
		for(c=0; c<playerNumber.size(); c++) {// 입력값과 같은 배열삭제
				if(select==playerNumber.get(c)) {
					player=playerNumber.get(c);	
					playerNumber.remove(c);
					break;	}
                      }
					
			
			mapPattern=ran.nextInt(5);
			System.out.print("맵패턴은 : ");
			
			
			if(mapPattern==0) {
				System.out.println("큰수가 승리");
			if(com<player) {
				System.out.print("승리"); playerWin++; count++;
			}else if(com==player) {
				System.out.print("비겼습니다"); draw++; count++;
			}else {
				System.out.print("패배"); comWin++; count++;
			}
			}
			else if(mapPattern==1) {//작은수가 승리
				System.out.println("작은수가 승리");
				if(com>player) {
					System.out.print("승리"); playerWin++; count++;
				}else if(com==player) {
					System.out.print("비겼습니다"); draw++; count++;
				}else {
					System.out.print("패배"); comWin++; count++;
				}
				}

			else if(mapPattern==2) {//짝수가승리 둘다짝수시 큰수가승리
				System.out.println("짝수가 승리 둘다 짝수일시 큰수가 승리");

			else if(mapPattern==2) {
				System.out.println("짝수가 승리( 둘다 짝수나 홀수 일시 큰수가 승리)");

				if(player%2==0 && com%2==1) {
					System.out.print("승리"); playerWin++; count++;}
				else  if(player%2==0 && com%2==0 &&player>com) {
						System.out.print("승리"); playerWin++; count++;
				}else if(player==com ) {
					System.out.print("비겼습니다"); draw++; count++;
				}else if(player%2==1 && com%2==0) {
					System.out.print("패배"); comWin++; count++;
				}else  if(player%2==0 && com%2==0 &&player<com) 
				{
				System.out.print("패배"); comWin++; count++;
				
				}
			}
			else if(mapPattern==3) {//4에 가까운수가 승리
				System.out.println("4에 가까운수가 승리");
				if(Math.abs(player-4)>Math.abs(com-4)) {
					System.out.print("패배"); comWin++; count++;
				}else if(Math.abs(player-4)==Math.abs(com-4)) {
					System.out.print("비겼습니다"); draw++; count++;
				}else if(Math.abs(player-4)<Math.abs(com-4)) {
					System.out.print("승리"); playerWin++; count++;
				}
			}
					
					
					

			else if(mapPattern==4) {//약수면 작은수가 승리
				System.out.println("약수면 작은수가 승리 약수 아닐시 큰수가승리 한명만 0일시 0이패배");

			else if(mapPattern==4) {
				System.out.println("약수면 작은수가 승리 (약수 아닐시 큰수가승리 한명만 0일시 0이패배)");

				if(com==0 && player !=0) {
					System.out.print("승리"); playerWin++; count++;
				}
				else if(player==0 &&com !=0) {
					System.out.print("패배"); comWin++; count++;
				}
				if(player>com &&com != 0) {
					if(player%com==0) {
						System.out.print("패배"); comWin++; count++;
					}
				else if(player%com != 0) {
					System.out.print("승리"); playerWin++; count++;
				}
				}
				else if(player==com) {
					System.out.print("비겼습니다"); draw++; count++;
				}else if(player<com && player !=0) {
					if(com%player==0) {
						System.out.print("승리"); playerWin++; count++;
					}
				}
				else if(com%player != 0) {
					System.out.print("패배"); comWin++; count++;
			}
				
		}
			}

			System.out.println(" -> 전적: "+count+"전 "+playerWin+"승 "+comWin+"패 "+draw+"무");
			if(nextStage==0) {lose="16강 패배"; win="8강 진출";}
			if(nextStage==1) {lose="8강 패배"; win="4강 진출";}
			if(nextStage==2) {lose="4강 패배"; win="결승 진출";}
			if(nextStage==3) {lose="결승 패배"; win="최종 우승";}
	
			if(playerWin>=5) {System.out.println(win); nextStage++; break; }
			if(comWin>=5) {System.out.println(lose);nextStage=0; break;}
			if(count==9 && playerWin==comWin) {
				System.out.println("비겼습니다 재경기");  break; 
			}
			if(draw==2 ||draw==3) {
				if(playerWin>=4) {System.out.println(win); nextStage++; break;}
				if(comWin>=4) {System.out.println(lose);  nextStage=0; break;}
		            	}
			if(draw==4 || draw==5) {
				if(playerWin>=3) {System.out.println(win);nextStage++; break;}
				if(comWin>=3) {System.out.println(lose); nextStage=0; break;}
			            }
			if(draw==6||draw==7) {
					if(playerWin>=2) {System.out.println(win);nextStage++; break;}
					if(comWin>=2) {System.out.println(lose); nextStage=0; break;}
			            }
			if(draw==8) {
						if(playerWin==1) {System.out.println(win);nextStage++; break;}
						if(comWin==1) {System.out.println(lose); nextStage=0;  break;  }		       
						}
                          }//while count }
                             if(nextStage==0 && comWin>playerWin &&comWin+playerWin==count ) {break;}
		               }// while  nextStage}
		
		
		
	
	
}// main }
}//class }
	

