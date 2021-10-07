package programmerzamannow.spring.core.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;
import programmerzamannow.spring.core.data.Foo;

@Component
public class FooBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {

  @Override
  public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
    GenericBeanDefinition definition = new GenericBeanDefinition();
    definition.setScope("singleton");
    definition.setBeanClass(Foo.class);

    registry.registerBeanDefinition("foo", definition);
  }

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    // nothing
  }
}
