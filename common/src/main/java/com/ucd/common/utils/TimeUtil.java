package com.ucd.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeUtil {
    /**
     * 将字符串格式的时间转为毫秒值
     *
     * @param dateTime
     *            字符串时间（格式：2015 -12- 31 23:59:53）
     * @return
     */
    public static Long getLongFromString(String dateTime) {
        try {
            /**
             * 将字符串数据转化为毫秒数
             */
            StringBuffer buffer = new StringBuffer();
            char[] charArray = dateTime .toCharArray();
            for (int i = 0; i < charArray .length ; i ++) {
                if (Character.isDigit( charArray[i ])) {
                    buffer.append( charArray[i ]);
                }
            }
            dateTime = buffer.toString();
            System.out.println(dateTime);
            buffer = null;
            Calendar c = Calendar. getInstance();
            c.setTime( new SimpleDateFormat("yyyyMMddHHmmss" ).parse(dateTime ));
            return c .getTimeInMillis();
            /**
             * 将毫秒数转化为时间
             */
            // String sstime = "1339033320000";
            // Date date = new Date(sstime);
            //
            // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd
            // HH:mm:ss");
            //
            // System.out.println("毫秒数转化后的时间为：" + sdf.format(date));
        } catch (Exception e ) {
            e.printStackTrace();
        }
        return null ;
    }
    public static void main(String[] args) {

        System.out.println(getLongFromString("2015-12-31 23:59:53"));
    }

}
