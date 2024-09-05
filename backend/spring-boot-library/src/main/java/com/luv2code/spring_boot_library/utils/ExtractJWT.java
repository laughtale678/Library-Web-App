package com.luv2code.spring_boot_library.utils;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

//used to extract info from JWT
public class ExtractJWT {
    //extracting represents target string
    public static String payloadJWTExtraction(String token, String extraction) {
        token.replace("Bearer", "");
        //在正则表达式中，. 是一个通配符，表示匹配任意单个字符（除了换行符）。
        //在正则表达式中，要表示字面上的点号 .，需要使用 \.
        //第一个 \ 用于转义，第二个 \ 是正则表达式中的实际点号
        String[] chunks = token.split("\\.");
        Base64.Decoder decoder = Base64.getUrlDecoder();
        //second part of JWT is payload
        String payload = new String(decoder.decode(chunks[1]));
        String[] entries = payload.split(",");
        Map<String, String> map = new HashMap<>();

        for(String entry : entries) {
            String[] keyValue = entry.split(":");
            if(keyValue[0].equals(extraction)) {
                int remove = 1;
                if(keyValue[1].endsWith("}")) {
                    remove = 2;
                }
                //remove{}
                keyValue[1] = keyValue[1].substring(0, keyValue[1].length() - remove);
                keyValue[1] = keyValue[1].substring(1);
                map.put(keyValue[0], keyValue[1]);
            }
        }
        if(map.containsKey(extraction)) {
            return map.get(extraction);
        }
        return null;
    }
}
