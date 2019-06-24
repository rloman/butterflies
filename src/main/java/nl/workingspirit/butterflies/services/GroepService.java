package nl.workingspirit.butterflies.services;

import nl.workingspirit.butterflies.model.Groep;
import nl.workingspirit.butterflies.model.Speler;
import nl.workingspirit.butterflies.persistence.GroepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class GroepService {

    @Autowired
    private GroepRepository groepRepository;

    @Autowired
    private SpelerService spelerService;

    @PostConstruct
    public void init() {

        Groep g1 = new Groep();
        g1.setName("The young ones");

        Speler s = new Speler();

        this.spelerService.save(s);

        this.groepRepository.save(g1);

        g1.addSpeler(s);

        this.spelerService.save(s);

        this.groepRepository.save(g1);
    }


    public Groep save(Groep groep) {
        return this.groepRepository.save(groep);
    }

    public Optional<Groep> findById(Long aLong) {
        return groepRepository.findById(aLong);
    }

    public boolean existsById(Long aLong) {
        return groepRepository.existsById(aLong);
    }

    public Iterable<Groep> findAll() {
        return groepRepository.findAll();
    }

    public Iterable<Groep> findAllById(Iterable<Long> iterable) {
        return groepRepository.findAllById(iterable);
    }

    public long count() {
        return groepRepository.count();
    }

    public void deleteById(Long aLong) {
        groepRepository.deleteById(aLong);
    }

    public void delete(Groep groep) {
        groepRepository.delete(groep);
    }

    public void deleteAll(Iterable<? extends Groep> iterable) {
        groepRepository.deleteAll(iterable);
    }

    public void deleteAll() {
        groepRepository.deleteAll();
    }
}
