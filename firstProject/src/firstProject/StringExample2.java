package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		String name = "������";
		int age = 25;
		
		 //�̸��� ������, ���̴� 25
		System.out.println("�̸��� "+name+", ���̴� "+age);
		System.out.printf("�̸��� %s, ���̴� %d", name, age);
		
		byte b1 = -90;
		byte b2 = 10;
		int result = b1 + b2;
		System.out.println(b1 + "+" + b2 + "=" + result);
		
		//isLarger
		//result > 0
		//if(100>10) {
				
		//}else {
		//}
		boolean isLarger = result > 0;
		if(isLarger) {
			System.out.println("0���� Ů�ϴ�(����Դϴ�.)");
		}else {System.out.println("0���� �۽��ϴ�(�����Դϴ�.)");};
		
		long number1 = 2200000000l;
		double number2 = 78;
		double number3 = 8;
		double avg = number2/number3;
		System.out.println(number2 + "��" + number3 + "�� ���� ���" + ":" + avg);
		
		long nb1 = 2200000000l;
		double nb2 = 78;
		double nb3 = 8;
		double sumavg = (nb1+nb2+nb3)/3;
		System.out.println("��հ�:"+sumavg);
	}
}
