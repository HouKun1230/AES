package AES;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.crypto.Data;
import javax.xml.bind.*;
//import org.apache.commons.codec.binary.Base64;

public class Encryption {
	
	 private static final String mode = "AES";
	 private static final byte[] keyValue = new byte[] { 'T', 'h', 'i', 's', 'I', 's', 'a', 'S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };
	 
	 public String Encrypt(String data) throws Exception
	 {
		 	Key key = generateKey();
	        Cipher c = Cipher.getInstance(mode);
	        c.init(Cipher.ENCRYPT_MODE, key);
	        byte[] encVal = c.doFinal(data.getBytes());
	        String encryptedValue = Base64.getEncoder().encodeToString(encVal);
	        return encryptedValue;
	 }
	 
	 public String Decrypt(String data) throws Exception
	 {
		 	Key key = generateKey();
	        Cipher c = Cipher.getInstance(mode);
	        c.init(Cipher.DECRYPT_MODE, key);
	        byte[] decordedValue = Base64.getDecoder().decode(data);
	        byte[] decValue = c.doFinal(decordedValue);
	        String decryptedValue = new String(decValue);
	        return decryptedValue;
	 }
	 
	 private static Key generateKey() throws Exception {
	        Key key = new SecretKeySpec(keyValue, mode);
	        return key;
	}
}
