package com.example.demo.services;

import com.example.demo.modells.Training;

import java.util.List;

public interface TrainingService {
    List<Training> findAll();

    void save(String training);
}
