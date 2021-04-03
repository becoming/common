package tech.becoming.common.exceptions;

import lombok.NoArgsConstructor;

import java.util.List;

import static tech.becoming.common.constants.HttpStatusCode.BAD_REQUEST_400;
import static tech.becoming.common.constants.HttpStatusName.BAD_REQUEST;

public class BadRequestException extends AbstractRuntimeException {

    public BadRequestException() {
        super(BAD_REQUEST);
    }

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

    public static void throwIfHasDetails(List<ExceptionDetail> details) {
        if(details.size() > 0) {
            throw new BadRequestException(details);
        }
    }
}
