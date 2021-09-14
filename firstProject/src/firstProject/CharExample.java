package firstProject;

public class CharExample {
	public static void main(String[] args) {
		// int(숫자), String(문자), boolean(참거짓), char(정수) 
        // byte(1byte) < char , short(2byte) < int(4byte) < long(8byte)
		char myFirstCharType = 97;
	
	System.out.println(myFirstCharType);
	
	byte b1 = 10; // 1byte(8bit) || 
	// 0 0 0 0 0 0 0 0 => 1byte
	// 2^1 2^2 2^3 ... 2^8 => 256가지 경우의 수를 나타낼 수 있음.(-128 ~ 127)
	// 
	b1 = 127;
	b1++; // b1 = b1 +1;
	System.out.println(b1);
	
	short s1 = 0; // -128 + 0
	//short -32768 ~ 32767
	int result =(b1 + s1); //short + short, 사칙연산자는 int타입

	System.out.println(Integer.MAX_VALUE);
	
	long fakeLong = 214748364L;
	
	}
}
