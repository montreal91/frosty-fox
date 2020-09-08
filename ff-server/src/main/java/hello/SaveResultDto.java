package hello;

public class SaveResultDto {
  private final String status;
  private final String message;

  public SaveResultDto(String status, String message) {
    this.status = status;
    this.message = message;
  }

  public String getStatus() {
    return status;
  }

  public String getMessage() {
    return message;
  }
}
