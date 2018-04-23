package net.sargue.mailgun;

public class MailgunException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public MailgunException() {
        // empty constructor
    }

    public MailgunException(String message) {
        super(message);
    }

    public MailgunException(String message, Throwable cause) {
        super(message, cause);
    }

    public MailgunException(Throwable cause) {
        super(cause);
    }

    public MailgunException(String message,
                            Throwable cause,
                            boolean enableSuppression,
                            boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
