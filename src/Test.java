import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class Test {
	@org.junit.Test
	public void ゼロの表示() {
		IntToEng ite = new IntToEng();
		String expected = "zero";
		String actual = ite.translateEng(0);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 一桁目の表示() {
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 十代の表示() {
		IntToEng ite = new IntToEng();
		String expected = "eleven";
		String actual = ite.translateEng(11);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 二桁目の表示() {
		IntToEng ite = new IntToEng();
		String expected = "twenty one";
		String actual = ite.translateEng(21);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 三桁目の表示() {
		IntToEng ite = new IntToEng();
		String expected = "three hundred fourty five";
		String actual = ite.translateEng(345);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 四桁目の表示() {
		IntToEng ite = new IntToEng();
		String expected = "five thousand six hundred seventy eight";
		String actual = ite.translateEng(5678);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 四桁目の表示２() {
		IntToEng ite = new IntToEng();
		String expected = "six thousand seven hundred eight";
		String actual = ite.translateEng(6708);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 五桁目の表示() {
		IntToEng ite = new IntToEng();
		String expected = "twenty four thousand six hundred fifty seven";
		String actual = ite.translateEng(24657);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 六桁目の表示() {
		IntToEng ite = new IntToEng();
		String expected = "four hundred thirty two thousand nine hundred eighty five";
		String actual = ite.translateEng(432985);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 七桁目の表示() {
		IntToEng ite = new IntToEng();
		String expected = "one million six hundred fifty four thousand nine hundred eighty three";
		String actual = ite.translateEng(1654983);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 七桁目の表示２() {
		IntToEng ite = new IntToEng();
		String expected = "one million six hundred four thousand nine hundred eighty three";
		String actual = ite.translateEng(1604983);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 八桁目の表示() {
		IntToEng ite = new IntToEng();
		String expected = "ninety four million six hundred fifty two thousand three hundred eighty seven";
		String actual = ite.translateEng(94652387);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 九桁目の表示() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred twenty three million four hundred fifty six thousand seven hundred eighty nine";
		String actual = ite.translateEng(123456789);
		assertThat(actual,is(expected));
	}
	@org.junit.Test
	public void 九桁目の表示2() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred twenty three million four hundred fifty six thousand seven hundred nine";
		String actual = ite.translateEng(123456709);
		assertThat(actual,is(expected));
	}
}
