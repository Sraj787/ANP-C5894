package com.SpringBoot.Curd.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.GenericFilterBean;

import com.SpringBoot.Curd.service.LoginService;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtFilter extends GenericFilterBean{
	

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		final HttpServletRequest  request=(HttpServletRequest) req;
		final HttpServletResponse response=(HttpServletResponse) res;
		
		final String authHeader= request.getHeader("Authorization");
		
		if("Options".equals(request.getMethod())) {
			response.setStatus(HttpServletResponse.SC_OK);

			chain.doFilter(req, res);
		}else
		{
			if(authHeader==null || !authHeader.startsWith("Bearer ")) {
				
				throw new ServletException("Missing and Invalid authorization header");
			}
			String token = authHeader.substring(7);
			try {
			Claims claims = Jwts.parser().setSigningKey("secretkey").parseClaimsJws(token).getBody();

			request.setAttribute("claims", claims);
			}catch(final SignatureException e){
				throw new ServletException("Invalid Token");
			}
			chain.doFilter(req, res);
		}
		
	}

}
