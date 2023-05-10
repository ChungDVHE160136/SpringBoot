//package com.example.hello.config;
////
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import jakarta.servlet.http.HttpServletResponse;
//
////@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        // TODO configure authentication manager
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // TODO configure web security
//    	
//    	 http = http.cors().and().csrf().disable();
//    	 http = http.sessionManagement()
//    	            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//    	            .and();
//    	 http = http
//    	            .exceptionHandling()
//    	            .authenticationEntryPoint(
//    	                (request, response, ex) -> {
//    	                    response.sendError(
//    	                        HttpServletResponse.SC_UNAUTHORIZED,
//    	                        ex.getMessage()
//    	                    );
//    	                }
//    	            )
//    	            .and();
//    	 http.authorizeHttpRequests()
//         // Our public endpoints
//         .requestMatchers("/api/public/**").permitAll()
//         .requestMatchers(HttpMethod.GET, "/api/author/**").permitAll()
//         .requestMatchers(HttpMethod.POST, "/api/author/search").permitAll()
//         .requestMatchers(HttpMethod.GET, "/api/book/**").permitAll()
//         .requestMatchers(HttpMethod.POST, "/api/book/search").permitAll()
//         // Our private endpoints
//         .anyRequest().authenticated();
//    	 
//    	 http.addFilterBefore(
//    	            jwtTokenFilter,
//    	            UsernamePasswordAuthenticationFilter.class
//    	        );
//    	 
//    }
//    
//    
//    
//    @Bean
////    public CorsFilter corsFilter() {
////        UrlBasedCorsConfigurationSource source =
////            new UrlBasedCorsConfigurationSource();
////        CorsConfiguration config = new CorsConfiguration();
////        config.setAllowCredentials(true);
////        config.addAllowedOrigin("*");
////        config.addAllowedHeader("*");
////        config.addAllowedMethod("*");
////        source.registerCorsConfiguration("/**", config);
////        return new CorsFilter(source);
////    }
//    
//    
//
//}
////	@Bean
////    public BCryptPasswordEncoder passwordEncoder() {
////        return new BCryptPasswordEncoder(12);
////    }
////	
////	
////	
////	@Bean
////	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////
////        http.authorizeHttpRequests(authConfig -> {
////            authConfig.requestMatchers("/").permitAll();
////            authConfig.requestMatchers("/user").hasRole("USER");
////            authConfig.requestMatchers("/admin").hasRole("ADMIN");
////            try {
////				authConfig.anyRequest().authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
////			} catch (Exception e) {
////				// TODO Auto-generated catch block
////				e.printStackTrace();
////			}
////        }).csrf(csrf -> csrf.disable()).headers(headers -> headers.frameOptions().disable())
////                .formLogin(Customizer.withDefaults())
////                .httpBasic(Customizer.withDefaults());
////       // http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
////		return http.build();
////		
////	}
//	
//	
//
