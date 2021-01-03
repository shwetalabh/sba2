package com.wellsfargo.batch7.sbwibs.security;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class IBSAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {

		boolean hasUserRole = false, hasAdminRole = false, hasNewUserRole = false, hasSPRole = false,
				hasNewSPRole = false;

		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities) {
			if (grantedAuthority.getAuthority().equals("USER")) {
				hasUserRole = true;
				break;
			} else if (grantedAuthority.getAuthority().equals("ADMIN")) {
				hasAdminRole = true;
				break;
			} else if (grantedAuthority.getAuthority().equals("NEWUSER")) {
				hasNewUserRole = true;
				break;
			} else if (grantedAuthority.getAuthority().equals("SP")) {
				hasSPRole = true;
				break;
			} else if (grantedAuthority.getAuthority().equals("NEWSP")) {
				hasNewSPRole = true;
				break;
			}
		}

		if (hasUserRole) {
			redirectStrategy.sendRedirect(request, response, "/signin/home");
		} else if (hasAdminRole) {
			redirectStrategy.sendRedirect(request, response, "/admin");
		} else if (hasNewUserRole) {
			redirectStrategy.sendRedirect(request, response, "/changePassword");
		} else if (hasSPRole) {
			redirectStrategy.sendRedirect(request, response, "/signin/sp-home");
		} else if (hasNewSPRole) {
			redirectStrategy.sendRedirect(request, response, "/changePassword");
		}
		else {
			throw new IllegalStateException();
		}
	}

}
