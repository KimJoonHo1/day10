package day10;

import java.util.Scanner;

public class Quiz01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Quiz01_Method ex = new Quiz01_Method();
		
		while(true) {
			System.out.println("=== UP & Down Game ===");
			System.out.println("1. 게임시작");
			System.out.println("2. 게임전적");
			System.out.println("3. 게임종료");
			System.out.print(">>>>> ");
			int sw = scanner.nextInt();
			
			switch(sw) {
				case 1:
					System.out.println("=== Start ===");
					ex.setRandom();
					int count = 0;
					System.out.print("닉네임을 입력해주세요 --> ");
					String name = scanner.next();
					while(true) {
						count++;
						System.out.print("Input Number -->");
						int num = scanner.nextInt();
						int result = ex.check(num, count, name);
						if(result == 0) {
							int check = ex.modifyHeight(count, name);
							if(check == 1) {
								System.out.println(name + "님 최고 기록을 갱신하셨습니다.");
							}
							break;
						}
					}
					break;
				case 2:
					int height = ex.getHeight();
					String heightName = ex.getName();
					System.out.println("최고 기록은 " + heightName + "님의 "+ height + "회 입니다 !!!");
					break;
				case 3:
					System.exit(1);
					break;
				default:
					System.out.println("잘못된 입력으로 종료합니다");
					System.exit(1);
					break;
			}
		}
	}

}
