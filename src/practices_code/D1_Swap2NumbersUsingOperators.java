/**
 * 
 */
package practices_code;

/**
 * 
 */
public class D1_Swap2NumbersUsingOperators {

	
	public static void main(String[] args) {
		//Approach -01 (Use +&- Operators)
		int a=10, b =20;
	  System.out.println("Before Swapping values of a: "+ a+" and b :"+ b);
       a= a+b; //10+20=30
       b= a-b; //30-20=10
       a=a-b; //30-10=20
       System.out.println("After Swapping values of a: "+ a+" and b :"+ b);
       
     //Approach -02 (Use *& /Operators)
       int c=5, d=10;
       System.out.println("Before Swapping values of c: "+ c+" and d :"+ d);
       c= c*d; //5*10=50
       d= c/d; //50/10=5
       c=c/d; //50/5=10
       System.out.println("After Swapping values of c: "+ c+" and d :"+ d);
       
	}

}
