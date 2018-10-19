/** 
 * <pre>项目名称:maven-test 
 * 文件名称:TimeUtil.java 
 * 包名:com.jk.sss.util 
 * 创建日期:2018年8月10日下午5:04:55 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * <pre>项目名称：maven-test    
 * 类名称：TimeUtil    
 * 类描述：    
 * 创建人：尚帅帅 cht_java@126.com    
 * 创建时间：2018年8月10日 下午5:04:55    
 * 修改人：尚帅帅 cht_java@126.com  
 * 修改时间：2018年8月10日 下午5:04:55    
 * 修改备注：       
 * @version </pre>    
 */
public class TimeUtil {
	
	public static String format(Date date,String fromat ) {
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat(fromat);
		 String format2 = simpleDateFormat.format(date);
		 return format2;
	}
	public static String format(Date date ) {
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		 String format2 = simpleDateFormat.format(date);
		 return format2;
	}

}
