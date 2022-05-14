package com.gcu.business;

import com.gcu.data.UserDataService;
import com.gcu.entity.UserEntity;
import com.gcu.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBusinessService {

    @Autowired
    UserDataService service;

    /**
     * Method for adding a user as an entity to database
     *
     */
    public boolean addUser(UserModel newUser){
        //Create entity (user) from model (user)
        UserEntity entity = new UserEntity(newUser.getId(),
                                            newUser.getFirstName(),
                                            newUser.getLastName(),
                                            newUser.getUserName(),
                                            newUser.getPassword());
        //Attempt insertion of entity in database with UserDataService
        return service.create(entity);
    }


}
