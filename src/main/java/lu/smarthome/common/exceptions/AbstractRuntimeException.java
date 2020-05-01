package lu.smarthome.common.exceptions;

public abstract class AbstractRuntimeException extends RuntimeException {

    public abstract int getHttpCode();

}
