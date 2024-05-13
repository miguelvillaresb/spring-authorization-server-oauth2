# OAuth2 and OpenID service using Spring Authorization Server

This an example OAuth2 / OpenID Identity Provider based on Spring Security and Spring Authorization Server.

## Repository content

1. Spring Authorization Server backend implementing OAuth2 and OpenID authentication flows.
2. Postman collection ready to use in order to validate OAuth2 authentication flow.
3. OpenAPI schema and skeleton controller for credentials based authentication, token creation and validation.

## Steps to deploy
1. Clone this repository.
2. Run `mvn spring-boot:run`
3. The server will start in Spring Security debug mode so we will be able to track the flow of requests. Edit `application.yml` file to disable debug mode on Spring Security.

## Testing OAuth2 flow
1. Import postman collection file inside `postman` folder.
2. Open the request included in the collection. There is only one request.
3. Click on the `Get New Access Token` button inside `Authorization` tab.
4. Authenticate by form login and authorize on the consent screen for the client application. Use credentials admin / admin
5. Finally you will get the access token. You can also request new tokens. As you are already logged in you will not be asked for credentials.

References
- [Spring Authorization Server](https://spring.io/projects/spring-authorization-server)
