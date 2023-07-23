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

public class Waitinglist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int waiting_id;
        private int user_id;
        private int train_id;
        private User user;
        private Train train;
        private int position;



    }

