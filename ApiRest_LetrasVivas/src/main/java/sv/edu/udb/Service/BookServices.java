package sv.edu.udb.Service;

import sv.edu.udb.Models.Books;
import java.util.List;

public interface BookServices {
    List<Books> findAll();
    Books save(Books book);
    List<Books> findByTitle(String title);
    void deleteById(Long id);
}