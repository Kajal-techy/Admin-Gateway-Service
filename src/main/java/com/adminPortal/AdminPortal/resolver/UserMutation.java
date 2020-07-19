package com.adminPortal.AdminPortal.resolver;

import com.adminPortal.AdminPortal.dao.UserProxy;
import com.adminPortal.AdminPortal.model.User;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMutation implements GraphQLMutationResolver {

    private UserProxy userProxy;

    public UserMutation(UserProxy userProxy) {
        this.userProxy = userProxy;
    }

    public User createUser(String firstName, String lastName, String userName, String password) {
        User user = User.builder().firstName(firstName).lastName(lastName).userName(userName)
                .password(password).build();
        ResponseEntity<User> responseEntity = userProxy.createUser(user);
        return responseEntity.getBody();
    }
}
