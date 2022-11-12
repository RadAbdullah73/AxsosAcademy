package com.codingDojo.ProjectManager.repositories;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingDojo.ProjectManager.models.Project;
import com.codingDojo.ProjectManager.models.User;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	List <Project> findAll();
	public List <Project> findByUsersNotContains(User user);
	public List <Project> findByUsersContains(User user);

}
