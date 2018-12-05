
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
public class MapTest2
{
	public static void main(String[] args)
	{
		Map map = new HashMap();
		// �ɶԷ�����key-value��
		map.put("���Java����" , 109);
		map.put("���iOS����" , 99);
		map.put("���Ajax����" , 79);
		// �����滻keyΪ"���XML����"��value������ԭMap��û�ж�Ӧ��key��
		// ��˶�Mapû�иı䣬��������µ�key-value��
		map.replace("���XML����" , 66);
		System.out.println(map);
		// ʹ��ԭvalue�������������Ľ������ԭ�е�value
		map.merge("���iOS����" , 10 ,
			(oldVal , param) -> (Integer)oldVal + (Integer)param);
		System.out.println(map); // "���iOS����"��value������10
		// ��keyΪ"Java"��Ӧ��valueΪnull���򲻴���ʱ����ʹ�ü���Ľ����Ϊ��value
		map.computeIfAbsent("Java" , (key)->((String)key).length());
		System.out.println(map); // map������� Java=4 ����key-value��
		// ��keyΪ"Java"��Ӧ��value����ʱ��ʹ�ü���Ľ����Ϊ��value
		map.computeIfPresent("Java",
			(key , value) -> (Integer)value * (Integer)value);
		System.out.println(map); // map�� Java=4 ��� Java=16
	}
}
