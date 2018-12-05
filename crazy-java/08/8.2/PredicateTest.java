
import java.util.*;
import java.util.function.*;
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
public class PredicateTest
{
	public static void main(String[] args)
	{
		// ����һ������
		Collection books = new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���iOS����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Android����"));
		// ʹ��Lambda���ʽ��Ŀ��������Predicate�����˼���
		books.removeIf(ele -> ((String)ele).length() < 10);
		System.out.println(books);
	}
}
