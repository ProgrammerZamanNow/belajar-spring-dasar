package programmerzamannow.spring.core;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import programmerzamannow.spring.core.data.Foo;

@Configuration
public class BeanNameConfiguration {

  @Primary
  @Bean(name = "fooFirst")
  public Foo foo1(){
    return new Foo();
  }

  @Bean(name = "fooSecond")
  public Foo foo2(){
    return new Foo();
  }

}
