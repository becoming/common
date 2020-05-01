package lu.smarthome.common.exceptions;

import static lu.smarthome.common.constants.HttpStatusCode.NOT_FOUND_404;

public class NotFoundException extends AbstractRuntimeException {

    @Override
    public int getHttpCode() {
        return NOT_FOUND_404;
    }
}
