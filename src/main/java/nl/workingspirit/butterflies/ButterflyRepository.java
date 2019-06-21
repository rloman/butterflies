package nl.workingspirit.butterflies;

import nl.workingspirit.butterflies.model.Butterfly;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ButterflyRepository extends CrudRepository <Butterfly, Long> {

    @Override
    List<Butterfly> findAll();

    /* rloman fix this
    @Query("update Butterfly set age = 2")
    @Modifying
    void setAgeOfAllButterfliesToZero();
    */



}
