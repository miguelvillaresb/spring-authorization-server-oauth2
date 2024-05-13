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
4. OpenAPI swagger will be available in http://localhost:9000/swagger-ui/

## Testing OAuth2 flow
1. Import postman collection file included inside `postman` folder.
2. Open the request included in the collection. There is only one request.
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

References
- [Spring Authorization Server](https://spring.io/projects/spring-authorization-server)
