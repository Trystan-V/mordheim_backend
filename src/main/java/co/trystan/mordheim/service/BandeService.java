package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Bande;

import java.util.List;
import java.util.Optional;

public interface BandeService{
    List<Bande> findAll();
    Optional<Bande> findById(Long id);

}
