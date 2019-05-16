package jpaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jpaProject.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
