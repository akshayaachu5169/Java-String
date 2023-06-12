package stringTest;

public class StringSplitTest {

	public static void main(String[] args) {
		
		splitTest();
	}
	
public static void splitTest() {
	
	String a ="vcentry technologies chennai";
	//String a="www.vcentry.com";
String b[] =	a.split("e");//   "\\s","\\."
//		for(int i=0;i<b.length;i++) {
//			System.out.println(b[i]);
//			
//		}
	 for (String st : b) {
		System.out.println(st);
	}	
		
}
}