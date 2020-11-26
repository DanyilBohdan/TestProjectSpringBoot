package ua.dnipro.epam.bohdan.homework_5.repository;

import org.springframework.data.repository.CrudRepository;
import ua.dnipro.epam.bohdan.homework_5.entity.Tour;

import java.util.Optional;

public interface TourRepository extends CrudRepository<Tour, Long> {

    @Override
    Iterable<Tour> findAll();

    @Override
    Optional<Tour> findById(Long aLong);
}
