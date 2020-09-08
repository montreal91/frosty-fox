package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {
  private final MessageDao messageDao = new MessageDao();

  @GetMapping("/add-message/")
  public SaveResultDto greeting(@RequestParam(value="text", defaultValue = "Hello, World") String text) {
    messageDao.createNewMessage(text);
    return new SaveResultDto("OK", "Everything's good");
  }
}
