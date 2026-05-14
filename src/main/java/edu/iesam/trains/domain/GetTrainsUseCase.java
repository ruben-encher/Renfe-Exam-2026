package edu.iesam.trains.domain;

import java.util.ArrayList;

public class GetTrainsUseCase {

    TrainRepository trainRepository;

    public GetTrainsUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public ArrayList<Train> getAll() {
        return trainRepository.getAll();
    }
}
