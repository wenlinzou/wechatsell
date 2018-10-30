package com.imooc.sell.utils;

import java.util.Random;

/**
 * @description
 * @author mqliu
 * @date 2018/10/30 9:43
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        //6位随机数
        Integer a = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(a);
    }
}
