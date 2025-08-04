package sv.edu.udb.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import sv.edu.udb.Models.Books;
import sv.edu.udb.Service.BookServices;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class BookControllerTest {

    @Mock
    private BookServices bookServices;

    @InjectMocks
    private BookController bookController;

    @Test
    void getAll_shouldReturnBooks() {

        Books mockBook = new Books();
        mockBook.setTitle("El Alquimista");
        when(bookServices.findAll()).thenReturn(Arrays.asList(mockBook));

        ResponseEntity<List<Books>> response = bookController.getAll();

        assertEquals(200, response.getStatusCodeValue(), "El código de estado debe ser 200");
        assertFalse(response.getBody().isEmpty(), "La lista no debería estar vacía");
        assertEquals("El Alquimista", response.getBody().get(0).getTitle(), "El título del libro no coincide");


        verify(bookServices, times(1)).findAll();
    }
}