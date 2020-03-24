package com.thunisoft.bamboo;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.beanutils.BeanUtils;

public class Test {

	// 公有的静态域，来说明该类只能有一个实例（实例化一次后，后面都是同一个实例）
	public static final Test INSTANCE = new Test();
	public static final Test INSTANCE1 = new Test();
	private Test() {
	}// 将构造函数定义为私有变量后，就不能在外部去调用构造函数实例化类了

	public void sys() {
		String fsd= new StringBuffer().toString();
		String ss= new StringBuffer().toString();
		String sss;
		System.out.println("******");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(3);
		list.add(1);
		System.out.println("排序前：");
		for(int n:list) {
			System.out.print(n+" ");
		}
		System.out.println();
		//使用Collections类对数据进行排序
		Collections.sort(list);
		System.out.println("排序后：");
		for(int n:list) {
			System.out.print(n+" ");
		}
	}
}