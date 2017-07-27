package com.weiyi.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weiyi.cloud.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
