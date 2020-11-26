package ua.dnipro.epam.bohdan.homework_5.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType_tour() {
        return type_tour;
    }

    public void setType_tour(String type_tour) {
        this.type_tour = type_tour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCount_people() {
        return count_people;
    }

    public void setCount_people(Integer count_people) {
        this.count_people = count_people;
    }

    public Integer getMark_hotel() {
        return mark_hotel;
    }

    public void setMark_hotel(Integer mark_hotel) {
        this.mark_hotel = mark_hotel;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
