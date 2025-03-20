# Banking Application

A full-fledged banking application built using **Spring Boot** for the backend and **React** for the frontend. This application allows users to create accounts, deposit and withdraw money, retrieve account details, and delete accounts.

## Features
- Create a new bank account with an initial balance
- Deposit and withdraw funds
- Retrieve account details (name and balance)
- Display all accounts on demand
- Delete accounts
- Responsive UI with a navbar for easy navigation

## Technologies Used
### Backend (Spring Boot)
- **Spring Boot** - RESTful API development
- **Spring Data JPA** - Database interactions
- **MySql Database** 
- **Spring Web** - API handling
- **Spring Boot DevTools** - Development enhancements

### Frontend (React)
- **React.js** - UI development
- **Axios** - API requests
- **Flexbox** - Responsive styling

## Installation and Setup
### Backend Setup (Spring Boot)
1. Clone the repository:
   ```sh
   git clone https://github.com/UtsavSingh29/Banking_Application.git
   cd Banking_Application/backend
   ```
2. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```
   or using Gradle:
   ```sh
   ./gradlew bootRun
   ```
3. The API will be available at `http://localhost:8080/api/accounts`.

### Frontend Setup (React)
1. Navigate to the frontend directory:
   ```sh
   cd Banking_Application/frontend
   ```
2. Install dependencies:
   ```sh
   npm install
   ```
3. Start the development server:
   ```sh
   npm start
   ```
4. The React app will be available at `http://localhost:3000`.

## API Endpoints
### Account Management
- **Create Account**: `POST /api/accounts`
- **Get Account**: `GET /api/accounts/{id}`
- **Get All Accounts**: `GET /api/accounts`
- **Deposit Money**: `POST /api/accounts/{id}/deposit`
- **Withdraw Money**: `POST /api/accounts/{id}/withdraw`
- **Delete Account**: `DELETE /api/accounts/{id}`

## Contributing
Contributions are welcome! Feel free to fork the repository and submit pull requests.

## License
This project is licensed under the **MIT License**.

## Contact
For any queries, feel free to reach out:
- **GitHub**: [UtsavSingh29](https://github.com/UtsavSingh29)
