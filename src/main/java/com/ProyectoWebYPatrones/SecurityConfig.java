/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoWebYPatrones;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author jarod
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
            
        auth.inMemoryAuthentication()
        .withUser("Admin")
            .password("{noop}Admin888")
            .roles("ADMIN","VENDEDOR","CLIENTE")
            .and()
            .withUser("Vendedor")
            .password("{noop}Seller777")
            .roles("VENDEDOR","CLIENTE")
            .and()
            .withUser("Cliente")
            .password("{noop}Cliente123")
            .roles("CLIENTE");
    }

    @Override
    protected void configure(HttpSecurity http)throws Exception{
    http.authorizeRequests()
            .antMatchers("/Articulo/nuevo",
                         "/Articulo/guardar","/Articulo/modificar/**",
                         "/Articulo/eliminar/**",
                         "/Empleado/nuevo",
                         "/Empleado/guardar","/Empleado/modificar/**",
                         "/Empleado/eliminar/**",
                         "/MarcaTennis/nuevo",
                         "/MarcaTennis/guardar","/MarcaTennis/modificar/**",
                         "/MarcaTennis/eliminar/**"                    
                         ).hasRole("ADMIN")
            .antMatchers("/Articulo/listado", 
                         "/Empleado/listadoEmpleado",
                         "/MarcaTennis/listado"                
                         ).hasAnyRole("ADMIN","VENDEDOR")
            .antMatchers("/","/Login", 
                         "/busqueda","/sobreN",
                         "/favoritos","/pago",
                         "/carrito","/registro",
                         "/marcas","/reviews",
                         "/tallas"
                         ).hasAnyRole("ADMIN","VENDEDOR","CLIENTE")
            .and()
                .formLogin()
                .loginPage("/login")
            .and()
                .exceptionHandling()
                .accessDeniedPage("/XXX");
    }
}
