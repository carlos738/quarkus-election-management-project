package api.dto.Election;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public record Candidate(
        String id,
        Optional<String> photo,
        String email,
        Optional<String> phone,
        Optional<String> jobTitle,
        Integer votes

) {

}
