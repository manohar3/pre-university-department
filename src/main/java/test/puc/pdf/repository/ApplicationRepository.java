package test.puc.pdf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import test.puc.pdf.model.Application; 

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
