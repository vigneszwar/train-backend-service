package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
//hello
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Stations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int station_id;
    private String name;
    private String location;
}
