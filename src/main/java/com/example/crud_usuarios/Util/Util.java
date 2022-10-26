package com.example.crud_usuarios.Util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.tomcat.util.net.openssl.ciphers.MessageDigest;

import java.nio.charset.StandardCharsets;

public class Util {
    public static String hash_sha256(String text){
        return DigestUtils.sha256Hex(text);
    }
}
