package uc.entities;

public class OperationResult<T> {

    private boolean succeeded;
    private T result;
    private String message;

    public OperationResult() {
    }

    public OperationResult(boolean succeeded, T result, String message)
    {
        this.succeeded = succeeded;
        this.result = result;
        this.message = message;
    }

    public boolean isSucceeded() {
        return succeeded;
    }

    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
