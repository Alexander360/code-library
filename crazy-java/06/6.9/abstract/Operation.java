

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
public enum Operation
{
	PLUS
	{
		public double eval(double x , double y)
		{
			return x + y;
		}
	},
	MINUS
	{
		public double eval(double x , double y)
		{
			return x - y;
		}
	},
	TIMES
	{
		public double eval(double x , double y)
		{
			return x * y;
		}
	},
	DIVIDE
	{
		public double eval(double x , double y)
		{
			return x / y;
		}
	};
	// Ϊö���ඨ��һ�����󷽷�
	// ������󷽷��ɲ�ͬ��ö��ֵ�ṩ��ͬ��ʵ��
	public abstract double eval(double x, double y);
	public static void main(String[] args)
	{
		System.out.println(Operation.PLUS.eval(3, 4));
		System.out.println(Operation.MINUS.eval(5, 4));
		System.out.println(Operation.TIMES.eval(5, 4));
		System.out.println(Operation.DIVIDE.eval(5, 4));
	}
}

