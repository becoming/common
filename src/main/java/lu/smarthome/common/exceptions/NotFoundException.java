package lu.smarthome.common.exceptions;

import java.util.List;

import static lu.smarthome.common.constants.HttpStatusCode.NOT_FOUND_404;
import static lu.smarthome.common.constants.HttpStatusName.NOT_FOUND;

public class NotFoundException extends AbstractRuntimeException {

    public NotFoundException(List<ExceptionDetail> details) {
        super(NOT_FOUND, details);
    }

    public NotFoundException(ExceptionDetail detail) {
        super(NOT_FOUND, detail);
    }

    @Override
    public int getHttpCode() {
        return NOT_FOUND_404;
    }
}
