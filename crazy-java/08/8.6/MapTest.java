
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
public class MapTest
{
	public static void main(String[] args)
	{
		Map map = new HashMap();
		// �ɶԷ�����key-value��
		map.put("���Java����" , 109);
		map.put("���iOS����" , 10);
		map.put("���Ajax����" , 79);
		// ��η����key-value����value�����ظ�
		map.put("������Java EE��ҵӦ��ʵս" , 99);
		// �����ظ���keyʱ���µ�value�Ḳ��ԭ�е�value
		// ����µ�value������ԭ�е�value���÷������ر����ǵ�value
		System.out.println(map.put("���iOS����" , 99)); // ���10
		System.out.println(map); // �����Map���ϰ���4��key-value��
		// �ж��Ƿ����ָ��key
		System.out.println("�Ƿ����ֵΪ ���iOS���� key��"
			+ map.containsKey("���iOS����")); // ���true
		// �ж��Ƿ����ָ��value
		System.out.println("�Ƿ����ֵΪ 99 value��"
			+ map.containsValue(99)); // ���true
		// ��ȡMap���ϵ�����key��ɵļ��ϣ�ͨ������key��ʵ�ֱ�������key-value��
		for (Object key : map.keySet() )
		{
			// map.get(key)������ȡָ��key��Ӧ��value
			System.out.println(key + "-->" + map.get(key));
		}
		map.remove("���Ajax����"); // ����key��ɾ��key-value�ԡ�
		System.out.println(map); // ���������ٰ��� ���Ajax����=79 ��key-value��
	}
}
