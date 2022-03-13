
public class Strings {

	public static void main(String[] args) {
		//Normal String Methods in Java
		String a ="Hello"; // String Literal - Mutable
		String b ="Hello";
		//a.concat("World"); is not directly work so create one more String c and store concatenated value 
		String c=a.concat(" ").concat("World");
		System.out.println(c);
		//a.concat("World"); is achieve directly without creating other string by using StringBuilder
		
		//equals(Camper blindly) and == (Compare with references) methods
		String x ="Hello"; // String Literal - Mutable
		String y ="Hello";
		
		String s = new String("Hello");
		String s1 = new String("Hello");//String class creates new object every time in memory
		System.out.println(a.equals(b));//Written true
		System.out.println(a==b);//Written true (Because references is also same)
		System.out.println(a.equals(s));//Written true(Because references is no matter here equals method check only content)
		System.out.println(a==s);//Written false(Because references is not same)
		System.out.println(s==s1);//Written false(Because creates new object every time in memory so references is not same)
		
		
		
		
		
		//StringBuffer - Mutable
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb);
		
		sb.insert(2, "AA");
		System.out.println(sb); //HeAAlloWorld
		
		sb.replace(4, 6, "LL");
		System.out.println(sb);//HeAALLoWorld
		
		sb.deleteCharAt(11);
		System.out.println(sb);//HeAALLoWorl
		
		sb.reverse();
		System.out.println(sb);//lroWoLLAAeH
		
		//StringBuilder - Mutable (All methods is like StringBuffer
		StringBuilder sb1 = new StringBuilder("Aasif");
		sb1.append(" ").append("Shaikh");
		System.out.println(sb1);
		
		//StringBuilder is not thread safe(means in parallel testing make some incorrect result)
		//StringBuilder is Not Synchronized , but it is faster
		
		

	}

}
