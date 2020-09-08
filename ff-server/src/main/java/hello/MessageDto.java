package hello;

public class MessageDto {
  private final Long id;
  private final String text;

  public MessageDto(Long id, String text) {
    this.id = id;
    this.text = text;
  }

  public Long getId() {
    return id;
  }

  public String getText() {
    return text;
  }
}
