## The Application starts and is accessible successfully

### Running the application

    ./gradlew bootRun
    
### Testing the Endpoint

    curl -X GET localhost:8080

### Running the tests

    ./gradlew test
        
### The test results give more information

    /build/reports/tests/test/index.html
        
### Looking up the data in the H2 Database

    http://localhost:8080/h2-console
    
##### DB Connection parameters

    | Property     | Value            |
    |--------------|------------------|
    | Driver Class | org.h2.Driver    |
    | JDBC URL     | jdbc:h2:mem:city |
    | User Name    | sa               |
    | Password     |                  |
    