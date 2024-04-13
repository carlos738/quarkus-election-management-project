package api.dto.out;

import java.util.List;

public record Election(String id, List<domain.Candidate> candidates) {
    public static Election fromDomain(domain.Election election){
        return new Election(election.id(), election.candidates().stream().map(api.dto.Election.Candidate::id).toList());
    }
}