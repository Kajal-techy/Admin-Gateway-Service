package com.adminPortal.AdminPortal.dao;

import com.adminPortal.AdminPortal.model.User;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("user-service")
@Headers("Accept: application/json")
public interface UserProxy {

    @GetMapping("/v1/users")
    List<User> getUsers(@RequestParam(required = false) String userName);

    @GetMapping("/v1/users")
    List<User> getUsers();

    @GetMapping("/v1/users/{id}")
    @Headers("loggedInUserId: {loggedInUserId}")
    User getUserDetailsById(@RequestHeader("loggedInUserId") String loggedInUserId, @PathVariable(value = "id") String id);

    @PostMapping("/v1/user")
    ResponseEntity<User> createUser(User user);
}

