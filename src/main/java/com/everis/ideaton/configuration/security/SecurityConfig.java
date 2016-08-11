package com.everis.ideaton.configuration.security;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig //extends WebSecurityConfigurerAdapter
{

/*    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("*//**").access("hasRole('ADMIN')")
                .and().formLogin();
        http.csrf().disable();
    }*/
}
