Frontend:-

Language: Typescript
Framework/Libraries:- ReactJS, Tailwind CSS, Fetch API, React Router

Pages-
- Login page/SignUp Page(Admin, Customer)
- Customer Dashboard(Product Listing, cart component)
- Product Detail Page
- Checkout
- CMS DashBoard(Product, Inventory Control)


Backend:-
Language: Java
Framework/Libraries:- SpringBoot, spring security, spring api gateway, Hibernate/JPA, spring Kafka
security: keycloak or auth0
DataBase:- PostgreSQL


Services:
- OrderService
- UserService
- InventoryService
- CartService
- ProductService

DB Tables:-


User:
|
|- ID
|- Name
|- email
|- Phno
|- Role

Product:
|
|- ID
|- Name
|- Description
|- Price

Cart"
|
|- id
|- user_id
|- product_id
|- quantity

Inventory:
|
|- ID
|- Product_id
|- product_quantity


OrderItems:
|
|- ID
|- order_id
|- product_id
|- quantity
|- price

Orders:
|
|- ID
|- user_id
|- total_amount
|- status


Deployment:

Jenkins

Additnl:

SonarQube
