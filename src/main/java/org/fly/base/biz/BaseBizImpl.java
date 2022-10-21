package org.fly.base.biz;


import org.fly.base.data.BaseFactory;
import org.fly.base.data.BaseTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BaseBizImpl<T extends BaseTO> implements BaseBiz<T> {

    @Autowired
    private BaseFactory baseFactory;

    @Override
    @Transactional
    public void save(T t) {
        baseFactory.save(t);
    }

    @Override
    @Transactional
    public void update(T t) {
        baseFactory.update(t);
    }

    @Override
    @Transactional
    public void delete(T t) {
        baseFactory.delete(t);
    }

    @Override
    public List<T> findAll(Class<T> t) {
        return baseFactory.findAll(t);
    }

    @Override
    public List<T> findAllByLogicalDelete(Class<T> t) {
        return baseFactory.findAll(t);
    }

}
