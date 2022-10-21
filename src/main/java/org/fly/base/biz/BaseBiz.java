package org.fly.base.biz;

import org.fly.base.data.BaseTO;

import java.util.List;

public interface BaseBiz<T extends BaseTO> {

    void save(T t) throws Exception;
    void update(T t) throws Exception;
    void delete(T t) throws Exception;
    List<T> findAll(Class<T> t);
    List<T> findAllByLogicalDelete(Class<T> t);
}
