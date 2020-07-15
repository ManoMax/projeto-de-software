package lab2.psoft;

import lab2.psoft.filters.FiltroToken;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PsoftApplication {

	@Bean
	public FilterRegistrationBean<FiltroToken> filterJwt() {
		FilterRegistrationBean<FiltroToken> filterRB = new FilterRegistrationBean<FiltroToken>();
		filterRB.setFilter(new FiltroToken());
		filterRB.addUrlPatterns("/api/v1/auth/usuarios/**");
		return filterRB;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PsoftApplication.class, args);
	}



}
