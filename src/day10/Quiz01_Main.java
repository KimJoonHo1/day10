package day10;

import java.util.Scanner;

public class Quiz01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Quiz01_Method ex = new Quiz01_Method();
		
		while(true) {
			System.out.println("=== UP & Down Game ===");
			System.out.println("1. ���ӽ���");
			System.out.println("2. ��������");
			System.out.println("3. ��������");
			System.out.print(">>>>> ");
			int sw = scanner.nextInt();
			
			switch(sw) {
				case 1:
					System.out.println("=== Start ===");
					ex.setRandom();
					int count = 0;
					System.out.print("�г����� �Է����ּ��� --> ");
					String name = scanner.next();
					while(true) {
						count++;
						System.out.print("Input Number -->");
						int num = scanner.nextInt();
						int result = ex.check(num, count, name);
						if(result == 0) {
							int check = ex.modifyHeight(count, name);
							if(check == 1) {
								System.out.println(name + "�� �ְ� ����� �����ϼ̽��ϴ�.");
							}
							break;
						}
					}
					break;
				case 2:
					int height = ex.getHeight();
					String heightName = ex.getName();
					System.out.println("�ְ� ����� " + heightName + "���� "+ height + "ȸ �Դϴ� !!!");
					break;
				case 3:
					System.exit(1);
					break;
				default:
					System.out.println("�߸��� �Է����� �����մϴ�");
					System.exit(1);
					break;
			}
		}
	}

}
