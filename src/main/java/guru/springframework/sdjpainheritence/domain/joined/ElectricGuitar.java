package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@EqualsAndHashCode(callSuper = true)
public class ElectricGuitar extends Guitar {

  private Integer numberOfPickups;
}
