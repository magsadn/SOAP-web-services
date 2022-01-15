
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

# SOAP-web-services

SOAP (Simple Object Access Protocol) is a lightweight protocol for exchange of information in a decentralized, distributed environment. It is an XML based protocol that consists of three parts: an envelope that defines a framework for describing what is in a message and how to process it, a set of encoding rules for expressing instances of application-defined datatypes, and a convention for representing remote procedure calls and responses. SOAP can potentially be used in combination with a variety of other protocols; however, the only bindings defined in this document describe how to use SOAP in combination with HTTP and HTTP Extension Framework.

## producing-web-service

http://localhost:8080/ws/countries.wsdl

Add [countries.xsd] file to /countries-service/src/main/resources/countries.xsd



## Requests

You can use to SoapUI for XML requests, Postman or Advanced REST Client by MuleSoft for JSON requests.

get country : http://localhost:8090/country/{name}

{name} - Spain, United Kingdom, Poland, United States America, Brazil

### XML requests: 

For XML requests @GetMapping(value = "/{name}") in 

countries-client/src/main/java/com/magsad/consumingwebservice/RestController.java

### JSON requests: 

For JSON request add produces = MediaType.APPLICATION_JSON_VALUE 

to @GetMapping(value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE) in 

countries-client/src/main/java/com/magsad/consumingwebservice/RestController.java


[license-shield]: https://img.shields.io/github/license/magsadn/SOAP-web-services?style=for-the-badge
[license-url]: https://github.com/magsadn/SOAP-web-services/blob/main/LICENSE
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=249
[linkedin-url]: https://www.linkedin.com/in/magsad/
[countries.xsd]: https://github.com/magsadn/SOAP-web-services/blob/main/countries-service/src/main/resources/countries.xsd
[producing-web-service]: https://spring.io/guides/gs/producing-web-service/
[consuming-web-service]: https://spring.io/guides/gs/consuming-web-service/

### Source : [producing-web-service]            [consuming-web-service]
