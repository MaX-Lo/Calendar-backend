package de.maxlo.calendar;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RepositoryRestResource(collectionResourceRel = "activities", path = "activities")
public interface ActivityRepository extends MongoRepository<Activity, String> {

    List<Activity> findByCategory(@Param("category") String categoryId);
}
