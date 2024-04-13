package domain;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface CandidateRepository {
    void save(List<Candidate> candidates);
    default void save(Candidate candidate){
        save(List.of(candidate));
    }

    void save(List<infrastructure.repositories.entities.Candidate> candidates);

    void save(List<api.dto.Candidate> candidates);

    void save(List<api.dto.Election.Candidate> candidates);

    List<Object> find(CandidateQuery query);

    default List<Candidate> findAll(){
        return find(new CandidateQuery.Builder().build());
    }

    default Optional<Candidate> findById(String id){
        CandidateQuery query = new CandidateQuery.Builder().ids(Set.of(id)).build();
        return find(query).stream().findFirst();
    }
}
