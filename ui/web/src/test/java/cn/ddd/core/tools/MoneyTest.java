package cn.ddd.core.tools;

import java.util.Currency;
import java.util.Locale;

import org.junit.Test;

public class MoneyTest {
	@Test
	public void testDouble() {
		double val = 0.00;
		for (int i = 0; i < 10; i++)
			val += 0.10;
		System.out.println(val == 1.00);
		System.out.println(val);
	}

	@Test
	public void testCurrency() {
		int fraction = Currency.getInstance(Locale.getDefault()).getDefaultFractionDigits();
		System.out.println(fraction);
	}
}
