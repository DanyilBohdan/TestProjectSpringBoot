package ua.dnipro.epam.bohdan.homework_5.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.dnipro.epam.bohdan.homework_5.entity.Tour;
import ua.dnipro.epam.bohdan.homework_5.service.TourService;

import java.util.Optional;

@RestController
@RequestMapping("tours")
public class TourController {

    private static final String DESC = "desc";

    private TourService tourService;

    @Autowired
    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping(value = "/all/{page}/{sort}")
    public Iterable<Tour> getAllTourSort(@PathVariable Integer page,
                                         @PathVariable String sort) {
        return tourService.findAll(page, sort, "null");
    }

    @GetMapping(value = "/all/{page}/{sort}/desc")
    public Iterable<Tour> getAllTourSortDesc(@PathVariable Integer page,
                                             @PathVariable String sort) {
        return tourService.findAll(page, sort, DESC);
    }

    @GetMapping(value = "/{id}")
    public Optional<Tour> getAllById(@PathVariable Long id) {
        return tourService.findById(id);
    }

}
