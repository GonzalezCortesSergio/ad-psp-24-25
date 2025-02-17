package com.salesianostriana.dam.jwt.security.security.googleauthentication;

import jakarta.annotation.PostConstruct;
import org.springframework.security.crypto.keygen.Base64StringKeyGenerator;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import java.security.SecureRandom;
import java.util.Arrays;

@Component
public class SecretKey {

    public static String generateSecretKey() {

        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[20];

        random.nextBytes(bytes);

        return Base64Coder.encodeString(bytes.toString()).toString();
    }

    @PostConstruct
    public void init() {

        System.out.println(generateSecretKey());
    }
}
