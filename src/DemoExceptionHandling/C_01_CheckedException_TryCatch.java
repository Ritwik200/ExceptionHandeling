package DemoExceptionHandling;

public class C_01_CheckedException_TryCatch {
	int x =10;
	public void m1() {
		System.out.println("Value of x is:" + x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_01_CheckedException_TryCatch obj = new C_01_CheckedException_TryCatch();
		
		obj.m1();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
