package conceptsOfOOPs;
public class Constructor {

	int maths;
	int java;
	int practical;

	
public Constructor(int mat,int jav, int pract) {
	maths=mat;
	java=jav;
	practical=pract;

}
public void marks() {
	System.out.println("Maths Mark is: "+maths);
	System.out.println("Java Mark is: "+java);
	System.out.println("Practical Mark is: "+practical);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Constructor c = new Constructor(94,88,100);
	c.marks();
	Constructor c2 = new Constructor(1,1,1);
	c2.marks();

}
}
