package ch03;

public class BinaryTest {

	public static void main(String[] args) {

		int num = 10;
		int bNum = 0B1010;
		int oNum = 012;
		int xNum = 0XA;
		
		//2진수, 8진수, 16진수 각각 식별자
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
		
		int cNum = 0b01000001; //65
		System.out.println(cNum);
		System.out.println((char)cNum);

	}
	
}
