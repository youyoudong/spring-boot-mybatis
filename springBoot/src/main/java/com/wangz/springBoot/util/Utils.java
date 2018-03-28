package com.wangz.springBoot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类
 * @author wangz
 * @date 2018-03-28
 */
public class Utils {

    /**
     * 日期格式化(yyyy-MM-dd)
     */
    private static SimpleDateFormat dateSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 时间格式化精确到时分秒(yyyy-MM-dd HH:mm:ss)
     */
    private static SimpleDateFormat timeSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 时间转字符串格式(精确到时分秒)
     * @param date
     * @return String
     */
    public static String timeToString(Date date){
        String _time = timeSdf.format(date);
        return _time;
    }

    /**
     * 日期转字符串格式
     * @param date
     * @return String
     */
    public static String dateToString(Date date){
        String _date = dateSdf.format(date);
        return _date;
    }
}
