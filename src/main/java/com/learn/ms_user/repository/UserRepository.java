package com.learn.ms_user.repository;

import com.learn.ms_user.domain.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserRepository
 * @Description UserRepository
 * @Author ZhouXiaoPing
 * @Date 2020/1/3 15:31
 **/
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
