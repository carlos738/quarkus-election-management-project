package domain;

import api.dto.out.Election;

import java.util.List;

public interface ElectionRepository {
Election findById(String id);
List<api.dto.out.Election> findAll();

void vote(String electionId,Candidate candidate);

}
