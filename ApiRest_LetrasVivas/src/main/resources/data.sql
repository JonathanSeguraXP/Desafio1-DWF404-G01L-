
MERGE INTO books (id, title, author, publication_year) KEY(id) VALUES
    (1, 'El Alquimista', 'Paulo Coelho', 1988),
    (2, '1984', 'George Orwell', 1949),
    (3, 'Cien años de soledad', 'Gabriel García Márquez', 1967);


ALTER TABLE books ALTER COLUMN id RESTART WITH 4
    WHERE NOT EXISTS (SELECT 1 FROM books WHERE id >= 4);