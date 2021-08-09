package day10;

import java.util.Scanner;

public class Ex06_final {
	public final String KOREA = "대한민국";
	public void func() {
		System.out.println("변경전 KOREA : " + KOREA);
		Scanner scanner = new Scanner(System.in);
//		KOREA = scanner.next();
		System.out.println("변경 후 KOREA : " + KOREA);
	}
}
