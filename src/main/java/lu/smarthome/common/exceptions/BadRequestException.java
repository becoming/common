package lu.smarthome.common.exceptions;

import static lu.smarthome.common.constants.HttpStatusCode.BAD_REQUEST_400;

public class BadRequestException extends AbstractRuntimeException {

    @Override
    public int getHttpCode() {
        return BAD_REQUEST_400;
    }
}
