package org.example.burgertracker.models;



import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@Table(name = "burgers")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "name is required")
    @Size(min = 5, max = 20, message = "name at least should be 5 characters")
    private String name;

    @NotNull(message = "Restaurant is required")
    @Size(min = 5, max = 20, message = "restaurant at least should be 5 characters")
    private String restaurant;

    @NotNull(message = "Rating is required")
    @Min(value = 1, message = "Rating must be at least 1")
    private Integer rating;

    @NotNull(message = "Rating is required")
    @Size(min = 5, max = 20, message = "notes at least should be 5 characters")
    private String notes;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    public Burger() {
    }

    public Burger(String name, String restaurant, Integer rating, String notes) {
        this.name = name;
        this.restaurant = restaurant;
        this.rating = rating;
        this.notes = notes;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}