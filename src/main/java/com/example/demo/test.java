package com.example.demo;

/**
 * @author zhaChengwei
 * @date 2019-01-25 10:59
 */
public class test {

    public static void main(String[] args) {
     String s="时创行外联测同行绑定户^|CNY^|200201803000014^|0001326289400226144184^|0000002009^|1^|^|1^|^|^|15896352154^|沈阳^|^|10^|210104198212314316^|1^|15896352154^|15896352154@qq.com^|3^|BPI031^|子账户号已存在，请勿重复^|^|^|^|^|^|^|";
        String[] split = s.split("\\^\\|");
        System.out.println(split[0]);
    }
}
