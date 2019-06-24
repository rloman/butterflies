package nl.workingspirit.butterflies.persistence;

import nl.workingspirit.butterflies.model.Speler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpelerRepository extends CrudRepository <Speler, Long> {


}
