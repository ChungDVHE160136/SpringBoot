package com.example.hello.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
//import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import com.example.hello.entites.user;

@Repository
public interface UserRepository extends MongoRepository<user, String> {
	
	@Override
	List<user> findAll();
	
	@Override
	Optional<user> findById(String id);
	
	@Override
	void deleteById(String id);
	
	@Query("{'Age':?0}")
	Optional<user> findUserByAge(int ge);
	
	void deleteByAge(int Age);
	
	@Query(value="{'_id':ObjectId('?0')}")
	user getUser(String id);
	
	@Query(value="{'Age':?0}")
	Optional<List<user>> findByAge(int Age);
	
	@Query(value="{'Name':?0}")
	user findByName(String username);
	
	@Query("_id :?0")
	void updateUsert(String id, user u);
	

	
	
}
