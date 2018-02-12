package com.dreampig.arbitrationservice.common;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Token processor
 */
public class ArbitrationTokenProcessor {

    private long previous;
    private static  ArbitrationTokenProcessor atp = new ArbitrationTokenProcessor();

    public synchronized String generateToken(String sid,Boolean dymic){
        try {
            long current = System.currentTimeMillis();
            MessageDigest md = MessageDigest.getInstance("MD5");
            if(current == previous){
                current++;
            }
            previous = current;
            md.update(sid.getBytes());
            if(dymic){
                byte now[] = (new Long(current)).toString().getBytes();
                md.update(now);
            }
            return toHex(md.digest());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    private String toHex(byte[] digest) {
        StringBuffer sb = new StringBuffer((digest.length*2));
        for (int i = 0; i < digest.length; i++) {
            sb.append(Character.forDigit((digest[i] & 240)>>4,16));
            sb.append(Character.forDigit(digest[i] & 15,16));
        }
        return sb.toString();
    }
    public Date generateTokenExpair(){

        long current = System.currentTimeMillis();
        //在现在的时间基础上加10个小时
        current += (60 * 10) * 60 * 1000;
        Date date = new Date(current);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return date;
    }
}
