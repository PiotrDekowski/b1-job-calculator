package com.printshop.b1_job_calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

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

	@Test
	void shouldCalculateGrossQuantityWithTenPercentAllowance() {
		PrintJob job = new PrintJob("Brochure B1", 1000, 700,500);

		assertEquals(550, job.calculateGrossQuantity());
	}
}
