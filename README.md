# CDACproject
he Intelligent City Management Web Application is to create a centralized, digital platform that enables citizens to report civic issues such as garbage collection problems, potholes, broken streetlights, or water leakage, and allows municipal departments to respond and resolve them efficiently. The application is designed to improve urban infrastructure management by bridging the communication gap between the public and local authorities. It includes features for issue reporting with geolocation tagging, real-time status updates, department-wise issue assignment, and performance monitoring through analytics dashboards. The system supports role-based access for different users such as citizens, municipal staff, and administrators, ensuring secure and organized operations. By integrating technologies like Advanced Java and Spring Boot, the system provides a scalable and efficient solution.
smart-city-management
│
├── pom.xml
├── SmartCityApplication.java
│
├── config
│   ├── SecurityConfig.java
│
├── controller
│   ├── AuthController.java
│   ├── CitizenController.java
│   ├── AdminController.java
│   ├── StaffController.java
│
├── entity
│   ├── User.java
│   ├── Issue.java
│   ├── Department.java
│
├── repository
│   ├── UserRepository.java
│   ├── IssueRepository.java
│   ├── DepartmentRepository.java
│
├── service
│   ├── UserService.java
│   ├── IssueService.java
│   ├── DepartmentService.java
│
├── dto
│   ├── LoginDto.java
│   ├── RegisterDto.java
│
├── templates
│   ├── login.html
│   ├── register.html
│   ├── citizen-dashboard.html
│   ├── report-issue.html
│   ├── admin-dashboard.html
│   ├── assign-issue.html
│   ├── staff-dashboard.html
│
└── resources
    ├── application.properties
1️⃣ Main Class
