package ua.dnipro.epam.bohdan.homework_5.service;

import ua.dnipro.epam.bohdan.homework_5.entity.Tour;

import java.util.Optional;

public interface TourService {
    Iterable<Tour> findAll(Integer page, String bySort, String typeSort);

    Optional<Tour> findById(Long id);
}
