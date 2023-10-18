package com.gkcodes.login.form.repository;



import org.springframework.data.repository.CrudRepository;

import com.gkcodes.login.form.model.UserLogin;

public interface UserRepository extends CrudRepository <UserLogin, Long>{
    
}

