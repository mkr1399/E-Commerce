# 🛍️ E-Commerce Platform

A full-stack e-commerce platform with admin and customer roles, featuring secure authentication, product listing, inventory control, shopping cart, and order processing. Built using **React + Tailwind CSS** on the frontend and **Java Spring Boot** microservices on the backend.

---

## 🔧 Tech Stack

### 🖥️ Frontend

- **Language**: TypeScript
- **Framework**: ReactJS
- **Styling**: Tailwind CSS
- **Routing**: React Router
- **API**: Fetch API/Axios

#### Pages:

- Login / Signup Page (for Admin and Customer)
- Customer Dashboard
  - Product Listing
  - Cart Component
- Product Detail Page
- Checkout Page
- CMS Dashboard
  - Product Management
  - Inventory Control

---

### ⚙️ Backend

- **Language**: Java
- **Framework**: Spring Boot
- **Authentication/Security**: Spring Security, Keycloak/Auth0
- **API Gateway**: Spring API Gateway
- **Service Discovery**: Eureka
- **ORM**: Hibernate / JPA
- **Message Broker**: Spring Kafka
- **Database**: PostgreSQL

#### Microservices:

- `OrderService`
- `UserService`
- `InventoryService`
- `CartService`
- `ProductService`

---

## 🗃️ Database Schema

### 🧑 User
| Field     | Type        |
|-----------|-------------|
| ID        | UUID / INT  |
| Name      | VARCHAR     |
| Email     | VARCHAR     |
| PhNo      | VARCHAR     |
| Role      | ENUM(Admin/Customer) |

---

### 📦 Product
| Field     | Type        |
|-----------|-------------|
| ID        | UUID / INT  |
| Name      | VARCHAR     |
| Description | TEXT      |
| Price     | DECIMAL     |

---

### 🛒 Cart
| Field     | Type        |
|-----------|-------------|
| ID        | UUID / INT  |
| User_ID   | FK → User   |
| Product_ID| FK → Product|
| Quantity  | INT         |

---

### 🏪 Inventory
| Field          | Type        |
|----------------|-------------|
| ID             | UUID / INT  |
| Product_ID     | FK → Product|
| Product_Quantity | INT       |

---

### 📑 Order Items
| Field      | Type         |
|------------|--------------|
| ID         | UUID / INT   |
| Order_ID   | FK → Orders  |
| Product_ID | FK → Product |
| Quantity   | INT          |
| Price      | DECIMAL      |

---

### 📦 Orders
| Field        | Type        |
|--------------|-------------|
| ID           | UUID / INT  |
| User_ID      | FK → User   |
| Total_Amount | DECIMAL     |
| Status       | ENUM(Pending, Completed, Cancelled) |

---

## 🚀 Deployment

- **CI/CD**: Jenkins
- **Code Quality**: SonarQube

---

## 🛡️ Security

- Role-Based Access Control (RBAC) using **Keycloak** or **Auth0**
- JWT for secure communication

---

## 📬 Messaging (Async Communication)

- **Spring Kafka** used for:
  - Inventory updates
  - Order events
  - Email notifications

---

