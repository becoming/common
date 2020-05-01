package lu.smarthome.common.exceptions;

import static lu.smarthome.common.constants.HttpStatusCode.UNAUTHORIZED_401;

public class UnauthorizedException extends AbstractRuntimeException {

    @Override
    public int getHttpCode() {
        return UNAUTHORIZED_401;
    }
}
