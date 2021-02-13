package ua.dnipro.epam.bohdan.service;

import ua.dnipro.epam.bohdan.entity.Tour;

import java.util.Optional;

public interface TourService {
    Iterable<Tour> findAll(Integer page, String bySort, String typeSort);

    Optional<Tour> findById(Long id);
}
