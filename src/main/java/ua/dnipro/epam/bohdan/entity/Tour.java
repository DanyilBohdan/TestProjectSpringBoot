package ua.dnipro.epam.bohdan.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String type_tour;

    private String country;

    private Float price;

    private Integer count_people;

    private Integer mark_hotel;

    private Date start_date;

    private Integer days;
}
