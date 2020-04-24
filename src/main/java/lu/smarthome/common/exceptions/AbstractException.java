package lu.smarthome.common.exceptions;

public abstract class AbstractException extends RuntimeException {

    public abstract int getHttpCode();

}
