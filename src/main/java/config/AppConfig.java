package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"beans"}) // tells which packages to scan. default scan is current package and subpackages.
public class AppConfig {}
