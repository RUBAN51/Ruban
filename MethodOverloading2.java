package conceptsOfOOPs;

public class MethodOverloading2 {
	static void testing() {
		System.out.println("No Arguments");
	}
	static void testing(int a, int b) {
		System.out.println("Two Arguments");
	}
	static void testing(int a, int b, int c) {
		System.out.println("Three Arguments");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testing();
		testing(10,20);
		testing(10,20,30);

	}

}
