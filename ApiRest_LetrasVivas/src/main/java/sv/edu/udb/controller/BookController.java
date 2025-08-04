package sv.edu.udb.controller;

import sv.edu.udb.Models.Books;
import sv.edu.udb.Service.BookServices;
import sv.edu.udb.Exceptions.BookNotFoundException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@Tag(name = "Books API", description = "Operaciones CRUD para libros") // Anotación para Swagger
public class BookController {
    private final BookServices service;

    public BookController(BookServices service) {
        this.service = service;
    }

    @Operation(summary = "Obtener todos los libros")
    @ApiResponse(responseCode = "200", description = "Lista de libros encontrada")
    @GetMapping
    public ResponseEntity<List<Books>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @Operation(summary = "Crear un nuevo libro")
    @ApiResponse(responseCode = "200", description = "Libro creado exitosamente")
    @ApiResponse(responseCode = "400", description = "Datos del libro inválidos")
    @PostMapping
    public ResponseEntity<Books> create(@Valid @RequestBody Books book) {
        Books savedBook = service.save(book);
        return ResponseEntity.ok(savedBook);
    }

    @Operation(summary = "Buscar libros por título")
    @ApiResponse(responseCode = "200", description = "Libros encontrados")
    @GetMapping("/search")
    public ResponseEntity<List<Books>> searchByTitle(@RequestParam String title) {
        return ResponseEntity.ok(service.findByTitle(title));
    }

    @Operation(summary = "Eliminar un libro por ID")
    @ApiResponse(responseCode = "200", description = "Libro eliminado")
    @ApiResponse(responseCode = "404", description = "Libro no encontrado")
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