package practices_code;

public class D2_Swap2NumbersUsing3rdVariable {

	public static void main(String[] args) {
		int a=100,b=200;
		System.out.println("Before Swapping value of a :" + a +"  Value of b :"+ b);
		int t=a;//t is 3rd (Temporary)Variable
		a=b;
		b=t;
		System.out.println("After Swapping value of a :" + a +"  Value of b :"+ b);

	}

}
