package control;
import java.util.Scanner;
public class KimEunJi {
	public static void main(String[] args) {
	//if������ for(�Ǵ� while����)���, break, continue���
	//���� -> �ڵ�.
		
	//�ֻ��� �� ���߱�
	int num = (int)(Math.random()*6)+1;
	int cnt = 0;
			
		System.out.println("<�ֻ��� ����>");
		System.out.println("������ �ֻ����� ���ڸ� ���纸����.");
	
	while(true){
		Scanner scn = new Scanner(System.in);
		cnt++;
		
		int num2 = scn.nextInt();
		if(num2 == num) {
			System.out.println("�����Դϴ�.");
			break;
		} else if(num2 >= num) {
			System.out.println("���亸�� ���� �� �Դϴ�.");
			continue;
		} else if(num2 <= num) {
			System.out.println("���亸�� ���� �� �Դϴ�.");
		}
	} System.out.printf("�����մϴ�.%d�� ���� ���߼̳׿�!",cnt);
	
		
		
	}
		
}


