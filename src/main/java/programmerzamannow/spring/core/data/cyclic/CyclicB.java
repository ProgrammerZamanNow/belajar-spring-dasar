package programmerzamannow.spring.core.data.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicB {

  private CyclicC cyclicC;
}
