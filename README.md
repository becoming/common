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

Repository page : https://bintray.com/beta/#/becoming-tech/maven/common?tab=overview

In order to use the library you have to add the repositories tag to your `pom.xml` or `settings.xml`

```xml
<repositories>
    <repository>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <releases>
            <enabled>true</enabled>
        </releases>
        <id>bintray-becoming-tech-maven</id>
        <name>bintray</name>
        <url>https://dl.bintray.com/becoming-tech/maven</url>
    </repository>
</repositories>
```
    
And the dependenccy itself

```xml
<dependency>
    <groupId>tech.becoming</groupId>
    <artifactId>common</artifactId>
    <version>0.0.1</version>
    <type>pom</type>
</dependency>
```
