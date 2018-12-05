
import java.util.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class SortTest
{
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		System.out.println(nums); // ���:[2, -5, 3, 0]
		Collections.reverse(nums); // ��List����Ԫ�صĴ���ת
		System.out.println(nums); // ���:[0, 3, -5, 2]
		Collections.sort(nums); // ��List����Ԫ�صİ���Ȼ˳������
		System.out.println(nums); // ���:[-5, 0, 2, 3]
		Collections.shuffle(nums); // ��List����Ԫ�صİ����˳������
		System.out.println(nums); // ÿ������Ĵ��򲻹̶�
	}
}
