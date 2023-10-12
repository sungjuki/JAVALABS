package ch05;

public class IntVariavleTest {

	public static void main(String[] args) {
		
		byte bs = 127;
		// 128 -> error because of zero;
		// -128 is ok;
		
		System.out.println(bs);
		
		//int iVal = 12345678900; error
		long iVal = 12345678900L;
		System.out.println(iVal);
		
		// below situation is error
		// basically java use number as int;
		// so if you use number more than int using ~L;
		
		//long iVal2 = 12345678900;
		//System.out.println(iVal);
	}

}
