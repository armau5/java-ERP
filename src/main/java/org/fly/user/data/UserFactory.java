package org.fly.user.data;


import org.fly.base.data.BaseFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserFactory extends BaseFactory<User> {

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
    public List<User> findAll(Class<User> aClass) {
        return super.findAll(aClass);
    }
}
