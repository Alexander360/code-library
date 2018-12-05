
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
public class ArrayDequeQueue
{
	public static void main(String[] args)
	{
		ArrayDeque queue = new ArrayDeque();
		// ���ν�����Ԫ�ؼ������
		queue.offer("���Java����");
		queue.offer("������Java EE��ҵӦ��ʵս");
		queue.offer("���Android����");
		// �����[���Java����, ������Java EE��ҵӦ��ʵս, ���Android����]
		System.out.println(queue);
		// ���ʶ���ͷ����Ԫ�أ�����������poll������"ջ"����������Java����
		System.out.println(queue.peek());
		// ��Ȼ�����[���Java����, ������Java EE��ҵӦ��ʵս, ���Android����]
		System.out.println(queue);
		// poll����һ��Ԫ�أ���������Java����
		System.out.println(queue.poll());
		// �����[������Java EE��ҵӦ��ʵս, ���Android����]
		System.out.println(queue);
	}
}
