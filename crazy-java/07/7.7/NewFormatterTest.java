
import java.time.*;
import java.time.format.*;
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
public class NewFormatterTest
{
	public static void main(String[] args)
	{
		DateTimeFormatter[] formatters = new DateTimeFormatter[]{
			// ֱ��ʹ�ó�������DateTimeFormatter��ʽ��
			DateTimeFormatter.ISO_LOCAL_DATE,
			DateTimeFormatter.ISO_LOCAL_TIME,
			DateTimeFormatter.ISO_LOCAL_DATE_TIME,
			// ʹ�ñ��ػ��Ĳ�ͬ���������DateTimeFormatter��ʽ��
			DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM),
			DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
			// ����ģʽ�ַ���������DateTimeFormatter��ʽ��
			DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
		};
		LocalDateTime date = LocalDateTime.now();
		// ����ʹ�ò�ͬ�ĸ�ʽ����LocalDateTime���и�ʽ��
		for(int i = 0 ; i < formatters.length ; i++)
		{
			// �������д����������ͬ
			System.out.println(date.format(formatters[i]));
			System.out.println(formatters[i].format(date));
		}
	}
}
