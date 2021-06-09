package com.decagon.safariwebstore.service;

import com.decagon.safariwebstore.model.Role;
import com.decagon.safariwebstore.model.User;
import com.decagon.safariwebstore.payload.request.auth.EditUser;
import com.decagon.safariwebstore.payload.request.auth.RegisterUser;
import com.decagon.safariwebstore.payload.response.Response;
import com.decagon.safariwebstore.payload.response.UserDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

import java.util.Optional;

@Component
public interface UserService {
    User saveUser(User user);
    boolean existsByMail(String email);
    User registration(RegisterUser registerUser);
    Optional<User> findUserByResetToken(String resetToken);
    Optional<User> getUserByEmail(String email);
    void deactivateResetPasswordToken();
    Response adminForgotPassword(Role admin, Optional<User> userOptional, String appUrl);
    Response adminResetPassword(Optional<User> userOptional, String password, String confirmPassword);
    User findUserByEmail(String email);
    UserDTO updateUser(EditUser user);
}
