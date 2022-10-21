package org.fly.user.biz;


import org.fly.base.biz.BaseBizImpl;
import org.fly.user.data.User;
import org.fly.user.data.UserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserBizImpl extends BaseBizImpl<User> implements UserBiz {

    @Autowired
    private UserFactory userFactory;

    @Override
    public void save(User user) {
        super.save(user);
    }

    @Override
    public void update(User user) {
        super.update(user);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }

    @Override
    public List<User> findAll(Class<User> t) {
        return super.findAll(t);
    }

    @Override
    public List<User> findAllByLogicalDelete(Class<User> t) {
        return super.findAllByLogicalDelete(t);
    }
}
