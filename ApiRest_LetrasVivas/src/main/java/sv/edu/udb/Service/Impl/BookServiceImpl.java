package sv.edu.udb.Service.Impl;

import sv.edu.udb.Exceptions.BookNotFoundException;
import sv.edu.udb.Models.Books;
import sv.edu.udb.Repository.BooksRepository;
import sv.edu.udb.Service.BookServices;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceImpl implements BookServices {
    private final BooksRepository repository;

    public BookServiceImpl(BooksRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Books> findAll() {
        return repository.findAll();
    }
    @Override
    public Books save(Books book) {
        return repository.save(book);
    }

    @Override
    public List<Books> findByTitle(String title) {
        return repository.findByTitleContainingIgnoreCase(title);
    }

    @Override
    public void deleteById(Long id) {
        if (!repository.existsById(id)) {
            throw new BookNotFoundException(id);
        }
        repository.deleteById(id);
    }

}