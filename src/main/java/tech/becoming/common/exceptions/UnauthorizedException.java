package tech.becoming.common.exceptions;

import lombok.NoArgsConstructor;

import java.util.List;

import static tech.becoming.common.constants.HttpStatusCode.UNAUTHORIZED_401;
import static tech.becoming.common.constants.HttpStatusName.UNAUTHORIZED;

@NoArgsConstructor
public class UnauthorizedException extends AbstractRuntimeException {

    public UnauthorizedException(List<ExceptionDetail> details) {
        super(UNAUTHORIZED, details);
    }

    public UnauthorizedException(ExceptionDetail detail) {
        super(UNAUTHORIZED, detail);
    }

    @Override
    public int getHttpCode() {
        return UNAUTHORIZED_401;
    }
}
