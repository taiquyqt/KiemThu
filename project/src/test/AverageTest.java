package test;
import org.junit.jupiter.api.Test;

import main.Average;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
public class AverageTest {


	    Average calculator = new Average();

	    @Test
	    void testCase01() {
	        assertEquals(25, calculator.average(new int[]{10, 20, 30, 40, -999}, 5, 50));
	    }

	    @Test
	    void testCase02() {
	        assertEquals(-999, calculator.average(new int[]{1, 20, 30, 40, -999}, 5, 50));
	    }

	    @Test
	    void testCase03() {
	        assertEquals(30, calculator.average(new int[]{20, 30, 40, 60, 10, -999}, 5, 50));
	    }

	    @Test
	    void testCase04() {
	    	int[] values = new int[101];
	        Arrays.fill(values, 10);
	        assertEquals(10, calculator.average(values, 5, 50));
	    }

	    @Test
	    void testCase05() {
	        assertEquals(-999, calculator.average(new int[]{-999}, 5, 50));
	    }

	    @Test
	    void testCase06() {
	        assertEquals(-999, calculator.average(new int[]{1, 2, 3, -999}, 5, 50));
	    }

	}

