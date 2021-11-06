package com.bc.user.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public @Data
class CreateUserDto {
    @Pattern(regexp = "[A-Za-z0-9]+", message = "Invalid username")
    private String name;
    @Email(message = "Invalid email address")
    private String email;
    @Min(value = 8, message = "Password must be at least 8 characters")
    private String password;
    private String passwordConfirmation;
}
