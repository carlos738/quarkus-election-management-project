package infrastructure.repositories.entities;

import domain.Candidate;
import domain.Election;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity(name = "election_candidate")
public class ElectionCandidate {
@EmbeddedId
    private ElectionCandidateId id;
private Integer votes;

    public static Object fromDomain(Election election, Candidate key, Integer value) {
    return election;
    }

    public ElectionCandidateId getId() {
        return id;
    }

    public void setId(ElectionCandidateId id) {
        this.id = id;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}
