package com.cassandara.spring.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.cassandara.spring.model.User;

public interface UserRepository extends CassandraRepository<User, Integer> {

}
