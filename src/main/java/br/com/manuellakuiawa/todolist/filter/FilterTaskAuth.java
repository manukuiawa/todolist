package br.com.manuellakuiawa.todolist.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component // toda classe que quer que o spring gerencie coloca essa anotation
public class FilterTaskAuth extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        //pegar a autenticação (usuario e senha)
        var authorization = request.getHeader("Authorization");
        System.out.println("Authorization");
        System.out.println(authorization);
        //validar usuário 

        //validar senha 

        filterChain.doFilter(request, response);
    }

}
