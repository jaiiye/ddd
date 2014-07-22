package cn.ddd.core.tools;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Test;

public class FormatterTest {

	@Test
	public void testFormatter() {
		double num = 0.23542;

		String resultString = NumberFormat.getInstance().format(num);

		System.out.printf("格式化输出：%s %f", "a", num);

		System.out.println();
		System.out.println(resultString);

		DecimalFormat df = new DecimalFormat("#.#######");
		float f = 20;
		System.out.println("你不想要的：" + f);
		System.out.println("你想要的答案：" + df.format(f));
	}
}
