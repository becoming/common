[![Build Status](https://travis-ci.com/smart-home-oss/common.svg?branch=master)](https://travis-ci.com/smart-home-oss/common)
[ ![Download](https://api.bintray.com/packages/smart-home-oss/maven/common/images/download.svg) ](https://bintray.com/smart-home-oss/maven/common/_latestVersion)
# common
Contains a list of commonly used constants all over the place.

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

Relies on Java 11 to force you to jump out of the dark ages.

Repository page : https://bintray.com/beta/#/smart-home-oss/maven/common?tab=overview

In order to use the library you have to add the repositories tag to your `pom.xml` or `settings.xml`

    <repositories>
		<repository>
			<snapshots>
				<enabled>false</enabled>
			</snapshots>
			<releases>
				<enabled>true</enabled>
			</releases>
			<id>bintray-smart-home-oss-maven</id>
			<name>bintray</name>
			<url>https://dl.bintray.com/smart-home-oss/maven</url>
		</repository>
	</repositories>
	
And the dependenccy itself

    <dependency>
    	<groupId>lu.smarthome</groupId>
    	<artifactId>common</artifactId>
    	<version>0.0.8</version>
    	<type>pom</type>
    </dependency>
