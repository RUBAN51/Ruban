package conceptsOfOOPs;

public class MethodOverloading 
	{
	static int max(int a, int b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	static double max(double a, double b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	static char max(char a, char b) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(10,15));
		System.out.println(max(15.5,20.5));
		System.out.println(max('r','s'));
	}
}
