
public class ExceptionEx12 {
	public static void main(String[] args) throws Exception {
		method1();
	} // main�޼����� ��
	
	static void method1() throws Exception {
		method2();
	} // method1�� ��
	
	static void method2() throws Exception {
		throw new Exception();
	} // method2�� ��

}
