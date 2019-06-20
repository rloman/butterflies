package nl.workingspirit.butterflies;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ButterflyRepository extends CrudRepository <Butterfly, Long> {

    @Override
    List<Butterfly> findAll();

}
