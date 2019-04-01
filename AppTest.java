package jar;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

       
    
    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }
       
    /**
     * comprueba que los valores de la suma sean iguales a los esperados
     */
	public void sumarTest() {
		double resultado = App.sumar(10, 5);			
		assertEquals(15.00, resultado);
	}
	
	/**
     * comprueba que los valores de la resta sean iguales a los esperados
     */
	public void restarTest() {
		double resultado = App.restar(10, 5);			
		assertEquals(5.00, resultado);
	}
    
	/**
     * comprueba que los valores de la multiplicación sean iguales a los esperados
     */
	public void multiplicarTest() {
		double resultado = App.multiplicar(10, 5);			
		assertEquals(50.00, resultado);
	}
	
	/**
     * comprueba que los valores de la división sean iguales a los esperados
     */
	public void dividirTest() {
		double resultado = App.dividir(10, 5);			
		assertEquals(2.00, resultado);
	}
    
    
}
