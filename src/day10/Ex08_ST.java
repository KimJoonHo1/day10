package day10;

import java.util.Scanner;

public class Ex08_ST {
// �ν��Ͻ� ������ ����
// �Է�, ��� ������� ����
	public int age;
	public String name;
	public void display() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸� �Է�");
		name = scanner.next();
		System.out.println("���� �Է�");
		age = scanner.nextInt();
		writer(age, name);
	}
	private void writer(int age, String name) {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
