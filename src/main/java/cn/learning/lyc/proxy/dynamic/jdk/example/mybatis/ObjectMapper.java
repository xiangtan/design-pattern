package cn.learning.lyc.proxy.dynamic.jdk.example.mybatis;

/**
 * 模拟mybatis 接口代理
 * 
 * @author yicai.liu
 * @version
 * @date 2016年2月28日 下午10:19:09
 */
public interface ObjectMapper
{
	public Obj getByID(String id);
}
