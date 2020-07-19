package com.adminPortal.AdminPortal.resolver;

import com.adminPortal.AdminPortal.dao.UserProxy;
import com.adminPortal.AdminPortal.model.User;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class UserQuery implements GraphQLQueryResolver {

    private UserProxy userProxy;

    public UserQuery(UserProxy userProxy) {
        this.userProxy = userProxy;
    }

    public User getUserById(String loggedInUserId, String id) {
        User user = userProxy.getUserDetailsById(loggedInUserId, id);
        return user;
    }

    public User getUserByUserName(String userName) {
        List<User> user = userProxy.getUserDetailsByName(userName);
        return user.get(0);
    }
}
