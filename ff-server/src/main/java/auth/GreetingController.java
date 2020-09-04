package auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
  private static final String TEMPLATE = "Hello, %s";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/greeting/")
  public auth.Greeting greeting(@RequestParam(value="name", defaultValue = "Home") String name) {
    return new auth.Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
  }
}
