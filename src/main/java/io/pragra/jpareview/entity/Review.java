package io.pragra.jpareview.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Date reviewDate;

    private int star;

    private String reviewText;

}