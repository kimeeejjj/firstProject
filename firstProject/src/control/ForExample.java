package control;

public class ForExample {
	public static void main(String[] args) {
		int cnt = 0;
		
		cnt += 1;
		System.out.printf("cnt: %d\n",cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n",cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n",cnt);

		cnt += 1;
		System.out.printf("cnt: %d\n",cnt);		
		//�̷��� �ݺ��Ǵ� �۾��� �ʿ��� ��� ����ϴ°� �ݺ���!
		//[�ݺ���1]. for(�ʱ�ȭ��(��������);�ݺ��ϴ�����;������)
		//->��������, ���������ǿ��ش��ϸ�1���ݺ�, ����������, ����������Ⱥ��������ǿ��ش��ϸ�1�����ݺ� ...
		System.out.println("====1������====");
		cnt = 0;
		for(int i=1; i<=5; i++) {  // i=i+1 => i+=1
			cnt += 1;
			System.out.printf("cnt: %d\n",cnt);
		}
		System.out.println("====2������====");
		cnt = 0;
		for(int i=1; i<=10; i+=2) { //i��2��Ŀ���ϱ�i��1,3,5,7,9�ΰ���ǰ�����µ�)
			cnt += 1;
			System.out.printf("cnt: %d\n",cnt);
		}
		System.out.println("====cnt+=i====");
		cnt = 0;
		for(int i=1; i<=3; i++) {  //�����ٽð��þ��!!!!
			cnt += i;
			System.out.printf("i: %d, cnt: %d\n",i, cnt);
		}
		System.out.println("====�ٽ�====");
		int tempValue = (int)(Math.random()*10)+1; //�����ٽð��ñ�!!!!
		for(int i=1; i<=5; i++) { 
			tempValue = (int)(Math.random()*10)+1; //�������ݺ���{}�ȿ��־�����������ν���
			System.out.printf("%d��° ��:%d\n", i, tempValue);
		}
		System.out.println("====�ٽ�2====");
		int tempValue2 = 0;
		for(int i=1; i<=5; i++) { 
//			tempValue2 = 0;      �̰�쿡�º������ݺ���{}�ȿ��ְԵǸ鰪�̴�����������.�ۿ��־����.
			tempValue2 = (int)(Math.random()*10)+1;
			System.out.printf("%d��° ��:%d\n", i, tempValue2);
		}
		System.out.println("�ݺ�����");
		
	}
}
