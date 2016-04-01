package cn.learning.lyc.ChainOfResponsibility;

/**
 * @author yicai.liu
 * @version
 * @date 2016年2月25日 下午12:24:23
 */
public class VP extends DiscountHandler
{

	@Override
	public void discount(float price)
	{
		if (price <= 0.45)
		{
			System.out.println("副总裁打折：" + price);
			return;
		}
		super.discount(price);
	}

}
