package domain;

import java.util.Optional;
import java.util.UUID;

public record Candidate(
        String id,
        Optional<String> photo,
        String givenName,
        String familyName,
        String email,
        Optional<String> phone,
        Optional<String> jobTitle
) {
    public static Candidate create(Optional<String> photo,
                                   String givenName,
                                   String familyName,
                                   String email,
                                   Optional<String> phone,
                                   Optional<String> jobTitle){
        return new Candidate(UUID.randomUUID().toString(), photo, givenName, familyName, email, phone, jobTitle);
    }

    public static Candidate fromDomain(Candidate byId) {
        return byId;
    }

    public Object thenReturn(Candidate candidate) {
        return candidate;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
