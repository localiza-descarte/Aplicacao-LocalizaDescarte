package br.start.localiza.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.start.localiza.controller.Interceptor;

@Configuration
public class AcessoUsuario implements WebMvcConfigurer {
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor((HandlerInterceptor) new Interceptor())
		.addPathPatterns(new String[] {"/usuario", "/usuario/**"}).excludePathPatterns("/css/**", "/icons/**", "/js/**", "/img/**");
	}
	
	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry
	      .addResourceHandler("/usuario/**")
	      .addResourceLocations("classpath:/static/");
	  }
	
}
