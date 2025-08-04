package sv.edu.udb.Repository;

import sv.edu.udb.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BooksRepository extends JpaRepository<Books, Long> {
    List<Books> findByTitleContainingIgnoreCase(String title);
}
