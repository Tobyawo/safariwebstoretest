package com.decagon.safariwebstore.service;

import com.decagon.safariwebstore.model.Role;
import com.decagon.safariwebstore.model.User;
import com.decagon.safariwebstore.payload.request.UpdatePasswordRequest;
import com.decagon.safariwebstore.payload.request.auth.LoginRequest;
import com.decagon.safariwebstore.payload.request.auth.RegisterUser;
import com.decagon.safariwebstore.payload.response.Response;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User saveUser(User user);
    boolean existsByMail(String email);
    User registration(RegisterUser registerUser);
    
    Optional<User> findUserByResetToken(String resetToken);
    Optional<User> getUserByEmail(String email);
    Response adminForgotPassword(Role admin, Optional<User> userOptional, String appUrl);
    Response adminResetPassword(Optional<User> userOptional, String password, String confirmPassword);
    
    User findUserByEmail(String email);
    void deactivateResetPasswordToken();
    boolean checkIfValidOldPassword(User user, UpdatePasswordRequest updatePasswordRequest);
    boolean changeUserPassword(User user, UpdatePasswordRequest updatePasswordRequest);
}
