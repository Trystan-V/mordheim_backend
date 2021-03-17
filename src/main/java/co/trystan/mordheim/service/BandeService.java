package co.trystan.mordheim.service;

import co.trystan.mordheim.model.Bande;

import java.util.Optional;

public interface BandeService{
    Optional<Bande> findById(Long id);

}
