package com.decagon.safariwebstore.service;

import com.decagon.safariwebstore.model.Role;
import com.decagon.safariwebstore.model.User;
import com.decagon.safariwebstore.payload.request.auth.RegisterUser;
import com.decagon.safariwebstore.payload.response.Response;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public interface UserService {
    User saveUser(User user);
    boolean existsByMail(String email);
    User registration(RegisterUser registerUser);
    Optional<User> findUserByResetToken(String resetToken);
    Optional<User> findUserByEmail(String email);
    void deactivateResetPasswordToken();
    Response userForgotPassword(Role customer, Optional<User> userOptional, String appUrl);
    Response userResetPassword(Optional<User> userOptional, String password, String confirmPassword);
}
