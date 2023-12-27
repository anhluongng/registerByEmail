# API User registration is authenticated via email
## About The Project
User creates an account, token will be sent via gmail for authentication. When authenticated correctly, the account is activated.

![image](https://github.com/anhluongng/registerByEmail/assets/96836771/d33b5587-0995-4d5d-a382-f1efcde3d06a)

### Built With
Tools used to this project:
* IntelliJ IDEA
* Mysql
* Postman
  
Technologies used to this project:
* Spring
* Maven
  
![image](https://github.com/anhluongng/registerByEmail/assets/96836771/d3bc9462-f68c-4d86-a937-8fa1ed3bbe46)

## Getting Started
Let's go to config `application.properties` file
```
# Data properties
spring.datasource.url=jdbc:mysql://localhost:3306/testthuctap
spring.datasource.username=root
spring.datasource.password=123456
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate properties
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Hibernate ddl auto (create, create-drop, validate, update)
spring.jpa.hibernate.ddl-auto = update

###### Email Properties ######
# smtp mail properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=<Login User to SMTP server>
spring.mail.password=<Login password to SMTP server>
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```
## Usage
### Run project and use postman with `/register`:

![image](https://github.com/anhluongng/registerByEmail/assets/96836771/b053dbca-5b74-405e-87aa-acf47d3fd2d9)

### Token will be sent via gmail for authentication:

![image](https://github.com/anhluongng/registerByEmail/assets/96836771/1a9b6890-8199-414a-a388-07bdbed4e2f8)


### Authenticate with link or `/confirm-account` with value of token

![image](https://github.com/anhluongng/registerByEmail/assets/96836771/5c361576-605e-446c-a9dd-2b817741ebd3)


Now the account has been activated.







