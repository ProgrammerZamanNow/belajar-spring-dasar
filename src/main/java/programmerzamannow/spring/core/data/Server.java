package programmerzamannow.spring.core.data;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class Server {

  @PostConstruct
  public void start(){
    log.info("Start Server");
  }

  @PreDestroy
  public void stop(){
    log.info("Stop Server");
  }
}
