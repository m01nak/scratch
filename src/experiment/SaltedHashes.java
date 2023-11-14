package experiment;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

public class SaltedHashes {
    private static final SecureRandom randomGenerator =  new SecureRandom();

    public static void main(String[] args) {
        System.out.println(Base64.getEncoder().encodeToString(getSalt()));
        System.out.println(Base64.getEncoder().encodeToString(getSalt()));
        System.out.println(Base64.getEncoder().encodeToString(getSalt()));
    }

    private static byte[] getSalt() {
        byte[] salt = new byte[16];
        randomGenerator.nextBytes(salt);
        return salt;
    }
}
