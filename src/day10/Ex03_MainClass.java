package day10;

public class Ex03_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 클래스 변수
		 - 프로그램 동작시 생성(메모리에 올라갈 때)
		 - 모든 곳에서 사용 가능하다
		 인스턴스(객체) 변수
		 - 인스턴스가생성될 때 (new 만났을때)
		 지역 변수
		 - 특정 범위에서 생성될때
		 - 해당 범위에서만 사용가능하다
		 - 또는 해당 범위에 종속되어 있는 곳까지 사용 가능
		 */
		/*
		int cnt = 0;
		if(cnt == 0) {
			int test = 1000;
			System.out.println(cnt);
			System.out.println(test);
		}
		System.out.println(test);
		*/
		Ex03_Variable ex = new Ex03_Variable();
		ex.variable01();
	}

}
