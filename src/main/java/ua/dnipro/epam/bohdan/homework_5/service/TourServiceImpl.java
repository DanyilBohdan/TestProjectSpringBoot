package ua.dnipro.epam.bohdan.homework_5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ua.dnipro.epam.bohdan.homework_5.entity.Tour;
import ua.dnipro.epam.bohdan.homework_5.repository.TourRepository;

import java.util.Optional;

@Service
public class TourServiceImpl implements TourService {


    private TourRepository tourRepository;

    @Autowired
    public TourServiceImpl(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    @Override
    public Iterable<Tour> findAll(Integer page, String bySort, String typeSort) {
        Sort sort = Sort.by(bySort);
        if (typeSort.equals("desc")) {
            sort.descending();
        }
        return tourRepository.findAll(PageRequest.of(page - 1, 4, sort));
    }

    @Override
    public Optional<Tour> findById(Long id) {
        return tourRepository.findById(id);
    }
}
