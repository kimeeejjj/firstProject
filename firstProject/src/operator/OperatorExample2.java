package operator;

public class OperatorExample2 {
	public static void main(String[] args) {
		//����(�Ҵ�)������: ������ �� �������� �Ҵ�
		int num1, num2, result;
		num1 = num2 = 10;
		
		result = num1 + num2;
		
		result = result + 10;
		result += 10;  //�����ΰ� ���� �Ҹ���, ���մ��Կ�����

		result -= 10; //result = result - 10;
		result *= 10; //result = result * 10;
		result /= 10; //result�� 10���� ���� ���� �ٽ� result�� �ְڴ�
		result %= 10; //result�� 10���� ���� �� ���������� �ٽ� result�� �ְڴ�
		//long, int, byte �� ��밡��
		
		String str = "Hello";
		str = str + " World"; // Hello���� World�� �߰�
		str += " welcome"; // Hello World���� welcome�� �߰�
		System.out.println(str);
		
		//3�� ������
		int score = 80;
		boolean pass = (score > 60) ? true : false; //��ȣ �� ���� ���̳� �����̳�? �����ϸ� true, �ƴϸ� false
		String isOk = (score > 60) ? "Pass" : "Fail"; //T,F�ƴϰ� ���ڿ� ��µ� ����
			
				
		
}
}
