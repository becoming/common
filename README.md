# common
Contains a list of commonly used constants and exceptions.

> Relies on Java 11 to force you to jump out of the dark ages.

Constants :
- HttpHeader
- HttpMethod
- HttpStatusCode
- HttpStatusName
- DateTime
  - "dd-MM-yyyy HH:mm:ss"
  - "dd-MM-yyyy"
  - UTC

Enums : 
- Days
- HoursWithPM
- Months
- Periodicity
- TimesOfDay

Http exception body :
- HttpExceptionBody, useful when creating custom `@ExceptionHandler` with Spring. 

Exceptions :
- AbstractRuntimeException
- BadRequestException
- NotFoundException
- NotImplementedException
- UnauthenticatedException
- UnauthorizedException

```xml
<dependency>
    <groupId>tech.becoming</groupId>
    <artifactId>common</artifactId>
    <version>1.1.0</version>
</dependency>
```
