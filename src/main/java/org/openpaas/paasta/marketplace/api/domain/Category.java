package org.openpaas.paasta.marketplace.api.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Category extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    @NotNull
    @Size(min = 1, max = 50)
    private String name;

    @Lob
    private String description;

    private Long seq;

    public enum Direction {
        Up, Down
    }

    public interface Create {
    }

    public interface Update {
    }

}
