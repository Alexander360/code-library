
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
public class CollectionStream
{
	public static void main(String[] args)
	{
		// ����books���ϡ�Ϊbooks�������Ԫ�صĴ�����8.2.5С�ڵĳ�����ͬ��
		Collection books = new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���iOS����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Android����"));
		// ͳ����������������Ӵ���ͼ������
		System.out.println(books.stream()
			.filter(ele->((String)ele).contains("���"))
			.count()); // ���4
		// ͳ������������Java���Ӵ���ͼ������
		System.out.println(books.stream()
			.filter(ele->((String)ele).contains("Java") )
			.count()); // ���2
		// ͳ�������ַ������ȴ���10��ͼ������
		System.out.println(books.stream()
			.filter(ele->((String)ele).length() > 10)
			.count()); // ���2
		// �ȵ���Collection�����stream()����������ת��ΪStream,
		// �ٵ���Stream��mapToInt()������ȡԭ�е�Stream��Ӧ��IntStream
		books.stream().mapToInt(ele -> ((String)ele).length())
			// ����forEach()��������IntStream��ÿ��Ԫ��
			.forEach(System.out::println);// ���8  11  16  7  8
	}
}
