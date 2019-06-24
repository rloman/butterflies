package nl.workingspirit.butterflies.services;

import nl.workingspirit.butterflies.model.Speler;
import nl.workingspirit.butterflies.persistence.SpelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SpelerService {

    @Autowired
    private SpelerRepository spelerRepository;

    public Speler save(Speler speler) {
        return this.spelerRepository.save(speler);
    }


    public Optional<Speler> findById(Long aLong) {
        return spelerRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return spelerRepository.existsById(aLong);
    }

    public Iterable<Speler> findAll() {
        return spelerRepository.findAll();
    }

    public Iterable<Speler> findAllById(Iterable<Long> iterable) {
        return spelerRepository.findAllById(iterable);
    }

    public long count() {
        return spelerRepository.count();
    }

    public void deleteById(Long aLong) {
        spelerRepository.deleteById(aLong);
    }

    public void delete(Speler speler) {
        spelerRepository.delete(speler);
    }

    public void deleteAll(Iterable<? extends Speler> iterable) {
        spelerRepository.deleteAll(iterable);
    }

    public void deleteAll() {
        spelerRepository.deleteAll();
    }
}
