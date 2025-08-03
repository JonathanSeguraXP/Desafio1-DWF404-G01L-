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
        // Configuración del mock
        Books book = new Books();
        book.setTitle("El Principito");
        when(bookServices.findAll()).thenReturn(Arrays.asList(book));

        // Ejecución y verificación
        ResponseEntity<List<Books>> response = bookController.getAll();
        assertEquals(1, response.getBody().size());
        assertEquals("El Principito", response.getBody().get(0).getTitle());
    }
}