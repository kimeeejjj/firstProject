package control;

public class conditionExample {
	public static void main(String[] args) {
		// <if-else ����>
		// 90�̻� A, 80�̻� B, 70�̻� C, 60�̻� D, �׿� F
		int score = 55;
		
		if(score >= 90) {
			System.out.println("A����");
		} else if (score >= 80) {
			System.out.println("B����");
		} else if (score >= 70) {
			System.out.println("C����");
		} else if (score >= 60) {
			System.out.println("D����");
		} else {System.out.println("F����");}
		//else���� if�������θ� ���� ���ϸ� ���� 90���̻��ΰ�� ��°��� A,B,C,D�������� ���� ��
		//��, ���� ������ ���;� �Ҷ��� if�� ������ ���� �Ѱ��� ���� ���;� �� ���� else����ϱ�
		
		System.out.println("��.");
	}
}
