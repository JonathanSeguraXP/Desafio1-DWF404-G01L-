package sv.edu.udb.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sv.edu.udb.Models.Books;
import sv.edu.udb.Repository.BooksRepository;
import sv.edu.udb.Service.Impl.BookServiceImpl;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookServiceImplTest {
    @Mock
    private BooksRepository booksRepository;

    @InjectMocks
    private BookServiceImpl bookService;

    @Test
    void save_shouldReturnSavedBook() {
        Books bookToSave = new Books();
        bookToSave.setTitle("Luz Negra");
        when(booksRepository.save(any(Books.class))).thenReturn(bookToSave);

        Books savedBook = bookService.save(bookToSave);
        assertEquals("Luz Negra", savedBook.getTitle());
    }
}