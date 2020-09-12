package greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "")
public class IndexController {
  private final String place;

  public IndexController(String place) {
    this.place = place;
  }

  @GetMapping(value = "/")
  @ResponseBody
  public String home() {
    return String.format("Welcome %s", this.place);
  }
}
