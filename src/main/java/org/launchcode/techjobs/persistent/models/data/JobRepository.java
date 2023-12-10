package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//This interface repository kept highlighting in white instead of green.
//I tried to figure out why and ended up deleting it and re-adding it, now it is highlighted blue?
@Repository
public interface JobRepository extends CrudRepository<Job, Integer> {

}
