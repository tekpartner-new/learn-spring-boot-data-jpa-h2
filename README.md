# Having trouble with running tests with H2 database.

## The Application starts and is accessible successfully

### Running the application

    ./gradlew bootRun
    
### Testing the Endpoint

    curl -X GET localhost:8080
    
## However, when I run the tests the test fails

### Running the tests

    ./gradlew test
    
### Exception Raised that the table already exists

    Caused by: org.h2.jdbc.JdbcSQLException: Table "CITY" already exists; SQL statement:
    CREATE TABLE city ( id BIGINT NOT NULL, country VARCHAR(255) NOT NULL, map VARCHAR(255) NOT NULL, name VARCHAR(255) NOT NULL, state VARCHAR(2555) NOT NULL, PRIMARY KEY (id) ) [42101-196]
        at org.h2.message.DbException.getJdbcSQLException(DbException.java:345)
        at org.h2.message.DbException.get(DbException.java:179)
        at org.h2.message.DbException.get(DbException.java:155)
        at org.h2.command.ddl.CreateTable.update(CreateTable.java:117)
        at org.h2.command.CommandContainer.update(CommandContainer.java:101)
        at org.h2.command.Command.executeUpdate(Command.java:260)
        at org.h2.jdbc.JdbcStatement.executeInternal(JdbcStatement.java:192)
        at org.h2.jdbc.JdbcStatement.execute(JdbcStatement.java:164)
        at com.zaxxer.hikari.pool.ProxyStatement.execute(ProxyStatement.java:95)
        at com.zaxxer.hikari.pool.HikariProxyStatement.execute(HikariProxyStatement.java)
        at org.springframework.jdbc.datasource.init.ScriptUtils.executeSqlScript(ScriptUtils.java:471)
        ... 105 more
        
### The test results give more information

    /build/reports/tests/test/classes/net.tekpartner.learn.springbootsampledatajpa.service.CityServiceImplTest.html