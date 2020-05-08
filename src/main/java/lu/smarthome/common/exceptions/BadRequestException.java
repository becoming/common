package lu.smarthome.common.exceptions;

import java.util.List;

import static lu.smarthome.common.constants.HttpStatusCode.BAD_REQUEST_400;
import static lu.smarthome.common.constants.HttpStatusName.BAD_REQUEST;

public class BadRequestException extends AbstractRuntimeException {

    public BadRequestException(List<ExceptionDetail> details) {
        super(BAD_REQUEST, details);
    }

    public BadRequestException(ExceptionDetail detail) {
        super(BAD_REQUEST, detail);
    }

    @Override
    public int getHttpCode() {
        return BAD_REQUEST_400;
    }
}
