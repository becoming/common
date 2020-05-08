package lu.smarthome.common.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExceptionDetailTest {

    @Test
    public void getThrowableMessage() {

        Exception e1 = new Exception("1");
        Exception e2 = new Exception("2", e1);
        Exception e3 = new Exception("3", e2);

        ExceptionDetail detail = ExceptionDetail.builder().throwable(e3).build();
        assertEquals("1; 2; 3", detail.getThrowableMessage());

    }
}