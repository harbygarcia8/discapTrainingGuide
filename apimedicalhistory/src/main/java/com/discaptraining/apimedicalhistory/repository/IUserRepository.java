package com.discaptraining.apimedicalhistory.repository;

import com.discaptraining.apimedicalhistory.domain.entity.DiscapUser;
import com.discaptraining.apimedicalhistory.domain.entity.MedicalHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository extends CrudRepository<DiscapUser, Integer> {

    @Query(value = "SELECT id, active, discapacity, document_type, email, gender, name, password, document, phone, register_type, last_name FROM discap_user where register_type = 'USUARIO'", nativeQuery = true)
    List<DiscapUser> findByDiscapUserRegisterType();


}
