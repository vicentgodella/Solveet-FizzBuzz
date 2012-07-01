package com.solveet;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzz fb;
	
	@Before
	public void setUp()
	{
		fb = new FizzBuzz();
	}
	
	@Test
	public void testDevuelve1SiNumeroEs1() {
		assertEquals("1", fb.obtieneRespuesta(1));
	}
	
	@Test
	public void testDevuelve2SiNumeroEs2() {
		assertEquals("2", fb.obtieneRespuesta(2));
	}

	@Test
	public void testDevuelveFizzSiNumeroEs3() {
		assertEquals("Fizz", fb.obtieneRespuesta(3));
	}

	@Test
	public void testDevuelveBuzzSiNumeroEs5() {
		assertEquals("Buzz", fb.obtieneRespuesta(5));
	}

	@Test
	public void testDevuelveFizzSiNumeroEs6() {
		assertEquals("Fizz", fb.obtieneRespuesta(6));
	}
	
	@Test
	public void testDevuelveBuzzSiNumeroEs10() {
		assertEquals("Buzz", fb.obtieneRespuesta(10));
	}

	@Test
	public void testDevuelveFizzSiNumeroEs13() {
		assertEquals("Fizz", fb.obtieneRespuesta(13));
	}
	
	@Test
	public void testDevuelveFizzBuzzSiNumeroEs15() {
		assertEquals("FizzBuzz", fb.obtieneRespuesta(15));
	}
	
	@Test
	public void testDevuelveFizzSiNumeroEs18() {
		assertEquals("Fizz", fb.obtieneRespuesta(18));
	}

	@Test
	public void testDevuelveBuzzSiNumeroEs52() {
		assertEquals("Buzz", fb.obtieneRespuesta(52));
	}
	
	@Test
	public void testSiGeneraResultadoDe10() {
		assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n", fb.generaResultados(10));
	}

	@Test
	public void testSiGeneraResultadoDe13() {
		assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz\n", fb.generaResultados(13));
	}
}
