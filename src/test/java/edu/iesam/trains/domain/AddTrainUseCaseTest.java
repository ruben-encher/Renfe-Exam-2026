package edu.iesam.trains.domain;

import edu.iesam.trains.mock.TrainMockRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTrainUseCaseTest {

    TrainMockRepository trainMockRepository;
    AddTrainUseCase addTrainUseCase;

    @Test
    void add() {
        trainMockRepository = new TrainMockRepository();
        addTrainUseCase = new AddTrainUseCase(trainMockRepository);
        Train train = new Train("1", "100","200/km","Avila");
        addTrainUseCase.add(train);

        assertEquals(1, trainMockRepository.coundAddTrain);
    }
}