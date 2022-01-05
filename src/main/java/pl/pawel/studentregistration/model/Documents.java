package pl.pawel.studentregistration.model;

import javax.persistence.*;

@Entity
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String document1;

    @Column
    private String document2;

    @Column
    private String document3;
}
