public class DeplacementException extends RuntimeException {

  private static final String MESSAGE = "déplacement interdit !";
  public DeplacementException() {
    super(MESSAGE);
  }

}
