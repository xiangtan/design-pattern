package cn.learning.lyc.proxy.dynamic.jdk.example.normal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author yicai.liu
 * @version
 * @date 2016年2月28日 下午9:58:46
 */
public class Client
{
	public static void main(String[] args)
	{
		ISomething something = new Something();
		InvocationHandler handler = new SomethingHandler(something);
		ISomething proxySomething = (ISomething) Proxy.newProxyInstance(Something.class.getClassLoader(),
				Something.class.getInterfaces(), handler);
		proxySomething.doing();
	}
}
