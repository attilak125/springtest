package com.example.demo.services;

import com.example.demo.modells.Training;
import com.example.demo.repositories.TrainingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultTrainingService implements TrainingService{
    private final TrainingRepository trainingRepository;

    public DefaultTrainingService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public List<Training> findAll() {
        return trainingRepository.findAll();
    }

    @Override
    public void save(String training) {
        trainingRepository.save(new Training(training));
    }
}
