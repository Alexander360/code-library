
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
class M
{
	int age;
	public M(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return "M[age:" + age + "]";
	}
}
public class TreeSetTest4
{
	public static void main(String[] args)
	{
		// �˴�Lambda���ʽ��Ŀ��������Comparator
		TreeSet ts = new TreeSet((o1 , o2) ->
		{
			M m1 = (M)o1;
			M m2 = (M)o2;
			// ����M�����age������������С��ageԽ��M���󷴶�ԽС
			return m1.age > m2.age ? -1
				: m1.age < m2.age ? 1 : 0;
		});
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		System.out.println(ts);
	}
}

