package edu.iesam.trains.domain;

public class DeleteTrainUseCase {

    TrainRepository trainRepository;

    public DeleteTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void delete(String id) {
        trainRepository.delete(id);
    }
}
