package tech.becoming.common.exceptions;

import java.util.List;

import static tech.becoming.common.constants.HttpStatusCode.BAD_REQUEST_400;
import static tech.becoming.common.constants.HttpStatusName.BAD_REQUEST;

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
