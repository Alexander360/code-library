
import java.io.*;
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
public class FilenameFilterTest
{
	public static void main(String[] args)
	{
		File file = new File(".");
		// ʹ��Lambda���ʽ��Ŀ������ΪFilenameFilter��ʵ���ļ���������
		// ����ļ�����.java��β�������ļ���Ӧһ��·��������true
		String[] nameList = file.list((dir, name) -> name.endsWith(".java")
			|| new File(name).isDirectory());
		for(String name : nameList)
		{
			System.out.println(name);
		}
	}
}
