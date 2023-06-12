package stringTest;

public class StringLiteralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="vcentry";
		String b ="vcentry";//shared memory->pool memory
		String c ="vcentry";
System.out.println(a);
System.out.println(b);
System.out.println(c);

//checks the memory id is equal
System.out.println(a==b);//true
System.out.println(b==c);//true
System.out.println("---------------");
//checks the value is equal
System.out.println(a.equals(b));
System.out.println(b.equals(c));
	}

}
