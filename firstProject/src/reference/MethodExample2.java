package reference;

public class MethodExample2 {
	public static void main(String[] args) {
		sum(24,55);  //�޼ҵ� ����. �Ű����Է����ֱ�
		int a = 45, b = 77; //intŸ���� ���������ϰ�
		sum(a,b);	//�ް��� �Է����൵ �ֿܼ� ���������.	
		multi(35,88);
		getArea(3.5);
		int res = getMax(a,b); //a�� b�� ���� 45,77���� ������ ��������
		System.out.println("ū ���� :" + res);
		double re = divide(5,3); // ���������Է��ϴ°�����divide�޼ҵ忡������ϴ°���double�̹Ƿ�double���������.
		System.out.println("ù��° ���� �ι�° ������ ������ :"+re);
	}
	
	// �� ������ �Է¹޾Ƽ� �� ���� ���� console���� �����ִ� ����� �޼ҵ� ����.
	public static void sum(int n1, int n2) { //�Ű������Է¶� Ÿ�����ǵ� �ʼ�!
		int sum = n1 + n2;
		System.out.println("�� ���� ��:"+sum);
	}
	
	// �� ������ �Է¹޾Ƽ� �� ���� ���� console���� �����ִ� ����� �޼ҵ� ����.
	public static void multi(int i1, int i2) {
		int multi = i1 * i2;
		System.out.println("�� ���� ��:"+multi);
	}
	
	// ������� ���̸� ������ִ� �޼ҵ�.
	public static void getArea(double side){
		double getArea = side * side;
		System.out.println("��������� ���̴�:"+getArea);
	}

	// �� �� �߿��� ū ���� ��ȯ���ִ� �޼ҵ�.
	// '��ȯ'���شٴ� �� void(��ȯ�Ұ��̾���)�������� ��ȯ������� ���� Ÿ���� �Է�. ���⼱int!
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ?num1 : num2; //result��� ������ �μ��߿���ū���������ϴº����� ����
		return result; //��ȯ���� result
	}
	
	// �� ������ �Է¹޾Ƽ� ù��° / �ι�° ���� ����� ��ȯ.
	public static double divide(int a, int b) {
		double result = a/b;
		return result;
	}
}