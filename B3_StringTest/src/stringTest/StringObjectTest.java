package stringTest;

public class StringObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = new String ();
String b = new String ("Vcentry");//heap memory
String c = new String ("Vcentry");
a="Vcentry";//shared memory

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println("--------------");
//checks the memory id is equal
System.out.println(a==b);//false
System.out.println(b==c);//false
System.out.println("---------------");

//checks the value is equal
System.out.println(a.equals(b));
System.out.println(b.equals(c));

	}

}
