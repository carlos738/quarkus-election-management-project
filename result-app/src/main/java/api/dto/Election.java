package api.dto;

import java.util.List;

public record Election(String id, List<Candidate>candidates) {
}
