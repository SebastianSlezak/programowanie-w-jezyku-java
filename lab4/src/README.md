### Wyniki z konsoli
<hr>

```
gru 06, 2024 12:06:26 AM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 6.2.12.Final
gru 06, 2024 12:06:26 AM org.hibernate.cfg.Environment <clinit>
INFO: HHH000406: Using bytecode reflection optimizer
gru 06, 2024 12:06:26 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using built-in connection pool (not intended for production use)
gru 06, 2024 12:06:26 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: Loaded JDBC driver class: org.postgresql.Driver
gru 06, 2024 12:06:26 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001012: Connecting with JDBC URL [jdbc:postgresql://localhost:5432/lab4]
gru 06, 2024 12:06:26 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {password=****, user=postgres}
gru 06, 2024 12:06:26 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
gru 06, 2024 12:06:26 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH10001115: Connection pool size: 20 (min=1)
gru 06, 2024 12:06:26 AM org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl constructDialect
WARN: HHH90000025: PostgreSQLDialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
gru 06, 2024 12:06:27 AM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
gru 06, 2024 12:06:27 AM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@259b85d6] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: 
    insert 
    into
        rectangles
        (alpha,blue,green,red,height,width) 
    values
        (?,?,?,?,?,?)
Hibernate: 
    insert 
    into
        triangles
        (a,b,c,alpha,blue,green,red) 
    values
        (?,?,?,?,?,?,?)
All shapes in the database:
Hibernate: 
    select
        r1_0.id,
        r1_0.alpha,
        r1_0.blue,
        r1_0.green,
        r1_0.red,
        r1_0.height,
        r1_0.width 
    from
        rectangles r1_0
Hibernate: 
    select
        t1_0.id,
        t1_0.a,
        t1_0.b,
        t1_0.c,
        t1_0.alpha,
        t1_0.blue,
        t1_0.green,
        t1_0.red 
    from
        triangles t1_0
Rectangle{width=8.0, height=12.0}
Area: 96.0
Perimeter: 40.0
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Rectangle{width=8.0, height=12.0}
Area: 96.0
Perimeter: 40.0
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Rectangle{width=8.0, height=12.0}
Area: 96.0
Perimeter: 40.0
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Rectangle{width=8.0, height=12.0}
Area: 96.0
Perimeter: 40.0
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Rectangle{width=8.0, height=12.0}
Area: 96.0
Perimeter: 40.0
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Rectangle{width=8.0, height=12.0}
Area: 96.0
Perimeter: 40.0
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Rectangle{width=8.0, height=12.0}
Area: 96.0
Perimeter: 40.0
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Rectangle{width=8.0, height=12.0}
Area: 96.0
Perimeter: 40.0
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Rectangle{width=5.0, height=10.0}
Area: 50.0
Perimeter: 30.0
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Rectangle{width=5.0, height=10.0}
Area: 50.0
Perimeter: 30.0
Color: Red: 255, Green: 0, Blue: 0, Alpha: 255
Triangle{a=3.0, b=4.0, c=5.0}
Area: 6.0
Perimeter: 12.0
Color: Red: 0, Green: 255, Blue: 0, Alpha: 255
Triangle{a=3.0, b=4.0, c=5.0}
Area: 6.0
Perimeter: 12.0
Color: Red: 0, Green: 255, Blue: 0, Alpha: 255
Triangle{a=3.0, b=4.0, c=5.0}
Area: 6.0
Perimeter: 12.0
Color: Red: 0, Green: 255, Blue: 0, Alpha: 255
Triangle{a=3.0, b=4.0, c=5.0}
Area: 6.0
Perimeter: 12.0
Color: Red: 0, Green: 255, Blue: 0, Alpha: 255
Triangle{a=3.0, b=4.0, c=5.0}
Area: 6.0
Perimeter: 12.0
Color: Red: 0, Green: 255, Blue: 0, Alpha: 255
Triangle{a=3.0, b=4.0, c=5.0}
Area: 6.0
Perimeter: 12.0
Color: Red: 0, Green: 255, Blue: 0, Alpha: 255
Triangle{a=3.0, b=4.0, c=5.0}
Area: 6.0
Perimeter: 12.0
Color: Red: 0, Green: 255, Blue: 0, Alpha: 255
Triangle{a=3.0, b=4.0, c=5.0}
Area: 6.0
Perimeter: 12.0
Color: Red: 0, Green: 255, Blue: 0, Alpha: 255
Triangle{a=3.0, b=4.0, c=5.0}
Area: 6.0
Perimeter: 12.0
Color: Red: 0, Green: 255, Blue: 0, Alpha: 255
Triangle{a=3.0, b=4.0, c=5.0}
Area: 6.0
Perimeter: 12.0
Color: Red: 0, Green: 255, Blue: 0, Alpha: 255
gru 06, 2024 12:06:28 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PoolState stop
INFO: HHH10001008: Cleaning up connection pool [jdbc:postgresql://localhost:5432/lab4]
```

