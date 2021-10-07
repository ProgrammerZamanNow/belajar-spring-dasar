package programmerzamannow.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerzamannow.spring.core.data.Bar;
import programmerzamannow.spring.core.data.Foo;
import programmerzamannow.spring.core.data.FooBar;

public class DependencyInjectionTest {

  private ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
  }

  @Test
  void testDI() {

    Foo foo = applicationContext.getBean("fooSecond", Foo.class);
    Bar bar = applicationContext.getBean(Bar.class);
    FooBar fooBar = applicationContext.getBean(FooBar.class);

    Assertions.assertSame(foo, fooBar.getFoo());
    Assertions.assertSame(bar, fooBar.getBar());

  }

  @Test
  void testNoDI() {

    var foo = new Foo();
    var bar = new Bar();

    var fooBar = new FooBar(foo, bar);

    Assertions.assertSame(foo, fooBar.getFoo());
    Assertions.assertSame(bar, fooBar.getBar());

  }
}
