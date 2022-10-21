package org.fly.user.biz;


import org.fly.base.biz.BaseBiz;
import org.fly.user.data.User;

import java.util.List;

public interface UserBiz extends BaseBiz<User> {

    @Override
    void save(User user) throws Exception;

    @Override
    void update(User user) throws Exception;

    @Override
    void delete(User user) throws Exception;

    @Override
    List<User> findAll(Class<User> t);

    @Override
    List<User> findAllByLogicalDelete(Class<User> t);
}
