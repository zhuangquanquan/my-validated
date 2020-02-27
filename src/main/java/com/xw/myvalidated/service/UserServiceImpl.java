package com.xw.myvalidated.service;

import com.xw.myvalidated.data.User;
import com.xw.myvalidated.exception.NoHandlerFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    public void save(User user) {
        System.out.println("添加：" + user.toString());
    }

    public void update(User user) {
        System.out.println("修改：" + user.toString());
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
