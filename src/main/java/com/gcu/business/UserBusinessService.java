package com.gcu.business;

import com.gcu.data.UserDataService;
import com.gcu.entity.UserEntity;
import com.gcu.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBusinessService {

    @Autowired
    UserDataService service;

    /** Method for adding a user as an entity to database
     */
    public boolean addUser(UserModel newUser){
        //Create entity (user) from model (user)
        UserEntity entity = new UserEntity(newUser.getId(),
                                            newUser.getFirstName(),
                                            newUser.getLastName(),
                                            newUser.getUsername(),
                                            newUser.getPassword());

        //Attempt insertion of entity in database with UserDataService
        return service.create(entity);
    }

    //Take userModel object and turn into Entity
    //Search database for that username using method findByUsername in UserDataService.findByUsername()
    //if username exists, compare username/password, boolean results
    public boolean getAuthorizedUser(UserModel userModel) {

        //Create modelToEntity from model to be compared if entity created = entity in db
        UserEntity modelToEntity = service.findByUserName(userModel.getUsername());

        //search db for modelToEntity object by username
        if(modelToEntity == null){
            //if user not found (null) return false
            return false;
        }else{
            if(userModel.getUsername().equals(modelToEntity.getUsername()) && userModel.getPassword().equals(modelToEntity.getPassword())){
                //If name/password match, return true
                return true;
            }else {
                //If name/password !match, return false
                return false;
            }
        }
    }

}
