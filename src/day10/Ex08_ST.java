package day10;

import java.util.Scanner;

public class Ex08_ST {
// 인스턴스 변수로 선언
// 입력, 출력 기능으로 나눔
	public int age;
	public String name;
	public void display() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력");
		name = scanner.next();
		System.out.println("나이 입력");
		age = scanner.nextInt();
		writer(age, name);
	}
	private void writer(int age, String name) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
