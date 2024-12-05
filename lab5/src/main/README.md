### Wyniki z konsoli
<hr>

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.4)

2024-12-05T23:07:36.079+01:00  INFO 4776 --- [           main] org.example.MainApplication              : Starting MainApplication using Java 17.0.2 with PID 4776 (C:\Users\szala\IdeaProjects\programowanie-w-jezyku-java\lab5\target\classes started by szala in C:\Users\szala\IdeaProjects\programowanie-w-jezyku-java\lab5)
2024-12-05T23:07:36.082+01:00  INFO 4776 --- [           main] org.example.MainApplication              : No active profile set, falling back to 1 default profile: "default"
2024-12-05T23:07:36.610+01:00  INFO 4776 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2024-12-05T23:07:36.672+01:00  INFO 4776 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 53 ms. Found 2 JPA repository interfaces.
2024-12-05T23:07:37.125+01:00  INFO 4776 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2024-12-05T23:07:37.133+01:00  INFO 4776 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-12-05T23:07:37.133+01:00  INFO 4776 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.13]
2024-12-05T23:07:37.214+01:00  INFO 4776 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-12-05T23:07:37.216+01:00  INFO 4776 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1089 ms
2024-12-05T23:07:37.339+01:00  INFO 4776 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-12-05T23:07:37.383+01:00  INFO 4776 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.2.9.Final
2024-12-05T23:07:37.385+01:00  INFO 4776 --- [           main] org.hibernate.cfg.Environment            : HHH000406: Using bytecode reflection optimizer
2024-12-05T23:07:37.496+01:00  INFO 4776 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2024-12-05T23:07:37.604+01:00  INFO 4776 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2024-12-05T23:07:37.618+01:00  INFO 4776 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-12-05T23:07:37.769+01:00  INFO 4776 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@571a663c
2024-12-05T23:07:37.771+01:00  INFO 4776 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-12-05T23:07:37.976+01:00  INFO 4776 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2024-12-05T23:07:38.497+01:00  INFO 4776 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2024-12-05T23:07:38.540+01:00  INFO 4776 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2024-12-05T23:07:38.839+01:00  WARN 4776 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2024-12-05T23:07:39.151+01:00  INFO 4776 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2024-12-05T23:07:39.160+01:00  INFO 4776 --- [           main] org.example.MainApplication              : Started MainApplication in 3.4 seconds (process running for 3.685)
2024-12-05T23:08:45.297+01:00  INFO 4776 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2024-12-05T23:08:45.298+01:00  INFO 4776 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2024-12-05T23:08:45.299+01:00  INFO 4776 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms
Hibernate: insert into triangles (a,b,c,alpha,blue,green,red) values (?,?,?,?,?,?,?)
Hibernate: insert into triangles (a,b,c,alpha,blue,green,red) values (?,?,?,?,?,?,?)
2024-12-05T23:09:20.233+01:00  WARN 4776 --- [nio-8080-exec-2] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.HttpRequestMethodNotSupportedException: Request method 'GET' is not supported]
Hibernate: select r1_0.id,r1_0.alpha,r1_0.blue,r1_0.green,r1_0.red,r1_0.height,r1_0.width from rectangles r1_0
Hibernate: select t1_0.id,t1_0.a,t1_0.b,t1_0.c,t1_0.alpha,t1_0.blue,t1_0.green,t1_0.red from triangles t1_0
2024-12-05T23:15:10.922+01:00  WARN 4776 --- [nio-8080-exec-8] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.HttpRequestMethodNotSupportedException: Request method 'GET' is not supported]
Hibernate: insert into triangles (a,b,c,alpha,blue,green,red) values (?,?,?,?,?,?,?)
Hibernate: insert into rectangles (alpha,blue,green,red,height,width) values (?,?,?,?,?,?)
Hibernate: select r1_0.id,r1_0.alpha,r1_0.blue,r1_0.green,r1_0.red,r1_0.height,r1_0.width from rectangles r1_0
Hibernate: select t1_0.id,t1_0.a,t1_0.b,t1_0.c,t1_0.alpha,t1_0.blue,t1_0.green,t1_0.red from triangles t1_0
```

### Zrzuty ekranu z postmana
<hr>

<img src="https://github.com/SebastianSlezak/user-attachments/blob/a03c70b1daba8ab2562179910012221c60ac9a08/assets/image%20copy%202.png">
<img src="https://github.com/SebastianSlezak/user-attachments/blob/a03c70b1daba8ab2562179910012221c60ac9a08/assets/image%20copy.png">
<img src="https://github.com/SebastianSlezak/user-attachments/blob/a03c70b1daba8ab2562179910012221c60ac9a08/assets/image.png">
