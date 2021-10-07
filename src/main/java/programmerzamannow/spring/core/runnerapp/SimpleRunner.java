package programmerzamannow.spring.core.runnerapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class SimpleRunner implements ApplicationRunner {

  @Override
  public void run(ApplicationArguments args) throws Exception {
    List<String> profiles = args.getOptionValues("profiles");
    log.info("Profiles : {}", profiles);
  }
}
