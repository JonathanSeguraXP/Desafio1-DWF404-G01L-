package sv.edu.udb.controller;

import sv.edu.udb.Models.Books;
import sv.edu.udb.Service.BookServices;
import sv.edu.udb.Exceptions.BookNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookServices service;

    public BookController(BookServices service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<List<Books>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<Books> create(@Valid @RequestBody Books book) {
        Books savedBook = service.save(book);
        return ResponseEntity.ok(savedBook);
    }


    @GetMapping("/search")
    public ResponseEntity<List<Books>> searchByTitle(@RequestParam String title) {
        return ResponseEntity.ok(service.findByTitle(title));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        try {
            service.deleteById(id);
            return ResponseEntity.ok("El libro ha sido eliminado correctamente");
        } catch (BookNotFoundException ex) {
            return ResponseEntity.status(404).body(ex.getMessage());
        }
    }
}