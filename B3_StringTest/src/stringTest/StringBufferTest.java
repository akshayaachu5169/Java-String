package stringTest;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb = new StringBuffer("vcentry ");
//creates an heap memory
//no concat since it gives only in runtime
System.out.println("Before append: " + sb);
System.out.println(sb.append("Technologies"));
System.out.println("After append: " + sb);
	}

}
