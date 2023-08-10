package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class aTest {
    @Test
    void FactorialTest_1() {	
		assertEquals(1, a.Factorial(1));		//正确
		assertEquals(120, a.Factorial(5));		//正确
    }
    
    @Test
    void FactorialTest_2() {
		assertEquals(100, a.Factorial(5));		//计算错误
    }
    
    @Test
    void FactorialTest_3() {
		assertEquals(0, a.Factorial(-1));		//运行错误
    }
    
    @Test
    void EuclideanAlgorithmTest_1() {
		assertEquals(2, a.EuclideanAlgorithm(10, 4));	//正确
    }
    
    @Test
    void EuclideanAlgorithmTest_2() {
		assertEquals(3, a.EuclideanAlgorithm(10, 4));	//计算错误
    }
}
