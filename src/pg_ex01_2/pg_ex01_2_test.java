package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class pg_ex01_2_test {

	@Test
	public void test1Henkan() {
		assertEquals("I",PG_EX01_2.KazuHenkan(1));
	}
	@Test
	public void test5Henkan() {
		assertEquals("V",PG_EX01_2.KazuHenkan(5));
	}
	@Test
	public void test0Henkan() {
		assertEquals("変換できません",PG_EX01_2.KazuHenkan(0));
	}
	@Test
	public void test10Henkan() {
		assertEquals("X",PG_EX01_2.KazuHenkan(10));
	}
	@Test
	public void test11Henkan() {
		assertEquals("XI",PG_EX01_2.KazuHenkan(11));
	}
	@Test
	public void test15Henkan() {
		assertEquals("XV",PG_EX01_2.KazuHenkan(15));
	}
	@Test
	public void test20Henkan() {
		assertEquals("XX",PG_EX01_2.KazuHenkan(20));
	}
	@Test
	public void test21Henkan() {
		assertEquals("変換できません",PG_EX01_2.KazuHenkan(21));
	}


}
