package control;

public class ForTimesExample {
	public static void main(String[] args) {  //**for�������� �����ܸ����**
		
		for(int j=2; j<=9; j++ ) { // �ݺ��� �ȿ� �ݺ��� ���� �� ����
		
		int row = j;  //���⿡ ���� ���ڿ� �°� ������ ���. 3������ 3�����
		System.out.println("====" + row + "��====");
		for(int i=1; i<=9; i++) { 
			System.out.printf("%d * %d = %d\n", row,i,(row*i));
		}
	 }
   }
}
