/**
 *
 */
package com.mysqlsecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysqlsecurity.model.User;

/**
 * @author manoranjan
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String userName);

}
