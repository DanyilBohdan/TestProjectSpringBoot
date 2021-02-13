package ua.dnipro.epam.bohdan.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ua.dnipro.epam.bohdan.entity.Tour;

import java.util.Optional;

public interface TourRepository extends CrudRepository<Tour, Long>, PagingAndSortingRepository<Tour, Long> {

    @Override
    Page<Tour> findAll(Pageable pageable);

    @Override
    Optional<Tour> findById(Long aLong);

}
