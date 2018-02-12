package com.dreampig.arbitrationservice.common;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AESUtils {
      
	// 加密
    public static byte[] Encrypt(byte[] sSrc, String sKey) throws Exception {
//        if (sKey == null) {
//            System.out.print("Key为空null");
//            return null;
//        }
//        // 判断Key是否为16位
//        if (sKey.length() != 16) {
//            System.out.print("Key长度不是16位");
//            return null;
//        }
        byte[] raw = sKey.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//"算法/模式/补码方式"
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(sSrc);

        return encrypted;
    }
    
    /**
	 * AES加密
	 * 
	 * @param content
	 *            待加密的内容
	 * @param encryptKey
	 *            加密密钥
	 * @return 加密后的byte[]
	 * @throws Exception
	 */
	public static byte[] aesEncryptToBytes(byte[] content, String encryptKey) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
        random.setSeed(encryptKey.getBytes());
		
		kgen.init(128,random);

		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(kgen.generateKey().getEncoded(), "AES"));

		return cipher.doFinal(content);
	}
    
//    // 解密
//    public static String Decrypt(String sSrc, String sKey) throws Exception {
//        try {
//            // 判断Key是否正确
//            if (sKey == null) {
//                System.out.print("Key为空null");
//                return null;
//            }
//            // 判断Key是否为16位
//            if (sKey.length() != 16) {
//                System.out.print("Key长度不是16位");
//                return null;
//            }
//            byte[] raw = sKey.getBytes("utf-8");
//            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
//            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
//            byte[] encrypted1 = sSrc.getBytes();
//            try {
//                byte[] original = cipher.doFinal(encrypted1);
//                String originalString = new String(original,"utf-8");
//                return originalString;
//            } catch (Exception e) {
//                System.out.println(e.toString());
//                return null;
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.toString());
//            return null;
//        }
//    }

    /** 
     * byte数组转化为16进制字符串 
     * @param bytes 
     * @return 
     */  
    public static String byteToHexString(byte[] bytes){       
        StringBuffer sb = new StringBuffer();       
        for (int i = 0; i < bytes.length; i++) {       
             String strHex=Integer.toHexString(bytes[i]);   
             if(strHex.length() > 3){       
                    sb.append(strHex.substring(6));       
             } else {    
                  if(strHex.length() < 2){    
                     sb.append("0" + strHex);    
                  } else {    
                     sb.append(strHex);       
                  }       
             }    
        }    
       return  sb.toString();       
    }  
    
    public static void main(String[] args) throws Exception {
        /*
         * 此处使用AES-128-ECB加密模式，key需要为16位。
         */
        String cKey = "1234567890123456";
        // 需要加密的字串
        String cSrc = "www.gowhere.so";
        System.out.println(cSrc);
        // 加密
        byte[] enString = Encrypt(cSrc.getBytes("utf-8"), cKey);
        System.out.println("加密后的字串是：" + byteToHexString(enString));
    }
}
