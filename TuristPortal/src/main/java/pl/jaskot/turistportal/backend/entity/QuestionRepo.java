package pl.jaskot.turistportal.backend.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuestionRepo extends CrudRepository<Question, Long> {

    @Override
    Optional<Question> findById(Long aLong);

    Question findByNumber(int i);
}
