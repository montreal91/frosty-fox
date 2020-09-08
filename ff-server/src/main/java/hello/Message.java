package hello;

public class Message {
  public Message getNextMessage() {
    return nextMessage;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setNextMessage(Message nextMessage) {
    this.nextMessage = nextMessage;
  }

  public Message() {}

  public Message(String text) {
    this.text = text;
  }

  public Long getId() {
    return id;
  }

  public String getText() {
    return text;
  }

  private Long id;
  private String text;
  private Message nextMessage;

  private void setId(Long id) {
    this.id = id;
  }
}