### Testy
<hr>

```
gru 06, 2024 12:02:48 AM org.hibernate.Version logVersion
INFO: HHH000412: Hibernate ORM core version 6.2.12.Final
gru 06, 2024 12:02:48 AM org.hibernate.cfg.Environment <clinit>
INFO: HHH000406: Using bytecode reflection optimizer
gru 06, 2024 12:02:48 AM org.hibernate.boot.jaxb.internal.stax.LocalXmlResourceResolver resolveEntity
WARN: HHH90000012: Recognized obsolete hibernate namespace http://hibernate.sourceforge.net/hibernate-configuration. Use namespace http://www.hibernate.org/dtd/hibernate-configuration instead.  Support for obsolete DTD/XSD namespaces may be removed at any time.
gru 06, 2024 12:02:48 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
WARN: HHH10001002: Using built-in connection pool (not intended for production use)
gru 06, 2024 12:02:48 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001005: Loaded JDBC driver class: org.h2.Driver
gru 06, 2024 12:02:48 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001012: Connecting with JDBC URL [jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false]
gru 06, 2024 12:02:48 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001001: Connection properties: {user=sa}
gru 06, 2024 12:02:48 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
INFO: HHH10001003: Autocommit mode: false
gru 06, 2024 12:02:48 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
INFO: HHH10001115: Connection pool size: 20 (min=1)
gru 06, 2024 12:02:48 AM org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl constructDialect
WARN: HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
gru 06, 2024 12:02:49 AM org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
INFO: HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: 
    drop table if exists rectangles cascade 
gru 06, 2024 12:02:49 AM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@5e5ddfbc] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: 
    drop table if exists triangles cascade 
Hibernate: 
    create table rectangles (
        alpha integer not null,
        blue integer not null,
        green integer not null,
        height float(53) not null,
        red integer not null,
        width float(53) not null,
        id bigint generated by default as identity,
        primary key (id)
    )
gru 06, 2024 12:02:49 AM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@47df5041] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: 
    create table triangles (
        a float(53) not null,
        alpha integer not null,
        b float(53) not null,
        blue integer not null,
        c float(53) not null,
        green integer not null,
        red integer not null,
        id bigint generated by default as identity,
        primary key (id)
    )
Hibernate: 
    insert 
    into
        rectangles
        (alpha,blue,green,red,height,width,id) 
    values
        (?,?,?,?,?,?,default)
Hibernate: 
    select
        r1_0.id,
        r1_0.alpha,
        r1_0.blue,
        r1_0.green,
        r1_0.red,
        r1_0.height,
        r1_0.width 
    from
        rectangles r1_0
Hibernate: 
    insert 
    into
        triangles
        (a,b,c,alpha,blue,green,red,id) 
    values
        (?,?,?,?,?,?,?,default)
Hibernate: 
    select
        t1_0.id,
        t1_0.a,
        t1_0.b,
        t1_0.c,
        t1_0.alpha,
        t1_0.blue,
        t1_0.green,
        t1_0.red 
    from
        triangles t1_0
Hibernate: 
    insert 
    into
        triangles
        (a,b,c,alpha,blue,green,red,id) 
    values
        (?,?,?,?,?,?,?,default)
Hibernate: 
    update
        triangles 
    set
        a=?,
        b=?,
        c=?,
        alpha=?,
        blue=?,
        green=?,
        red=? 
    where
        id=?
Hibernate: 
    insert 
    into
        rectangles
        (alpha,blue,green,red,height,width,id) 
    values
        (?,?,?,?,?,?,default)
Hibernate: 
    delete 
    from
        rectangles 
    where
        id=?
Hibernate: 
    drop table if exists rectangles cascade 
gru 06, 2024 12:02:50 AM org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@10dfa7ef] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.
Hibernate: 
    drop table if exists triangles cascade 
gru 06, 2024 12:02:50 AM org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PoolState stop
INFO: HHH10001008: Cleaning up connection pool [jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=false]
```