package it.linksmt.meucci.digitalbeach.converter;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.AttributeConverter;

public class ConverterCrittografia implements AttributeConverter<String, String>{
	
	Cipher cipher;
	String key = "Bar12345Bar12345"; // 128 bit key
	Key aesKey;
	
	@Override
	public String convertToDatabaseColumn(String attribute) {
		
		try {
			   String toEncrypt = attribute;
			   aesKey = new SecretKeySpec(key.getBytes(), "AES");
	           cipher = Cipher.getInstance("AES");  
	           cipher.init(Cipher.ENCRYPT_MODE, aesKey);
	           String encrypted = new String(Base64.getEncoder().encode(cipher.doFinal(toEncrypt.getBytes())), "UTF-8");
	           return encrypted;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		try {
			   String toDecrypt = dbData;
			   aesKey = new SecretKeySpec(key.getBytes(), "AES");
			   cipher = Cipher.getInstance("AES");
	           cipher.init(Cipher.DECRYPT_MODE, aesKey);
	           String decrypted = new String (cipher.doFinal(Base64.getDecoder().decode(toDecrypt.getBytes())), "UTF-8");
	           return decrypted;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
