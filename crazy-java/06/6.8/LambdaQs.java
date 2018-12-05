

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
interface Eatable
{
	void taste();
}
interface Flyable
{
	void fly(String weather);
}
interface Addable
{
	int add(int a , int b);
}
public class LambdaQs
{
	// ���ø÷�����ҪEatable����
	public void eat(Eatable e)
	{
		System.out.println(e);
		e.taste();
	}
	// ���ø÷�����ҪFlyable����
	public void drive(Flyable f)
	{
		System.out.println("�����ڼ�ʻ��" + f);
		f.fly("���̿���ϴ�����ա�");
	}
	// ���ø÷�����ҪAddable����
	public void test(Addable add)
	{
		System.out.println("5��3�ĺ�Ϊ��" + add.add(5, 3));
	}
	public static void main(String[] args)
	{
		LambdaQs lq = new LambdaQs();
		// Lambda���ʽ�Ĵ����ֻ��һ����䣬����ʡ�Ի����š�
		lq.eat(()-> System.out.println("ƻ����ζ������"));
		// Lambda���ʽ���β��б�ֻ��һ���βΣ�ʡ��Բ����
		lq.drive(weather ->
		{
			System.out.println("���������ǣ�" + weather);
			System.out.println("ֱ��������ƽ��");
		});
		// Lambda���ʽ�Ĵ����ֻ��һ����䣬ʡ�Ի�����
		// �������ֻ��һ����䣬��ʹ�ñ��ʽ��Ҫ����ֵ��Ҳ����ʡ��return�ؼ��֡�
		lq.test((a , b)->a + b);
	}
}
