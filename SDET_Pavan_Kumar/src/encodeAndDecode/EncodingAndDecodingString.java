package encodeAndDecode;

import org.apache.commons.codec.binary.Base64;

public class EncodingAndDecodingString {

	public static void main(String[] args) {
		
		String src = "Aasif@123";
		byte[] encodedString = Base64.encodeBase64(src.getBytes());
		System.out.println("Encoded String is: " +new String(encodedString));
		
		byte[] decodedString = Base64.decodeBase64(encodedString);
		System.out.println("Encoded String is: " +new String(decodedString));
	
	}

}
