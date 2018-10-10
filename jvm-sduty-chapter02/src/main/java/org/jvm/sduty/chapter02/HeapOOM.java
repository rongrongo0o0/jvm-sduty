package org.jvm.sduty.chapter02;

import java.util.ArrayList;
import java.util.List;

import org.jvm.sduty.chapter02.domain.OOMObject;

/**
 * VM args:Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 
 * @Title:HeapOOM.java
 * @Package:org.jvm.sduty.chapter02
 * @Description:
 * @author:yangrong
 * @date:2018年10月10日下午2:10:18
 * @updater:
 * @version:V1.0
 * @updates:
 */
public class HeapOOM {
	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<OOMObject>();
		while (true) {
			list.add(new OOMObject());
		}
	}
}
