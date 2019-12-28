package com.thunisoft.bamboo.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * Http请求工具
 */
public final class HttpConnectionUtils {


	private static final Logger logger = LoggerFactory.getLogger(HttpConnectionUtils.class);

	@Value("${systemid}")
	private static String systemid;
	@Value("${authcode}")
	private static String authcode;

	private HttpConnectionUtils(){

	}
	/**
	 * 发送http请求
	 * @param urlString 请求地址
	 * @return 是否成功
	 */
	public static boolean send(String urlString) {
		try {
			HttpURLConnection connection=(HttpURLConnection) new URL(urlString).openConnection();
			connection.setConnectTimeout(3000);
			connection.setRequestMethod("POST");
			connection.setDoInput(false);
			connection.setDoOutput(false);
			if (connection.getResponseCode()==200) {
				return true;
			}
		} catch (IOException e) {
			logger.error(String.format("网络连接错误：%s",e.getMessage()));
		}
		return false;
	}

	/**
	 * 发送请求
	 * @param urlString 地址
	 * @param params 参数
	 * @return 是否成功
	 */
	public static boolean send(String urlString, Map<String, Object> params) {
		StringBuilder builder = new StringBuilder(urlString+"?");
		try {
			for (Map.Entry<String,Object> entry:params.entrySet()){
				builder.append(entry.getKey() + "=" + URLEncoder.encode(entry.getValue().toString(), "UTF-8")+"&"  );
			}
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
		}
		return send(builder.toString());
	}

	/**
	 * 发送请求
	 * @param urlString 地址
	 * @param key 参数键
	 * @param value 参数值
	 * @return 是否成功
	 */
	public static boolean send(String urlString,String key,String value) {
		
		try {
			return send(urlString+"?"+key+"="+URLEncoder.encode(value, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			logger.error(e.getMessage());
		}
		return false;
	}
	
	/**
	 * 发送消息到消息平台接口
	 * @param urlString 请求地址：http://ip:port/msg-main/api/message/{version}
	 * @param paramsJson json格式的参数
	 * @return 请求接口返回json类型结果
	 * @throws IOException 消息平台连接异常
	 */
	public static String sendMsg(String urlString, String paramsJson) throws IOException {
		URL url = new URL(urlString);
		HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
		
		urlConnection.setRequestMethod("POST");
		urlConnection.setDoOutput(true);
		urlConnection.setDoInput(true);
		urlConnection.setUseCaches(false);
		urlConnection.setRequestProperty("Content-Type", "application/json");
		
		urlConnection.connect();
		
		OutputStream ops = urlConnection.getOutputStream();
		ops.write(paramsJson.getBytes(StandardCharsets.UTF_8));
		ops.flush();
		ops.close();
		
		InputStream in = urlConnection.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in,StandardCharsets.UTF_8));
		StringBuffer temp = new StringBuffer();
		String line = bufferedReader.readLine();
		while (line != null) {
			temp.append(line);
			line = bufferedReader.readLine();
		}
		bufferedReader.close();
		in.close();
		
		urlConnection.disconnect();
		return new String(temp.toString().getBytes(StandardCharsets.UTF_8), "utf-8");
	}
	/**
	 * 发送消息到消息平台接口
	 * @param paramsJson 请求json
	 * @return 请求接口返回json类型结果
	 * @throws IOException 消息平台连接异常
	 */
	public static String sendMsg(String paramsJson) throws IOException {
		URL url = new URL("http://172.16.34.115:8087/msg-main/api/message/v1");
		HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
		
		urlConnection.setRequestMethod("POST");
		urlConnection.setDoOutput(true);
		urlConnection.setDoInput(true);
		urlConnection.setUseCaches(false);
		urlConnection.setRequestProperty("systemid", "hfdf");
		urlConnection.setRequestProperty("authcode", "df5cd38c0ead11e7810db7ce82342409");
		urlConnection.setRequestProperty("Content-Type", "application/json");
		
		urlConnection.connect();
		
		OutputStream ops = urlConnection.getOutputStream();
		ops.write(paramsJson.getBytes(StandardCharsets.UTF_8));
		ops.flush();
		ops.close();
		
		InputStream in = urlConnection.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in,StandardCharsets.UTF_8));
		StringBuffer temp = new StringBuffer();
		String line = bufferedReader.readLine();
		while (line != null) {
			temp.append(line);
			line = bufferedReader.readLine();
		}
		bufferedReader.close();
		in.close();
		
		urlConnection.disconnect();
		return new String(temp.toString().getBytes(StandardCharsets.UTF_8), StandardCharsets.UTF_8);
	}

	public static String getMessage(String url) throws Exception{
		URLConnection connection = new URL(url).openConnection();
		connection.setRequestProperty("systemid", "hfdf");
		connection.setRequestProperty("authcode", "df5cd38c0ead11e7810db7ce82342409");
		InputStream inputStream = connection.getInputStream();
		List<String> lines = IOUtils.readLines(inputStream, "utf-8");
		String result = StringUtils.join(lines.toArray(new String[lines.size()]));
		return result;
	}

}
