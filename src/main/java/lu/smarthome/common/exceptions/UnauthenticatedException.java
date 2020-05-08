package lu.smarthome.common.exceptions;

import java.util.List;

import static lu.smarthome.common.constants.HttpStatusCode.UNAUTHORIZED_401;
import static lu.smarthome.common.constants.HttpStatusName.UNAUTHORIZED;

public class UnauthenticatedException extends AbstractRuntimeException {

    public UnauthenticatedException(List<ExceptionDetail> details) {
        super(UNAUTHORIZED, details);
    }

    public UnauthenticatedException(ExceptionDetail detail) {
        super(UNAUTHORIZED, detail);
    }

    @Override
    public int getHttpCode() {
        return UNAUTHORIZED_401;
    }
}
