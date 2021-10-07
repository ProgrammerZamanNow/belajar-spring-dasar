package programmerzamannow.spring.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerzamannow.spring.core.data.Bar;

@Configuration
public class BarConfiguration {

  @Bean
  public Bar bar(){
    return new Bar();
  }

}
