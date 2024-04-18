package org.example.app.utils;

import app.utils.TemperatureValidator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppValidatorTest {

    TemperatureValidator validator;

    @BeforeEach
    void setUp() {
        validator = new TemperatureValidator();
    }

    // Має бути відповідне повідомлення про валідну висоту.
    // Тестуємо чи вхідне значення висоти є в межах
    // можливостей пристрою.
    // При провалі тесту виведеться Invalid altitude.
    // Провал тесту забезпечуємо аргументом для validator.validateAltitude(arg)
    // за межами встановленого діапазону висоти.
    @Test
    @DisplayName("Test if altitude is in bounds.")
    void test_If_Altitude_Is_In_Bounds(){
        assertEquals(true,
                validator.doValidation(12));
    }

    // Має бути виняткова ситуація.
    // Тестуємо чи буде виняткова ситуація,
    // якщо вхідне значення висоти не є в межах
    // можливостей пристрою.
    // При провалі тесту виведеться No exception.
    // Провал тесту забезпечуємо аргументом для validator.validateAltitude(arg)
    // в межах встановленого діапазону висоти.
    @Test
    @DisplayName("Test if invalid altitude throws exception.")
    void test_If_Invalid_Altitude_Throws_Exception_One() {
        assertEquals(false,validator.doValidation(-23));
    }

    @Test
    @DisplayName("Test if invalid altitude throws exception.")
    void test_If_Invalid_Altitude_Throws_Exception_Two() {
        assertEquals(false,validator.doValidation(100));
    }

    @AfterEach
    void tearDown() {
        validator = null;
    }
}