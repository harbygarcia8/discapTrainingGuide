package com.discaptraining.apimedicalhistory.repository;

import com.discaptraining.apimedicalhistory.domain.entity.DiscapUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository extends CrudRepository<DiscapUser, Integer> {


}
