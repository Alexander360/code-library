
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
public class LinkedHashMapTest
{
	public static void main(String[] args)
	{
		LinkedHashMap scores = new LinkedHashMap();
		scores.put("����" , 80);
		scores.put("Ӣ��" , 82);
		scores.put("��ѧ" , 76);
		// ����forEach��������scores�������key-value��
		scores.forEach((key, value) -> System.out.println(key + "-->" + value));
	}
}
