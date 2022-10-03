package store.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import store.com.Interceptor.SecurityInterceptor;
@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
	@Autowired
	SecurityInterceptor se;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(se)
		.addPathPatterns("/**");
	}
}
