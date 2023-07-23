package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Trains {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Train_id;
    private String source_station;
    private String destination_station;
    private String Train_name;
    private Integer total_seat;
}
