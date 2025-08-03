package sv.edu.udb.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "El titulo deber de ser colocado obligatoriamente")
    private String title;

    @Column(nullable = false)
    private String author;

    private Integer publicationYear;
}