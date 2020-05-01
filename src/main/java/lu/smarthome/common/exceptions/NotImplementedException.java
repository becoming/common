package lu.smarthome.common.exceptions;

import static lu.smarthome.common.constants.HttpStatusCode.INTERNAL_SERVER_ERROR_500;

public class NotImplementedException extends AbstractRuntimeException {

    @Override
    public int getHttpCode() {
        return INTERNAL_SERVER_ERROR_500;
    }
}
