package nl.workingspirit.butterflies.services;

import nl.workingspirit.butterflies.Butterfly;
import nl.workingspirit.butterflies.ButterflyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ButterflyService {

    @Autowired
    private ButterflyRepository repo;

    public int add(int a, int b) {
        return a+b;
    }

    public Butterfly save(Butterfly butterfly) {
        return this.repo.save(butterfly);
    }

    public Optional<Butterfly> findById(Long aLong) {
        return repo.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return repo.existsById(aLong);
    }

    public List<Butterfly> findAll() {
        return repo.findAll();
    }

    public Iterable<Butterfly> findAllById(Iterable<Long> iterable) {
        return repo.findAllById(iterable);
    }

    public long count() {
        return repo.count();
    }

    public void deleteById(Long aLong) {
        repo.deleteById(aLong);
    }

    public void delete(Butterfly butterfly) {
        repo.delete(butterfly);
    }

    public void deleteAll(Iterable<? extends Butterfly> iterable) {
        repo.deleteAll(iterable);
    }

    public void deleteAll() {
        repo.deleteAll();
    }
}
