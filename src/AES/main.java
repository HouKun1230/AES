package AES;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String password = "password";
		Encryption en = new Encryption();
        String passwordEnc = en.Encrypt(password);
        String passwordDec = en.Decrypt(passwordEnc);

        System.out.println("Plain Text : " + password);
        System.out.println("Encrypted Text : " + passwordEnc);
        System.out.println("Decrypted Text : " + passwordDec);
	}

}
