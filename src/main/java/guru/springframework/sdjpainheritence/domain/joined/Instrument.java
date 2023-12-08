package guru.springframework.sdjpainheritence.domain.joined;


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
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter @EqualsAndHashCode
public abstract class Instrument {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
}
