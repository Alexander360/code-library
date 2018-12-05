
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

class R implements Comparable
{
	int count;
	public R(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:" + count + "]";
	}
	// ��дequals����������count���ж��Ƿ����
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if(obj != null && obj.getClass() == R.class)
		{
			R r = (R)obj;
			return r.count == this.count;
		}
		return false;
	}
	// ��дcompareTo����������count���Ƚϴ�С
	public int compareTo(Object obj)
	{
		R r = (R)obj;
		return count > r.count ? 1 :
			count < r.count ? -1 : 0;
	}
}
public class TreeSetTest3
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		ts.add(new R(5));
		ts.add(new R(-3));
		ts.add(new R(9));
		ts.add(new R(-2));
		// ��ӡTreeSet���ϣ�����Ԫ�����������е�
		System.out.println(ts);    // ��
		// ȡ����һ��Ԫ��
		R first = (R)ts.first();
		// �Ե�һ��Ԫ�ص�count��ֵ
		first.count = 20;
		// ȡ�����һ��Ԫ��
		R last = (R)ts.last();
		// �����һ��Ԫ�ص�count��ֵ����ڶ���Ԫ�ص�count��ͬ
		last.count = -2;
		// �ٴ����������TreeSet���Ԫ�ش�������״̬�������ظ�Ԫ��
		System.out.println(ts);   // ��
		// ɾ��ʵ���������ı��Ԫ�أ�ɾ��ʧ��
		System.out.println(ts.remove(new R(-2)));   // ��
		System.out.println(ts);
		// ɾ��ʵ������û�б��ı��Ԫ�أ�ɾ���ɹ�
		System.out.println(ts.remove(new R(5)));    // ��
		System.out.println(ts);
	}
}
