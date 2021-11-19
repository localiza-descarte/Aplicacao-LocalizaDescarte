package br.start.localiza.dao;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util {
	/**
	 * Criptografa uma string usando MD5 Este método deve ser usado em duas
	 * ocasiões: 1) ao criar um novo usuário, no service, antes de enviar para o DAO
	 * 2) ao efetuar login, antes de enviar para o DAO o login/senha para ser
	 * verificado
	 * 
	 * @param senha
	 * @return senha criptografada
	 * @throws NoSuchAlgorithmException - reporta falhas na tentativa de
	 *                                  criptografar
	 */
	public static String md5(String senha) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			BigInteger hash = new BigInteger(1, messageDigest.digest(senha.getBytes()));
			return hash.toString(16);
		} catch (Exception e) {
			return "";
		}
	}
}
