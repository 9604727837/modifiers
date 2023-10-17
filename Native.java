package declaration_modifiers;
class client {
	
}

public class Native {
	static {
		System.loadLibrary("native library path");
	}
	public native void m1();
	

	public static void main(String[] args) {
		Native n=new Native();
		n.m1();

	}

}
