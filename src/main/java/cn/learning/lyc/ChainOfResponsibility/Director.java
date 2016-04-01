package cn.learning.lyc.ChainOfResponsibility;

/**
 * 总监
 * 
 * @author yicai.liu
 * @version
 * @date 2016年2月25日 下午12:22:58
 */
public class Director extends DiscountHandler
{

	@Override
	public void discount(float price)
	{
		if (price <= 0.35)
		{
			System.out.println("总监打折：" + price);
			return;
		}

		super.discount(price);
	}

}
