package it.linksmt.meucci.digitalbeach.converter;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.AttributeConverter;

public class ConverterCrittografia implements AttributeConverter<String, String>{

	@Override
	public String convertToDatabaseColumn(String attribute) {
		
		try {
			String toEncrypt = attribute;
			final String chiave = "p2s5v8y/B?E(G+Kb";
			final Key chiaveAES = new SecretKeySpec(chiave.getBytes(), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, chiaveAES);
			byte[] encrypted = cipher.doFinal(toEncrypt.getBytes());
			return encrypted.toString();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		try {
		final String chiave = "p2s5v8y/B?E(G+Kb";
		final Key chiaveAES = new SecretKeySpec(chiave.getBytes(), "AES");
		String toDecrypt = dbData;
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, chiaveAES);
		String decrypted = new String(cipher.doFinal(toDecrypt.getBytes()));
		return decrypted;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
