package day10;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 �����ε�
		 - �޼ҵ��� �̸��� �����ϰ� ����°�
		 - �̸��� ���� ������ ���� �ٸ� �޼ҵ�� �ν��ϱ� ���ؼ���
		   �Ű������� ������ Ÿ���� �޶�� �Ѵ�.
		 */
		Ex01_Class ex = new Ex01_Class();
		System.out.println(ex.sumFunc(10, 20));
		System.out.println(ex.sumFunc(10, 20, 30));
		System.out.println(ex.sumFunc(52.36, 41.5));
		System.out.println(ex.sumFunc("�����ٶ�", "���ٻ�"));
		System.out.println(ex.sumFunc(54.6, 7));
	}

}
