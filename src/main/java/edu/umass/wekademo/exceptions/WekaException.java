package edu.umass.wekademo.exceptions;

/**
 * Wrapper class to rethrow generic Weka exceptions at runtime
 */
public class WekaException extends RuntimeException {
    public WekaException(Throwable cause) {
        super(cause);
    }
}
