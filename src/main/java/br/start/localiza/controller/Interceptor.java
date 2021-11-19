package br.start.localiza.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		if (request.getSession().getAttribute("usuarioLogado")==null) {
			request.getRequestDispatcher("/acessoNegado").forward(request, response);
			return false;
			
		}else {
			return true;
		}
	}
		
		@Override
		public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
			super.postHandle(request, response, handler, modelAndView);
		}	
	}
	

