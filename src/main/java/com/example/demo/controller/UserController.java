package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private Map<Long, User> userDB = new HashMap<>();

    // GET all users
    @GetMapping
    public Collection<User> getAllUsers() {
        return userDB.values();
    }

    // GET user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userDB.get(id);
    }

    // POST create user
    @PostMapping
    public User createUser(@RequestBody User user) {
        long id = userDB.size() + 1;
        user.setId(id);
        userDB.put(id, user);
        return user;
    }
    @Operation(summary = "Get user by id")
    @ApiResponse(responseCode = "200", description = "User found",
            content = @Content(schema = @Schema(implementation = UserDto.class)))
    @ApiResponse(responseCode = "404", description = "User not found")
    @GetMapping("/users/{id}")
    public UserDto getUser(@PathVariable Long id) {
        return new UserDto(id, "Falguni Patel", "falguni@example.com");
    }
}
