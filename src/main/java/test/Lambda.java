package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambda {

	public static void main(String[] args) {
		// 定义字符串数组
				String[] strArr = { "abc", "cd", "abce", "a" };
		 
				// 传统方法
				// 匿名内部类
				Arrays.sort(strArr, new Comparator<String>() {
					@Override
					public int compare(String s1, String s2) {
						return Integer.compare(s2.length(), s1.length());
					}
				});
//				// 输出排序结果
//				for (String s : strArr) {
//					System.out.println(s);
//				}
//				System.out.println("---------------------");
				// Lambda表达式
				Arrays.sort(strArr, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
		 
				// 输出
				for (String s : strArr) {
					System.out.println(s);
				}
		
			String ss= "fsdfdsfsd";
//			String length = testFun(ss,(a)->a.toUpperCase());
//			System.out.println(length);
		
			testCon(ss,(s)->System.out.println(s));
	}
	
	public static String testFun(String str, Function<String, String> fun) {
		// 执行
		String length = fun.apply(str);
		
		return length;
	}

	public static void testCon(String str, Consumer<String> con) {
		// 执行
		con.accept(str);
	}

	
	
	static List<Map<String,Object>> getManList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		for(int i=0;i<3;i++) {
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("age",12+i*3);
			map.put("name", "姓名"+(i*3));
			list.add(map);
		}
		return list;
	}
}
