package domain;

import org.inferred.freebuilder.FreeBuilder;

import java.security.cert.CertPathBuilder;
import java.util.Optional;
import java.util.Set;

@FreeBuilder
public interface CandidateQuery {
    Optional<Set<String>> ids();

    Optional<String> name();

    class Builder extends CandidateQuery_Builder {


    }

    class CandidateQuery_Builder {
    }
}
