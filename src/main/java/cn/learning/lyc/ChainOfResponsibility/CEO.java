package cn.learning.lyc.ChainOfResponsibility;

/**
 * CEO
 * 
 * @author yicai.liu
 * @version
 * @date 2016年2月25日 下午12:24:48
 */
public class CEO extends DiscountHandler
{

	@Override
	public void discount(float price)
	{
		if (price <= 0.55)
		{
			System.out.println("CEO打折：" + price);
		}
		else
		{
			System.out.println("CEO拒绝折扣：" + price);
		}
		return;
	}

}
