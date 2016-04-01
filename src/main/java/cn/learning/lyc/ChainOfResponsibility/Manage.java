package cn.learning.lyc.ChainOfResponsibility;

/**
 * 经理
 * 
 * @author yicai.liu
 * @version
 * @date 2016年2月25日 下午12:22:04
 */
public class Manage extends DiscountHandler
{

	@Override
	public void discount(float price)
	{
		if (price <= 0.15)
		{
			System.out.println("经理打折：" + price);
			return;
		}
		super.discount(price);
	}

}
