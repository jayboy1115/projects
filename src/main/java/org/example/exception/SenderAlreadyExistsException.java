package org.example.exception;

public class SenderAlreadyExistsException extends RuntimeException {
    public SenderAlreadyExistsException(String theezy) {
        super(theezy);
    }
}
