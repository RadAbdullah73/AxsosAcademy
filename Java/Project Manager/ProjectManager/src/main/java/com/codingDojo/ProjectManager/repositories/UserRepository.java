package com.codingDojo.ProjectManager.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingDojo.ProjectManager.models.Project;
import com.codingDojo.ProjectManager.models.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List <User> findAll();
	
	Optional<User> findByEmail(String email);
	public List<User> findByProjectsNotContains(Project project);
}