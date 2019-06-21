package nl.workingspirit.butterflies;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ButterflyRepository extends CrudRepository <Butterfly, Long> {

    @Override
    List<Butterfly> findAll();

    @Query("update Butterfly set age = 2")
    @Modifying
    void setAgeOfAllButterfliesToZero();



}
