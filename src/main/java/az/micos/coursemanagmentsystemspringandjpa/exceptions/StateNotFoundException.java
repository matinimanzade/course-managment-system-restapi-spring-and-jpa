package az.micos.coursemanagmentsystemspringandjpa.exceptions;

public class StateNotFoundException extends Exception {
    public StateNotFoundException(int statusCode) {
        super("State not found for this code :" + statusCode);
    }
}
