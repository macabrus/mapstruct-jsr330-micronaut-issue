package com.bc.user;

import com.bc.user.model.CreateUserDto;
import com.bc.user.model.User;
import com.bc.user.model.UserMapper;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import java.util.List;

import javax.validation.Valid;
import java.util.Collection;

@Controller("/user")
@Secured(SecurityRule.IS_ANONYMOUS)
public class UserController {

    //private UserService userService;
    private UserMapper mapper;

    public UserController(UserMapper mapper) {
        //this.userService = userService;
        this.mapper = mapper;
    }

    @Get
    public Collection<User> getAll() {
        //return userService.getAll();
		return List.of();
    }

    @Post("/new")
    public HttpResponse<User> createUser(@Valid @Body CreateUserDto dto) {
        var newUser = mapper.dtoToEntity(dto);
        //userService.add(newUser);
        return HttpResponse.ok(null);
    }
}
