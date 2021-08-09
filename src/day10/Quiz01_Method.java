package day10;

public class Quiz01_Method {
	private int random;
	private int height = 100;
	private String name;
	
	public void setRandom() {
		random = (int) ((Math.random() * 98) + 1);
	}
	
	public int check(int num, int count, String name) {
		if(num == random) {
			System.out.println(name + "´Ô " + count + "È¸ ¸¸¿¡ ¸ÂÃè½À´Ï´Ù !!!");
			return 0;
		} else if(num >= random) {
			System.out.println("=== Down ===");
			return 1;
		} else {
			System.out.println("=== UP ===");
			return 1;
		}
	}
	
	public int modifyHeight(int count, String name) {
		if(count < height) {
			height = count;
			this.name = name;
			return 1;
		}
		return 0;
	}
	
	public int getHeight() {
		return height;
	}
	public String getName() {
		return name;
	}
	
}
