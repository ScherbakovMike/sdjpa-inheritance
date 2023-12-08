package guru.springframework.sdjpainheritence.domain.tableperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter @Setter @EqualsAndHashCode
public abstract class Mammal {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private Long id;

  private Integer bodyTemp;

  private String species;

}
