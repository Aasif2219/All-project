
public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Aasif Shaikh",nstr="";
		char ch;
		System.out.println("Origional word: "+str);
//		System.out.println("Aasif Shaikh");
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
			
		}
		
		System.out.println("Reversed word are : " +nstr);

	}

}
