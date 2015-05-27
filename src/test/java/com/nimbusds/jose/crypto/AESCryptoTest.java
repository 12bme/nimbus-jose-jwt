package com.nimbusds.jose.crypto;


import junit.framework.TestCase;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;


/**
 * Tests static AES crypto provider constants and methods.
 *
 * @author Vladimir Dzhuvinov
 * @version $version$ (2015-05-27)
 */
public class AESCryptoTest extends TestCase {


	public void testClassAlgorithmSupport() {

		assertEquals(6, AESCryptoProvider.SUPPORTED_ALGORITHMS.size());

		assertTrue(AESCryptoProvider.SUPPORTED_ALGORITHMS.contains(JWEAlgorithm.A128KW));
		assertTrue(AESCryptoProvider.SUPPORTED_ALGORITHMS.contains(JWEAlgorithm.A192KW));
		assertTrue(AESCryptoProvider.SUPPORTED_ALGORITHMS.contains(JWEAlgorithm.A256KW));
		assertTrue(AESCryptoProvider.SUPPORTED_ALGORITHMS.contains(JWEAlgorithm.A128GCMKW));
		assertTrue(AESCryptoProvider.SUPPORTED_ALGORITHMS.contains(JWEAlgorithm.A192GCMKW));
		assertTrue(AESCryptoProvider.SUPPORTED_ALGORITHMS.contains(JWEAlgorithm.A256GCMKW));
	}


	public void testClassEncryptionMethodSupport() {

		assertEquals(8, AESCryptoProvider.SUPPORTED_ENCRYPTION_METHODS.size());

		assertTrue(AESCryptoProvider.SUPPORTED_ENCRYPTION_METHODS.contains(EncryptionMethod.A128CBC_HS256));
		assertTrue(AESCryptoProvider.SUPPORTED_ENCRYPTION_METHODS.contains(EncryptionMethod.A192CBC_HS384));
		assertTrue(AESCryptoProvider.SUPPORTED_ENCRYPTION_METHODS.contains(EncryptionMethod.A256CBC_HS512));
		assertTrue(AESCryptoProvider.SUPPORTED_ENCRYPTION_METHODS.contains(EncryptionMethod.A128GCM));
		assertTrue(AESCryptoProvider.SUPPORTED_ENCRYPTION_METHODS.contains(EncryptionMethod.A192GCM));
		assertTrue(AESCryptoProvider.SUPPORTED_ENCRYPTION_METHODS.contains(EncryptionMethod.A256GCM));
		assertTrue(AESCryptoProvider.SUPPORTED_ENCRYPTION_METHODS.contains(EncryptionMethod.A128CBC_HS256_DEPRECATED));
		assertTrue(AESCryptoProvider.SUPPORTED_ENCRYPTION_METHODS.contains(EncryptionMethod.A256CBC_HS512_DEPRECATED));
	}
}
