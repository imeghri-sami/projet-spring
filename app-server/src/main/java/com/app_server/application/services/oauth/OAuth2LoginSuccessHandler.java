package com.app_server.application.services.oauth;

import com.app_server.application.models.CustomOauth2User;
import com.app_server.application.models.User;
import com.app_server.application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class OAuth2LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Autowired
    private UserService userService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        CustomOauth2User oauth2User = (CustomOauth2User) authentication.getPrincipal();

        String email = oauth2User.getEmail();
        String photoUrl = oauth2User.getAttribute("picture");
        String name = oauth2User.getAttribute("name");

        User authedUser = userService.findUserByEmail(email);
        if(authedUser == null){
            // register new user
            userService.createNewUserAfterOAuthLoginSuccess( name , photoUrl, email );
        }

        super.onAuthenticationSuccess(request, response, authentication);
    }
}
