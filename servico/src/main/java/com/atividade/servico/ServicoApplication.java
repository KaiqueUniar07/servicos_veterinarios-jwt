package com.atividade.servico;

import com.atividade.servico.security.Configuracao;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "[Serviço API] - Veterinária", description = "API serviços ", version = "1.0.0"),
		security = @SecurityRequirement(name = "bearerAuth")
)
@SecurityScheme(
		name = "bearerAuth",
		type = SecuritySchemeType.HTTP,
		scheme = "bearer",
		bearerFormat = "JWT"
)
public class ServicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<Configuracao> jwtFilter(Configuracao filter) {
		FilterRegistrationBean<Configuracao> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(filter);
		registrationBean.addUrlPatterns("/api/v1/servicos/*");
		return registrationBean;
	}

}