package ua.dnipro.epam.bohdan.homework_5.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.dnipro.epam.bohdan.homework_5.entity.Tour;
import ua.dnipro.epam.bohdan.homework_5.repository.TourRepository;

import java.util.Optional;

@RestController
@RequestMapping("tours")
public class TourController {

    @Autowired
    private TourRepository tourRepository;

//    @GetMapping(value = "/all")
//    public Iterable<Tour> getAllTour(){
//        return tourRepository.findAll();
//    }

    @GetMapping(value = "/all/{page}/{sort}")
    public Iterable<Tour> getAllTourSort(@PathVariable Integer page,
                                         @PathVariable String sort) {
        return tourRepository.findAll(PageRequest.of(page - 1, 4, Sort.by(sort)));
    }

    @GetMapping(value = "/all/{page}/{sort}/desc")
    public Iterable<Tour> getAllTourSortDesc(@PathVariable Integer page,
                                             @PathVariable String sort) {
        return tourRepository.findAll(PageRequest.of(page - 1, 4, Sort.by(sort).descending()));
    }

    @GetMapping(value = "/{id}")
    public Optional<Tour> getAllById(@PathVariable Long id) {
        return tourRepository.findById(id);
    }

}
