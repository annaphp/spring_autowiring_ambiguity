package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beans.Cubs;
import beans.RedSox;
import beans.Team;

@Configuration
@ComponentScan(basePackages={"beans"}) // tells which packages to scan. default scan is current package and subpackages.
public class AppConfig {
	
	
	@Bean
	public Team redSox(){
		return new RedSox();
	}
	
	@Bean
	public Team cubs(){
		return new Cubs();
	}
	
}
