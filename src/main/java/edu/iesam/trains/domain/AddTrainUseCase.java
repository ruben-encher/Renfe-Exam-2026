package edu.iesam.trains.domain;

public class AddTrainUseCase {

    TrainRepository trainRepository;

    public AddTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void add(Train train) {
        trainRepository.add(train);
    }
}
