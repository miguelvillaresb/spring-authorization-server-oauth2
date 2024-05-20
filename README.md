# OAuth2.1 and OpenID service using Spring Authorization Server

This is an example OAuth2.1 / OpenID Identity Provider based on Spring Security and Spring Authorization Server.

## Repository content

1. Spring Boot backend:
     - OAuth2.1 and OpenID implementation using Spring Authorization Server. This implementation includes
        - Support to delegate authentication to a third party system.
        - Introspect endpoint customization to include new claims.
     - OpenAPI schema and skeleton controller for custom token validation.
3. Postman collection ready to use with 2 requests:
     - Request `OAuth2 Flow test` to validate OAuth2.1 authentication flow.
     - Request to validate OAuth2.1 `introspect` endpoint customization.

## Steps to deploy
1. Clone this repository.
2. Run `mvn spring-boot:run`
3. The server will start in Spring Security debug mode so we will be able to track the flow of requests. Edit `application.yml` file to disable debug mode on Spring Security.
4. OpenAPI swagger will be available in http://localhost:9000/swagger-ui/index.html

## Testing OAuth2.1 flow
1. Import postman collection file included inside `postman` folder.
2. Open the `OAuth2 Flow test` request included in the collection.
3. Click on the `Get New Access Token` button inside `Authorization` tab.
<p align="center" width="100%">
  <img width="461" alt="image" src="https://github.com/miguelvillaresb/spring-authorization-server-oauth2/assets/91469337/ce12907f-578b-425f-8f2a-15214a89275d">
</p>

4. Authenticate by form login and authorize on the consent screen for the client application. Use credentials admin / admin
<p align="center" width="100%">
  <img width="415" alt="image" src="https://github.com/miguelvillaresb/spring-authorization-server-oauth2/assets/91469337/3acb9236-4226-45d4-aad7-43d011e03dc7">
</p>
<p align="center" width="100%">
  <img width="418" alt="image" src="https://github.com/miguelvillaresb/spring-authorization-server-oauth2/assets/91469337/00e24d85-3386-4dcf-b256-711dae149325">
</p>

5. Finally you will get the access token. You can also request new tokens. As you are already logged in you will not be asked for credentials.
<p align="center" width="100%">
<img width="325" alt="image" src="https://github.com/miguelvillaresb/spring-authorization-server-oauth2/assets/91469337/e81324ea-8d84-43a6-8011-0e10601b32f7">
</p>

## References
- [Spring Authorization Server](https://spring.io/projects/spring-authorization-server)
- [Spring Authorization Server endpoints customization](https://docs.spring.io/spring-authorization-server/reference/protocol-endpoints.html)

## Next steps
- Change `WebSecurityConfig` to delegate login into NYX and get the NYX token.
- Change `CustomAuthenticationSuccessHandler` to get NYX token by username and include as a new claim.
