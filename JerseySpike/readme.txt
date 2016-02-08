To develop this spike I've followed this guide: https://chiaboy.wordpress.com/2014/07/20/simple-jersey-example-with-intellij-idea-and-tomcat/.
Pay  attention in web.xml:
- to specify the right domain in <param-value>zannik.rest</param-value>
- to take in account the additional path to reach the resources: <url-pattern>/rest/*</url-pattern>

Opening a Browser and insert the address:
http://localhost:8080/newjersey
it appears:
Hello World!
To access the service "/hello", route to:
http://localhost:8080/newjersey/rest/hello/ciao
it appears:
"Jersey says ciao"