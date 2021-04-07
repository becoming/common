[![Build Status](https://travis-ci.com/becoming-tech/common.svg?branch=master)](https://travis-ci.com/becoming-tech/common)
[ ![Download](https://api.bintray.com/packages/becoming-tech/maven/common/images/download.svg) ](https://bintray.com/becoming-tech/maven/common/_latestVersion)
# common
Contains a list of commonly used constants and exceptions.

> Relies on Java 11 to force you to jump out of the dark ages.

Constants :
- HttpHeader
- HttpStatusCode
- HttpStatusName

Enums : 
- Days
- HoursWithPM
- Months
- Periodicity
- TimesOfDay

Exceptions :
- AbstractRuntimeException
- BadRequestException
- NotFoundException
- NotImplementedException
- UnauthenticatedException
- UnauthorizedException

Repository page : https://github.com/becoming/common/packages/708107

In order to use the library you have to add the repositories tag to your `pom.xml` or `settings.xml`

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/becoming/*</url>
    </repository>
</repositories>
```
    
And the dependenccy itself

```xml
<dependency>
    <groupId>tech.becoming</groupId>
    <artifactId>common</artifactId>
    <version>1.0.2</version>
</dependency>
```
