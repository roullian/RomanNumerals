package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.RomanNumerals;

public class RomanNumeralsTest {

	RomanNumerals romanNumerals;
	
	@Test
	public void oneShouldReturnI() {
		assertEquals("I", new RomanNumerals(1).getRomanNumber());
	}
	
	@Test
	public void threeShouldReturnIII() {
		assertEquals("III", new RomanNumerals(3).getRomanNumber());
	}
	
	@Test
	public void fiveShouldReturnV() {
		assertEquals("V", new RomanNumerals(5).getRomanNumber());
	}
	
	@Test
	public void sevenShouldReturnVII() {
		assertEquals("VII", new RomanNumerals(7).getRomanNumber());
	}
	
	@Test
	public void fourShouldReturnIV() {
		assertEquals("IV", new RomanNumerals(4).getRomanNumber());
	}
	
	@Test
	public void tenShouldReturnX() {
		assertEquals("X", new RomanNumerals(10).getRomanNumber());
	}
	
	@Test
	public void sixteenShouldReturnXVI() {
		assertEquals("XVI", new RomanNumerals(16).getRomanNumber());
	}
	
	@Test
	public void nineShouldReturnIX() {
		assertEquals("IX", new RomanNumerals(9).getRomanNumber());
	}

	@Test
	public void fourteenShouldReturnXIV() {
		assertEquals("XIV", new RomanNumerals(14).getRomanNumber());
	}
	
	@Test
	public void nineteenShouldReturnXIX() {
		assertEquals("XIX", new RomanNumerals(19).getRomanNumber());
	}

	@Test
	public void twentyFourShouldReturnXXIV() {
		assertEquals("XXIV", new RomanNumerals(24).getRomanNumber());
	}

	@Test
	public void twentyNiceShouldReturnXXIX() {
		assertEquals("XXIX", new RomanNumerals(29).getRomanNumber());
	}
	
	@Test
	public void FortyShouldReturnXC() {
		assertEquals("XL", new RomanNumerals(40).getRomanNumber());
	}


}
