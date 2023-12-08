package guru.springframework.sdjpainheritence.domain.msuper;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@EqualsAndHashCode(callSuper = true)
public class OrderHeader extends BaseEntity {

  private String customerName;
}
