package com.gupaoedu.user.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuliugen on 2017/6/25.
 */
public class RSAKeysUtil {

    public static final String KEY_ALGORITHM = "RSA";
    public static final String SIGNATURE_ALGORITHM = "MD5withRSA";
    private static final String PUBLIC_KEY = "RSAPublicKey";
    private static final String PRIVATE_KEY = "RSAPrivateKey";

    public static void main(String[] args) {
        Map<String, Object> keyMap;
        try {
            keyMap = initKey();
            String publicKey = getPublicKey(keyMap);
            System.out.println(publicKey);
            /*MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDFcD3vRe9X6eWfiQzxGuE5V8IrMC1d3JHVSP8p
            4qkUU3voxtNBDsx75dc5Odgb5TB4669b4V5VCtF4KxpLEdm0t1KP+sgnq9M6ZoT1sxlChtEajA6p
            tXfiN/VamJ4wKeamMOk5LWMwmD3NpRBzTKpchNfJReZjdq3HvfkH59A/4QIDAQAB*/
            String privateKey = getPrivateKey(keyMap);

            /*MIICeQIBADANBgkqhkiG9w0BAQEFAASCAmMwggJfAgEAAoGBAMVwPe9F71fp5Z+JDPEa4TlXwisw
            LV3ckdVI/yniqRRTe+jG00EOzHvl1zk52BvlMHjrr1vhXlUK0XgrGksR2bS3Uo/6yCer0zpmhPWz
            GUKG0RqMDqm1d+I39VqYnjAp5qYw6TktYzCYPc2lEHNMqlyE18lF5mN2rce9+Qfn0D/hAgMBAAEC
            gYEArGmdzCrYHX9lQ/GcWZfNghO+vZQuqb6JoyVBncQPPm7Az7+Aj1lq++70CUcYDxQPRikaUzP0
                    +nKeBUAuj8ugvgHanDTMOtTX8z/VidP7UWR7qUAtFscl8i/TFqDTgVraq17xS6OA+iV1aUYt4QoH
            UnQIuzWyx+m0/UF2qtTHioECQQD8rd2mxw7CpQFNiUmgrwlkC8mF6FPieQ+h4XX4D05JRMXNirX1
            si4Xl3VjmUHbBJCOdbfeLYLtnksHVvdoW8mZAkEAyAiFD+30KdLMv81inZRPRR68jQ8thRHD1/rV
            EeGLvYbW8UqM9yrlgWTxj/StoPRRFkxiqbp68DnRJ/KtwmhliQJBAPjdtcWhoOQM6G+ZnC7qtvEW
            uvFsldIlMkRab3pWeOCpH7kFuZm4WLVbs37ZX4d7w3TMdMAbSy0GDxe3jA34+WECQQCjza5BDCfM
            c+3tBuBBkCiVvoTCsnIhLRoF7Ea8/Mi07A1pzBXBdaQ5IJNbwg7I5ijcrLKCsM1pmL75CpZVw62Z
            AkEAwhmgfBtuw05Uv8yvYaPkDQBP3o79cXOJsbW45rg3KlY6MtDNmk3cT8NK1s863PV4Dbkc5hGw
            Gubm5/WCgjEyow==*/
            System.out.println(privateKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getPublicKey(Map<String, Object> keyMap) throws Exception {
        Key key = (Key) keyMap.get(PUBLIC_KEY);
        byte[] publicKey = key.getEncoded();
        return encryptBASE64(key.getEncoded());
    }

    public static String getPrivateKey(Map<String, Object> keyMap) throws Exception {
        Key key = (Key) keyMap.get(PRIVATE_KEY);
        byte[] privateKey = key.getEncoded();
        return encryptBASE64(key.getEncoded());
    }

    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    public static Map<String, Object> initKey() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(KEY_ALGORITHM);
        keyPairGen.initialize(1024);
        KeyPair keyPair = keyPairGen.generateKeyPair();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        Map<String, Object> keyMap = new HashMap<String, Object>(2);
        keyMap.put(PUBLIC_KEY, publicKey);
        keyMap.put(PRIVATE_KEY, privateKey);
        return keyMap;
    }
}
