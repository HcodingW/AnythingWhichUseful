package tryy;
//�˳���Ϊ�쳣��̽
public class Tx {

	// ����һ������,�׳� ����Խ��������쳣������쳣 �� "," ������
	public void test_exception1(int x) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		System.out.println(x);
		if (x == 0) {
			System.out.println("û���쳣");
			return;
		}

		// ����Խ���쳣
		else if (x == 1) {
			int[] a = new int[3];
			a[3] = 5;
		}

		// �����쳣
		else if (x == 2) {
			int i = 0;
			int j = 5 / 0;
		}
	}

	public static void main(String[] args) {
		Tx tx1 = new Tx();
		// ���û��׳��쳣�ķ�������try-catch��
		try {
			tx1.test_exception1(0);
		} catch (Exception e) {
			System.out.println(e);
		}
		// ����Խ���쳣
		try {
			tx1.test_exception1(1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ���쳣:" + e);
		}

		// �����쳣
		try {
			tx1.test_exception1(2);
		} catch (ArithmeticException e) {
			System.out.println("�����쳣:" + e);
		}

		//û���쳣ҲҪ�׳��쳣��ʹ�� throw�׳��쳣(�����׳��쳣����Ҳ�����׳��쳣���������)
		try {
			ArrayIndexOutOfBoundsException exc = new ArrayIndexOutOfBoundsException();
			
			throw exc;// new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("thorw�׳��쳣:" + e);
		}
	}

}
