package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numberOneReturnsOne() {
		Assert.assertEquals( "one", numberWords.toWords(1) ) ;
	}

	
	@Test
	public void numberLessThanTen() {
		Assert.assertEquals(  "nine", numberWords.toWords(9) ) ;
	}

	@Test
	public void numberLessThanHundred() {
		Assert.assertEquals(  "ninety  nine", numberWords.toWords(99) ) ;
	}
	@Test
	public void numberLessThanThousand() {
		Assert.assertEquals(  "nine hundred nine", numberWords.toWords(909) ) ;
	}
	/*
	@Test
	public void numberEqualsThanThousand() {
		Assert.assertEquals(  "one thousand", numberWords.toWords(1000) ) ;
	}  */
}
