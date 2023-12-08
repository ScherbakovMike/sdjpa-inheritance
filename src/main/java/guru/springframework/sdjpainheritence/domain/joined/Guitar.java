package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@EqualsAndHashCode(callSuper = true)
public class Guitar extends Instrument {

  private Integer numberOfString;
}
