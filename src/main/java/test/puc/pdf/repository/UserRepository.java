package test.puc.pdf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.puc.pdf.model.User; 

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
