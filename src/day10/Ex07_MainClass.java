package day10;

class User1 {
	public void func() {
		System.out.println("KORA : " + Ex07_final.KOREA);
	}
}

class User2 {
	public void func() {
		System.out.println("KORA : " + Ex07_final.KOREA);
	}
}

public class Ex07_MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 u1 = new User1();
		User2 u2 = new User2();
		u1.func();
		u2.func();
	}

}
