package com.gcu.data;

import com.gcu.entity.UserEntity;
import com.gcu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserDataService implements DataAccessInterface<UserEntity>{

        @Autowired
        private UserRepository userRepository;

        public UserDataService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        @Override
        public boolean create(UserEntity newUser) {

            try {
                //Save new UserEntity to database
                userRepository.save(newUser);
            }
            catch(Exception e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }

        @Override
        public List<UserEntity> findAll() {

            return null;
        }

        @Override
        public UserEntity findById(int id) {

            return null;
        }

        @Override
        public boolean update(UserEntity t) {

            return false;
        }

        @Override
        public boolean delete(UserEntity t) {

            return false;
        }

        public UserEntity findByUserName(String username) {
            // Attempt to find user by username
            return userRepository.findByUserName(username);
        }
}
