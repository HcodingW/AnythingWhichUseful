package tryy;
//此程序为异常初探
public class Tx {

	// 定义一个方法,抛出 数组越界和算术异常（多个异常 用 "," 隔开）
	public void test_exception1(int x) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		System.out.println(x);
		if (x == 0) {
			System.out.println("没有异常");
			return;
		}

		// 数据越界异常
		else if (x == 1) {
			int[] a = new int[3];
			a[3] = 5;
		}

		// 算术异常
		else if (x == 2) {
			int i = 0;
			int j = 5 / 0;
		}
	}

	public static void main(String[] args) {
		Tx tx1 = new Tx();
		// 调用会抛出异常的方法，用try-catch块
		try {
			tx1.test_exception1(0);
		} catch (Exception e) {
			System.out.println(e);
		}
		// 数组越界异常
		try {
			tx1.test_exception1(1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界异常:" + e);
		}

		// 算术异常
		try {
			tx1.test_exception1(2);
		} catch (ArithmeticException e) {
			System.out.println("算术异常:" + e);
		}

		//没有异常也要抛出异常，使用 throw抛出异常(可以抛出异常对象，也可以抛出异常对象的引用)
		try {
			ArrayIndexOutOfBoundsException exc = new ArrayIndexOutOfBoundsException();
			
			throw exc;// new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("thorw抛出异常:" + e);
		}
	}

}
