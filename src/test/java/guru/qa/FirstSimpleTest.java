package guru.qa;

import org.junit.jupiter.api.*;

@DisplayName("Это наш первый простой тест")
public class FirstSimpleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll method!");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    @BeforeEach method!");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll method!");
    }

    @AfterEach
    void afterEach() {
        System.out.println("    @AfterEach method!");
    }
    @DisplayName("Тест на assertEquals")
    @Test
    void firstTest() {
        System.out.println("        Test for assertEquals");
        Assertions.assertEquals(1,1);
    }

    @DisplayName("Тест на assertTrue")
    @Test
    void secondTest() {
        System.out.println("        Test for assertTrue");
        Assertions.assertTrue(7 > 6);
    }
}
