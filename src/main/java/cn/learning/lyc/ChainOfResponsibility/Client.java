package cn.learning.lyc.ChainOfResponsibility;

/**
 * @author yicai.liu
 * @version
 * @date 2016年2月25日 下午2:50:34
 */
public class Client
{

	public static void main(String[] args)
	{
		float price = 0.17f;
		DiscountChain.process(price);
	}
}
