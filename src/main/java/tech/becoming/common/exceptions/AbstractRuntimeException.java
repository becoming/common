package tech.becoming.common.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class AbstractRuntimeException extends RuntimeException {

    private List<ExceptionDetail> details = new ArrayList<>();

    public AbstractRuntimeException(String message, List<ExceptionDetail> details) {
        super(message);
        this.details = details;
    }

    public AbstractRuntimeException(String message, ExceptionDetail detail) {
        super(message);
        details.add(detail);
    }

    public abstract int getHttpCode();

    @Override
    public String toString() {
        var msgs = details.stream().map(ExceptionDetail::getMessage).toArray();

        return "{" +
                "details: " + Arrays.toString(msgs)
                + '}';
    }
}
