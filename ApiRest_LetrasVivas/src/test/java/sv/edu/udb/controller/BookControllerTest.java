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
        Books book = new Books();
        book.setTitle("El Alquimista");
        when(bookServices.findAll()).thenReturn(Arrays.asList(book));

        ResponseEntity<List<Books>> response = bookController.getAll();
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("El Alquimista", response.getBody().get(0).getTitle());
    }
}