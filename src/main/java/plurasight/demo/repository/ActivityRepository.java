package plurasight.demo.repository;

import org.springframework.data.repository.CrudRepository;

import plurasight.demo.entity.Activity;

public interface ActivityRepository extends CrudRepository<Activity, Long>   {
	
	// This will be AUTO IMPLEMENTED by Spring into a Bean called ActivityRepository
	// CRUD refers Create, Read, Update, Delete
	

}
