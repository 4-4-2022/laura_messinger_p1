# PC Parts Builder API

## Project Description

This project simulates an API that might be used for a website that helps people build computers. 

I developed three back-end services with three separate data sources (products, customers, and orders) to be consumed and re-exposed through the front-facing API. The end product API would then theoretically be used to construct the front-end.

## Technologies Used

- Java 8
- Spring Boot 2.6.7
- Spring Web 2.6.7
- Spring Data JPA 2.6.4
- PostgreSQL 14.3
- DBeaver 22.0.5
- Postman 9.19
- Spring Tool Suite 4.14

## Features

- [x] Java application that retrieves and exposes data from a database of **products** with REST
- [x] Java application that retrieves and exposes data from a database of **customers** with REST
- [x] Java application that retrieves and exposes data from a database of **orders** with REST
- [x] Java application that consumes the three above services and exposes all of the data with REST

To-do list:
- [ ] Change the Orders REST service to SOAP
- [ ] Work on more logging and testing

## Getting Started
On Windows:  
`git clone https://github.com/4-4-2022/laura_messinger_p1.git`  
Be sure your environment has JDK8, Spring Tool Suite 4, and Postman installed.  

## Usage
1. In STS, run all four applications in the Spring Boot dashboard.  
![image](https://user-images.githubusercontent.com/40044460/170762114-aedf1896-b1f1-47a9-83a9-797814955d3a.png)
2. In Postman, test out different endpoints:  


**GET** http://localhost:8080/accounts/all  
**Request body:** none  
**Return body:** all accounts in the server database  

**POST** http://localhost:8080/accounts/validate  
**Request body:** username and password  
**Return body:** true or false depending if credentials are matched  

**POST** http://localhost:8080/accounts/new  
**Request body:** email, username, and password  
**Return body:** none (but updates database)  

**POST** http://localhost:8080/accounts/newcomment  
**Request body:** account id, product id, and comment string  
**Return body:** none (but updates database)  

**GET** http://localhost:8080/products/all  
**Request body:** none  
**Return body:** all products in the server database

**GET** http://localhost:8080/products/gpu (or any part)  
**Request body:** none  
**Return body:** all GPU (or specified part) products in the server database

**GET** http://localhost:8080/products/coolers/search?liquid=true (or other property)  
**Request body:** none  
**Return body:** all liquid coolers (or specified property) in the server database

**GET** http://localhost:8080/products/cases/search?color=black&manufacturer=corsair (or other combination)  
**Request body:** none  
**Return body:** all black Corsair cases (or specified combination) in the server database

**GET** http://localhost:8080/orders/all  
**Request body:** none  
**Return body:** all orders in the server database

**POST** http://localhost:8080/orders/new  
**Request body:** account id, product id, and unix time  
**Return body:** none (but updates database)

**DELETE** http://localhost:8083/orders/cancel  
**Request body:** order id  
**Return body:** none (but updates database)

## License

None

