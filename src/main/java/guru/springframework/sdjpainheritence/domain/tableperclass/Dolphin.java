package guru.springframework.sdjpainheritence.domain.tableperclass;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@EqualsAndHashCode(callSuper = true)
@Getter @Setter
public class Dolphin extends Mammal {

  private Boolean hasSpots;

}
