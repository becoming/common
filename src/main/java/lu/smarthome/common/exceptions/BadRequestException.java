package lu.smarthome.common.exceptions;

import static lu.smarthome.common.constants.HttpConst.BAD_REQUEST_400;

public class BadRequestException extends AbstractException {

    @Override
    public int getHttpCode() {
        return BAD_REQUEST_400;
    }
}
