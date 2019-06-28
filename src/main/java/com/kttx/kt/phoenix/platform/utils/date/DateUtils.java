package com.kttx.kt.phoenix.platform.utils.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 *
 *          ┌─┐       ┌─┐
 *       ┌──┘ ┴───────┘ ┴──┐
 *       │                 │
 *       │       ───       │
 *       │  ─┬┘       └┬─  │
 *       │                 │
 *       │       ─┴─       │
 *       │                 │
 *       └───┐         ┌───┘
 *           │         │
 *           │         │
 *           │         │
 *           │         └──────────────┐
 *           │                        │
 *           │                        ├─┐
 *           │                        ┌─┘    
 *           │                        │
 *           └─┐  ┐  ┌───────┬──┐  ┌──┘         
 *             │ ─┤ ─┤       │ ─┤ ─┤         
 *             └──┴──┘       └──┴──┘ 
 *               神兽保佑  代码无BUG!
 *
 *
 * @author : wangjia
 * @date 2019-06-04 21:06
 * 文件描述:
 *
 */
public class DateUtils {

    /**
     * <获取当前时间 格式yyyy-MM-dd hh:mm:ss> <功能详细描述>
     *
     * @return String
     * @see [类、类#方法、类#成员]
     */
    public static String getNowTime() {
        Date date = new Date();
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return df2.format(date);
    }

    /**
     * <获取当前时间 格式yyyy-MM-dd> <功能详细描述>
     *
     * @return String
     * @see [类、类#方法、类#成员]
     */
    public static String getNowDate() {
        Date date = new Date();
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        return df2.format(date);
    }

    /**
     * <获取当前时间 格式yyyyMMddhhmmss> <功能详细描述>
     *
     * @return String
     * @see [类、类#方法、类#成员]
     */
    public static String getRightTime() {
        Date date = new Date();
        SimpleDateFormat fm = new SimpleDateFormat("yyyyMMddHHmmss");
        return fm.format(date);
    }

    /**
     * <获取当前时间 格式yyyyMMdd> <功能详细描述>
     *
     * @return String
     * @see [类、类#方法、类#成员]
     */
    public static String getRightDate() {
        Date date = new Date();
        SimpleDateFormat fm = new SimpleDateFormat("yyyyMMdd");
        return fm.format(date);
    }

    /**
     * 获取yyyy-MM-dd HH:mm:ss时间,去掉末尾的.0
     *
     * @param strDate 2019-06-04 12:12:12.0
     * @return String
     */
    public static String removeTime0(String strDate) {
        return strDate.replace(".0", "");
    }

    /**
     * <查看两个时间点间隔多少天 当前时间和传进来的时间比较>
     *
     * @return String
     * @see [类、类#方法、类#成员]
     */
    public static Integer getTwoDateGap(String destDate) throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String nowDate = getNowDate();
        Date now = sdf.parse(nowDate);
        Date end = sdf.parse(destDate);
        long days=(end.getTime()-now.getTime())/(1000*3600*24);
        return Integer.valueOf(String.valueOf(days));
    }

    /**
     * 计算两个日期之间的时间差是否小于120秒
     *
     * @param time1
     * @return s
     * @throws Exception
     */
    public static Boolean getCountTimes(Long time1) throws Exception {
        long b = System.currentTimeMillis();
        int c = (int) ((b - time1) / 1000);
        try {
            if (c < 120) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
