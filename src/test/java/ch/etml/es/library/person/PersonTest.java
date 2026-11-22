package ch.etml.es.library.person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonTest {

    private static final LocalDate TODAY = LocalDate.of(2026, 11, 22);
    private static final LocalDate VALID_DATE_OF_BIRTH = LocalDate.of(1984, 8, 10);

    private MockedStatic<LocalDate> mockedLocalDate;

    @BeforeEach
    void freezeToday() {
        // Real methods (LocalDate.of, plusDays, ...) keep working; only now() is overridden
        mockedLocalDate = Mockito.mockStatic(LocalDate.class, Mockito.CALLS_REAL_METHODS);
        mockedLocalDate.when(LocalDate::now).thenReturn(TODAY);
    }

    @AfterEach
    void releaseStaticMock() {
        // Must be closed, otherwise the mock leaks into other tests on the same thread
        mockedLocalDate.close();
    }

    // ---------- Initialization ----------

    @Test
    @DisplayName("A person should be initialized with basic information")
    void shouldInitializePerson(){

        // Given
        String firstname = "Ryan";
        String lastname = "Eggold";
        LocalDate dateOfBirth = LocalDate.of(1984, 8, 10);

        // When
        Person person = new Person(firstname, lastname, dateOfBirth);

        // Then
        assertNotNull(person);
        assertEquals("Ryan", person.getFirstname());
        assertEquals("EGGOLD", person.getLastname());
        assertEquals(42, person.getAge());
    }
}