
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
public class ListTest3
{
	public static void main(String[] args)
	{
		List books = new ArrayList();
		// ��books���������4��Ԫ��
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���Android����"));
		books.add(new String("���iOS����"));
		// ʹ��Ŀ������ΪComparator��Lambda���ʽ��List��������
		books.sort((o1, o2)->((String)o1).length() - ((String)o2).length());
		System.out.println(books);
		// ʹ��Ŀ������ΪUnaryOperator��Lambda���ʽ���滻����������Ԫ��
		// ��Lambda���ʽ����ʹ��ÿ���ַ����ĳ�����Ϊ�µļ���Ԫ��
		books.replaceAll(ele->((String)ele).length());
		System.out.println(books); // ���[7, 8, 11, 16]

	}
}