/** 
 * <pre>项目名称:maven-test 
 * 文件名称:ConstantsConf.java 
 * 包名:com.jk.sss 
 * 创建日期:2018年8月8日下午10:57:57 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.util;

/** 
 * <pre>项目名称：maven-test    
 * 类名称：ConstantsConf    
 * 类描述：    
 * 创建人：尚帅帅 cht_java@126.com    
 * 创建时间：2018年8月8日 下午10:57:57    
 * 修改人：尚帅帅 cht_java@126.com  
 * 修改时间：2018年8月8日 下午10:57:57    
 * 修改备注：       
 * @version </pre>    
 */
public class ConstantsConf {
   public static final String NAV_CACHE="navcache";
   public static final String LOGIN_CODE="loginCode";
   public static final String IP_CITY="ipcity";
   
   /**
    * 短信验证码过期时间
    */
   public static final Integer  LOGIN_CODE_TIME_OUT= 5;
   
   /**
    * 一分钟不能重复获得锁
    */
   public static final String LOGIN_CODE_LOCK="loginCodeLock";
   /**
    * 
    */
   public static final String SMS_URL="https://api.miaodiyun.com/20150822/industrySMS/sendSMS";
   public static final String ACCOUNTSID="9ca1123322ca49d2819f20216f95c1d6";
   public static final String TEMPLATEID="516600278";
   public static final String AUTH_TOKEN="128b83d19e144f12b4777a5b4df6d47d";
   public static final String WEATHER_URL="http://ip.taobao.com/service/getIpInfo.php";
   public static final String CITY_WEATHER_URL="https://www.sojson.com/open/api/weather/json.shtml";
   public static final String WRATHERKEY="wratherKey";
	
	/**
	 * 安全认证密码
	 */
	 public static final String AUTH="admin";

   
}
