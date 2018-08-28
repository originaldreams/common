package com.originaldreams.common.util;

import java.util.Random;
import java.util.UUID;

/**
 * @author yangkaile
 * @date 2018-08-28 16:15:10
 */
public class StringUtils {
    public static final String numbersChar = "0123456789";
    public static final String allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static boolean isEmpty(String text){
        return text == null || text.isEmpty();
    }

    /**
     * 生成指定长度的数字字符串
     * @param length
     *  字符串长度
     * @return
     */
    public static String getNumbserString(int length) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(numbersChar.charAt(random.nextInt(numbersChar.length())));
        }
        return sb.toString();
    }

    public static String getAllCharString(int length){
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(allChar.charAt(random.nextInt(allChar.length())));
        }
        return sb.toString();
    }

    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","").toUpperCase();
    }
}
