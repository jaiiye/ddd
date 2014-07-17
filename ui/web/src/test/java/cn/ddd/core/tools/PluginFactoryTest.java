package cn.ddd.core.tools;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PluginFactoryTest {
	@Test
	public void test() {
		List list = Plugins.getPlugin(List.class);
		System.out.println(list instanceof ArrayList);
	}
}
