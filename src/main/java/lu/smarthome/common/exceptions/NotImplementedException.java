package lu.smarthome.common.exceptions;

import java.util.List;

import static lu.smarthome.common.constants.HttpStatusCode.INTERNAL_SERVER_ERROR_500;
import static lu.smarthome.common.constants.HttpStatusName.NOT_IMPLEMENTED;

public class NotImplementedException extends AbstractRuntimeException {

    public NotImplementedException(List<ExceptionDetail> details) {
        super(NOT_IMPLEMENTED, details);
    }

    public NotImplementedException(ExceptionDetail detail) {
        super(NOT_IMPLEMENTED, detail);
    }

    @Override
    public int getHttpCode() {
        return INTERNAL_SERVER_ERROR_500;
    }
}
