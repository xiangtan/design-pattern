package cn.learning.lyc.algorithm;

/**
 * 排序算法
 * 
 * @author yicai.liu
 * @version
 * @date 2016年3月21日 上午10:58:51
 */
public class Sort
{
	public static void main(String[] args)
	{
		int array[] = { 8, 0, 4, 2, 47, 12, 76, 45 };
		quickSort(array, 0, array.length);
	}

	public static void quickSort(int[] arr, int offset, int end)
	{
		if (offset >= end)
		{
			return;
		}
		int index = partition(arr, offset, end);
		quickSort(arr, offset, index);
		quickSort(arr, index + 1, end);
	}

	private static int partition(int[] arr, int offset, int end)
	{
		int pivot = arr[offset];
		while(offset<end)
		{
			while(offset < end && arr[end]>pivot)
			{
				end --;
			}
			while(offset < end && arr[offset]<pivot)
			{
				offset++;
			}
			if(offset<end)
			{
				//arr[offset--]=n[]
			}
		}
		return 0;
	}
}
