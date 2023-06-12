package stringTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="vcentry ";
		StringBuilder sb = new StringBuilder(str);
		//creates an heap memory
		//no concat since it gives only in runtime
		System.out.println("Before append: " + sb);
	   sb.append("Technologies");
		System.out.println("After append: " + sb);
	}

}
