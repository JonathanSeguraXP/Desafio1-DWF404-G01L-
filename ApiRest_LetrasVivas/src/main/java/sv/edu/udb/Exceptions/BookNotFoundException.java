package sv.edu.udb.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // Retorna al 404
public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super("Libro no encontrado con  el ID: " + id); //
    }
}