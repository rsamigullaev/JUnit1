import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    Calculator calculator;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Начинаем проверку");
    }

    @BeforeEach
    public void beforeEach() {
        calculator = new Calculator();
        System.out.println("Проверка теста");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Закончили проверку");
    }

    @AfterEach
    public void afterEach() {
        calculator = new Calculator();
        System.out.println("Закончили проверку теста");
    }

    @Test
    public void testAdd() {
        int a = 100, b = 50, c = 20, expected = 170;
        int result = calculator.add(a, b, c);
        assertEquals(expected, result);

    }

    @Test
    public void testDeduct() {
        int a = 100, b = 50, c = 20, expected = 30;
        int result = calculator.deduct(a, b, c);
        assertEquals(expected, result);

    }

    @Test
    public void testMultiply() {
        int a = 10, b = 5, c = 2, expected = 100;
        int result = calculator.multiply(a, b, c);
        assertEquals(expected, result);

    }

    @Test
    public void testDevide() {
        double a = 100, b = 5, c = 2, expected = 10;
        double result = calculator.devide(a, b, c);
        assertEquals(expected, result);

    }
}