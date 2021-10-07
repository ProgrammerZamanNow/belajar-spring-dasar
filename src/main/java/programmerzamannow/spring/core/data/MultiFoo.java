package programmerzamannow.spring.core.data;

import lombok.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MultiFoo {

  @Getter
  private List<Foo> foos;

  public MultiFoo(ObjectProvider<Foo> objectProvider){
    foos = objectProvider.stream().collect(Collectors.toList());
  }

}
