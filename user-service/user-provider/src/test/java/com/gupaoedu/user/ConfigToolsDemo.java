package com.gupaoedu.user;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.Test;

public class ConfigToolsDemo {

    //上述生成的私钥
    private static final String PRIVATE_KEY_STRING = "MIICeQIBADANBgkqhkiG9w0BAQEFAASCAmMwggJfAgEAAoGBAMVwPe9F71fp5Z+JDPEa4TlXwiswLV3ckdVI/yniqRRTe+jG00EOzHvl1zk52BvlMHjrr1vhXlUK0XgrGksR2bS3Uo/6yCer0zpmhPWzGUKG0RqMDqm1d+I39VqYnjAp5qYw6TktYzCYPc2lEHNMqlyE18lF5mN2rce9+Qfn0D/hAgMBAAECgYEArGmdzCrYHX9lQ/GcWZfNghO+vZQuqb6JoyVBncQPPm7Az7+Aj1lq++70CUcYDxQPRikaUzP0+nKeBUAuj8ugvgHanDTMOtTX8z/VidP7UWR7qUAtFscl8i/TFqDTgVraq17xS6OA+iV1aUYt4QoHUnQIuzWyx+m0/UF2qtTHioECQQD8rd2mxw7CpQFNiUmgrwlkC8mF6FPieQ+h4XX4D05JRMXNirX1si4Xl3VjmUHbBJCOdbfeLYLtnksHVvdoW8mZAkEAyAiFD+30KdLMv81inZRPRR68jQ8thRHD1/rVEeGLvYbW8UqM9yrlgWTxj/StoPRRFkxiqbp68DnRJ/KtwmhliQJBAPjdtcWhoOQM6G+ZnC7qtvEWuvFsldIlMkRab3pWeOCpH7kFuZm4WLVbs37ZX4d7w3TMdMAbSy0GDxe3jA34+WECQQCjza5BDCfMc+3tBuBBkCiVvoTCsnIhLRoF7Ea8/Mi07A1pzBXBdaQ5IJNbwg7I5ijcrLKCsM1pmL75CpZVw62ZAkEAwhmgfBtuw05Uv8yvYaPkDQBP3o79cXOJsbW45rg3KlY6MtDNmk3cT8NK1s863PV4Dbkc5hGwGubm5/WCgjEyow==";

    @Test
    public void demo() throws Exception {
        //密码明文，也就是数据库的密码
        String plainText = "123456";
        System.out.printf(ConfigTools.encrypt(PRIVATE_KEY_STRING, plainText));
    }
}
