import java.io.*;

public class FilenameFilterTest {

	public static void main(String[] args) {
		File file = new File(".");
		// 使用Lambda表达式(目标类型为FilenameFilter)实现文件过滤器，如果文件名以.java结尾, 或者文件对应一个路径, 则返回true
		String[] nameList = file.list((dir, name) -> name.endsWith(".java") || new File(name).isDirectory());
		for(String name : nameList) {
			System.out.println(name);
		}
	}

}
