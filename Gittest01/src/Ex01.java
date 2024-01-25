import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		

		System.out.println("팀장 첫번쨰 커밋!");
		System.out.println("팀원1 두번째 커밋!");
		
		System.out.println("종우는 짜장면");
		System.out.println("신신식당은 뭐지");

			String[] menu = {
					"프랭크버거",
					"일식돈까스",
					"짜장면",
					"라멘",
					"돼지국밥",
					"김치찌개",
					"불고기백반",
					"닭갈비볶음밥",
					"순두부찌개",
					"된장찌개",
					"밀면",
					"마라탕",
					"편의점",
					"서브웨이",
					"초밥",
					"피자",
					"칼국수",
					"선지국",
					"맥도날드",
					"KFC",
					"노브랜드버거",
					"마제소바",
					"텐동",
					"국수",
					"카레",
					"도시락",
					"치밥",
					"파스타",
					"경양식돈까스",
					"돌솥비빔밥",
					"샤브샤브",
					"떡볶이",
					"분식",
					"낙곱새",
					"부대찌개",
					"삼겹살",
					"치킨",
					"인도커리"
			};
			
			Random random = new Random();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("= 점심 메뉴 골라주는 게임 =");
			
			while(true) {
				System.out.print("[1]~["+menu.length+"] ");
				System.out.print("[0]종료");
				
				System.out.print("  선택 : ");
				int choice = sc.nextInt();
				
				if(choice == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				} else if (choice < 0 || choice > menu.length) {
					System.out.println("잘못 선택했습니다. 다시 선택해주세요.");
					continue;
				}
				
				String selectedMenu = menu[choice - 1];
				System.out.println("선택하신 번호는 "+choice+ "번 입니다.");
				
				int randomIndex = random.nextInt(menu.length);
				String randomMenu = menu[randomIndex];
				System.out.println("오늘의 메뉴는 " +randomMenu+ "입니다.");
				System.out.println();
			}


	
	}

}
