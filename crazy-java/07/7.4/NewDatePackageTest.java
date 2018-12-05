
import java.time.*;
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
public class NewDatePackageTest
{
	public static void main(String[] args)
	{
		// -----�����ǹ���Clock���÷�-----
		// ��ȡ��ǰClock
		Clock clock = Clock.systemUTC();
		// ͨ��Clock��ȡ��ǰʱ��
		System.out.println("��ǰʱ��Ϊ��" + clock.instant());
		// ��ȡclock��Ӧ�ĺ���������System.currentTimeMillis()�����ͬ
		System.out.println(clock.millis());
		System.out.println(System.currentTimeMillis());
		// -----�����ǹ���Duration���÷�-----
		Duration d = Duration.ofSeconds(6000);
		System.out.println("6000���൱��" + d.toMinutes() + "��");
		System.out.println("6000���൱��" + d.toHours() + "Сʱ");
		System.out.println("6000���൱��" + d.toDays() + "��");
		// ��clock����������6000�룬�����µ�Clock
		Clock clock2 = Clock.offset(clock, d);
		// �ɿ���clock2��clock1���1Сʱ40��
		System.out.println("��ǰʱ�̼�6000��Ϊ��" +clock2.instant());
		// -----�����ǹ���Instant���÷�-----
		// ��ȡ��ǰʱ��
		Instant instant = Instant.now();
		System.out.println(instant);
		// instant���6000�루��100���ӣ��������µ�Instant
		Instant instant2 = instant.plusSeconds(6000);
		System.out.println(instant2);
		// �����ַ����н���Instant����
		Instant instant3 = Instant.parse("2014-02-23T10:12:35.342Z");
		System.out.println(instant3);
		// ��instant3�Ļ��������5Сʱ4����
		Instant instant4 = instant3.plus(Duration
			.ofHours(5).plusMinutes(4));
		System.out.println(instant4);
		// ��ȡinstant4��5����ǰ��ʱ��
		Instant instant5 = instant4.minus(Duration.ofDays(5));
		System.out.println(instant5);
		// -----�����ǹ���LocalDate���÷�-----
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		// ���2014��ĵ�146��
		localDate = LocalDate.ofYearDay(2014, 146);
		System.out.println(localDate); // 2014-05-26
		// ����Ϊ2014��5��21��
		localDate = LocalDate.of(2014, Month.MAY, 21);
		System.out.println(localDate); // 2014-05-21
		// -----�����ǹ���LocalTime���÷�-----
		// ��ȡ��ǰʱ��
		LocalTime localTime = LocalTime.now();
		// ����Ϊ22��33��
		localTime = LocalTime.of(22, 33);
		System.out.println(localTime); // 22:33
		// ����һ���еĵ�5503��
		localTime = LocalTime.ofSecondOfDay(5503);
		System.out.println(localTime); // 01:31:43
		// -----�����ǹ���localDateTime���÷�-----
		// ��ȡ��ǰ���ڡ�ʱ��
		LocalDateTime localDateTime = LocalDateTime.now();
		// ��ǰ���ڡ�ʱ�����25Сʱ������
		LocalDateTime future = localDateTime.plusHours(25).plusMinutes(3);
		System.out.println("��ǰ���ڡ�ʱ���25Сʱ3��֮��" + future);
		// �����ǹ���Year��YearMonth��MonthDay���÷�ʾ��-----
		Year year = Year.now(); // ��ȡ��ǰ�����
		System.out.println("��ǰ��ݣ�" + year); // �����ǰ���
		year = year.plusYears(5); // ��ǰ����ټ�5��
		System.out.println("��ǰ����ٹ�5�꣺" + year);
		// ����ָ���·ݻ�ȡYearMonth
		YearMonth ym = year.atMonth(10);
		System.out.println("year��10�£�" + ym); // ���XXXX-10��XXXX����ǰ���
		// ��ǰ�����ټ�5�꣬��3����
		ym = ym.plusYears(5).minusMonths(3);
		System.out.println("year��10���ټ�5�ꡢ��3���£�" + ym);
		MonthDay md = MonthDay.now();
		System.out.println("��ǰ���գ�" + md); // ���--XX-XX�������¼���
		// ����Ϊ5��23��
		MonthDay md2 = md.with(Month.MAY).withDayOfMonth(23);
		System.out.println("5��23��Ϊ��" + md2); // ���--05-23
	}
}