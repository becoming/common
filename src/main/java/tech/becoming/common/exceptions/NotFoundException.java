package tech.becoming.common.exceptions;

import java.util.List;
import java.util.Optional;

import static tech.becoming.common.constants.HttpStatusCode.NOT_FOUND_404;
import static tech.becoming.common.constants.HttpStatusName.NOT_FOUND;

public class NotFoundException extends AbstractRuntimeException {

    public NotFoundException() {
        super(NOT_FOUND);
    }

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

    public static <T> T throwIfEmpty(Optional<T> optional) {
        return optional.orElseThrow(NotFoundException::new);
    }
}
