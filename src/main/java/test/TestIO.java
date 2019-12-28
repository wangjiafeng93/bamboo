package test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.IOUtils;

/**
 * TODO
 * 
 * @Author wangjiafeng
 * @version v1.0
 * @since 下午 18:33 2019-12-03
 **/
public class TestIO {
	public static void main(String[] args) {
//		getInputStream1();
//		getInputStream3();
		ntkotest();
	}

	public static void ntkotest() {
		System.out.println("开始");
		try {
			InputStream is = new FileInputStream("e://test.doc");//这个构造方法默认new File("")
			OutputStream os = new FileOutputStream("e://testout3.doc");
			byte[] bytes = new byte[1024];
			int byteCount = 0;
			while ((byteCount = is.read(bytes)) != -1) {
//                Thread.sleep(1);
				os.write(bytes,0,byteCount);
			}
		} catch (IOException e) {
		} finally {
		}
	}
	public static void getInput(){
		try (InputStream inputStream = null;
			 OutputStream outputStream = new FileOutputStream("e://testout123.doc")) {
			IOUtils.copy(inputStream,outputStream);
		} catch (Exception e) {
		}
	}

	public static InputStream getInputStream1() {
		try {
			File file = new File("e://test1.txt");
			FileInputStream fileInputStream  = new FileInputStream(file);//这个构造方法默认new File("")
			byte[] bytes = new byte[1024];
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			bufferedInputStream.read(bytes);
			bufferedInputStream.mark(1024);
			bufferedInputStream.reset();
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			InputStream inputStream = (InputStream)fileInputStream;
//			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//			String readLine = bufferedReader.readLine();
//			int read = bufferedReader.read();
//			int read2 = bufferedReader.read(new char[2048]);
			int read3 = inputStreamReader.read();
//			System.out.println(read);
//			System.out.println(read2);
//			System.out.println(read3);
			String content = IOUtils.toString(inputStream,"UTF-8");
		} catch (FileNotFoundException e) {
			System.out.println("异常：FileNotFoundException");
		} catch (IOException e) {
			System.out.println("异常：FileNotFoundException");
		}
		return null;
	}
	//
	public static InputStream getInputStream2() {
		try {
			FileInputStream fileInputStream  = new FileInputStream("e://test1.txt");
			List<String> readLines = IOUtils.readLines(fileInputStream, StandardCharsets.UTF_8);
			System.out.println(readLines);
		} catch (FileNotFoundException e) {
			System.out.println("异常：FileNotFoundException");
		} catch (IOException e) {
			System.out.println("异常：FileNotFoundException");
		}
		return null;
	}
	
	public static InputStream getInputStream3() {
		Reader fr = null;
		int length = 0;
		char ch [] = null;
		try {
			fr =new FileReader("e://test.doc");//里面new了FileInputStream
			//创建中转站数组，存放读取的内容
			ch = new char[2048];
			//读取文件内容到ch数组中
			length = fr.read(ch);
			//输出保存在ch数组中文件内容
			System.out.println(new String(ch ,0,length));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
