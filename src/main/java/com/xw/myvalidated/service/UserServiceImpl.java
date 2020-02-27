package com.xw.myvalidated.service;

import com.xw.myvalidated.data.User;
import com.xw.myvalidated.exception.NoHandlerFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Objects;

@Service
public class UserServiceImpl {

    public void save(User user) {
        System.out.println(user.toString());
    }

    public void find(String id) throws NoHandlerFoundException {
        /*if (StringUtils.isEmpty(id)) {
            throw new NoHandlerFoundException("id is null");
        }*/
        if ("1".equals(id)) {
            throw new NoHandlerFoundException("id is null");
        }
    }
}
