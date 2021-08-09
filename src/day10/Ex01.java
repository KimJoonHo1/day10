package day10;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 오버로딩
		 - 메소드의 이름을 동일하게 만드는것
		 - 이름이 같기 때문에 서로 다른 메소드로 인식하기 위해서는
		   매개변수의 개수나 타입이 달라야 한다.
		 */
		Ex01_Class ex = new Ex01_Class();
		System.out.println(ex.sumFunc(10, 20));
		System.out.println(ex.sumFunc(10, 20, 30));
		System.out.println(ex.sumFunc(52.36, 41.5));
		System.out.println(ex.sumFunc("가나다라", "마바사"));
		System.out.println(ex.sumFunc(54.6, 7));
	}

}
