package com.longwei.hive.function;

import org.apache.hadoop.hive.ql.exec.UDF;
/**
 * 自定义Hive Function
 * @author Administrator
 *
 */
public class SubStringFunction extends UDF {
	 public String evaluate(String src,int beginIndex, int endIndex ){
		 return src.substring(beginIndex, endIndex);
	 }
}
