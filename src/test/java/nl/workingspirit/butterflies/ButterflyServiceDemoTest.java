package nl.workingspirit.butterflies;

import nl.workingspirit.butterflies.services.ButterflyService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class ButterflyServiceDemoTest {

    private ButterflyService service;

    @Before
    public void setUp() {

//        this.service = new ButterflyService(new MOckRepo());

    }

    @Test
    public void testSome() {

    }
}

abstract class MOckRepo implements ButterflyRepository {

    @Override
    public Butterfly save(Butterfly b) {
        return null;
    }


    @Override
    public Optional<Butterfly> findById(Long aLong) {
        return null;
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Butterfly> findAll() {
        return null;
    }

    @Override
    public Iterable<Butterfly> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Butterfly butterfly) {

    }

    @Override
    public void deleteAll(Iterable<? extends Butterfly> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void setAgeOfAllButterfliesToZero() {

    }
}
