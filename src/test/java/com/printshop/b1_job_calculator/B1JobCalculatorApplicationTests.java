package com.printshop.b1_job_calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class B1JobCalculatorApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	void shouldReturnTrueOnlyForStandardB1Size() {
		PrintJob standardB1 = new PrintJob("Brochure B1", 1000, 700, 500);
		PrintJob smallerSheet = new PrintJob("Flyers B2", 700, 500, 500);

		assertTrue(standardB1.isStandardB1());
		assertFalse(smallerSheet.isStandardB1());

	}
}
