package com.ityuan.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    //日期转换成字符串
    public static String date2string(Date date,String patt){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(patt);
        String formate=simpleDateFormat.format(date);
        return formate;
    }
    //字符串转换成日期
    public static Date string2date(String str,String patt) throws ParseException {
        //指定模式
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(patt);
        Date parse=simpleDateFormat.parse(str);
        return parse;
    }
}
