package DemoExceptionHandling;

public class C_02_CheckedException_ThrowsDeclaration {
	int x = 143;
	public void m1() {
		System.out.println("Value of x is:"+x);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		C_02_CheckedException_ThrowsDeclaration obj = new C_02_CheckedException_ThrowsDeclaration();
		obj.m1();
		Thread.sleep(0);

	}

}
