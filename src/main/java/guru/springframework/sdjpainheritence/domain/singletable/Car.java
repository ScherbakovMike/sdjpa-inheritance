package guru.springframework.sdjpainheritence.domain.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter @EqualsAndHashCode(callSuper = true)
@DiscriminatorValue("car")
public class Car extends Vehicle {

  private String trimLevel;
}
