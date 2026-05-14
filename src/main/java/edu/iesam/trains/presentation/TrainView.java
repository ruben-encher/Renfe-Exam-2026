package edu.iesam.trains.presentation;

import edu.iesam.trains.data.TrainDataRepository;
import edu.iesam.trains.data.TrainMemLocalDataSource;
import edu.iesam.trains.domain.AddTrainUseCase;
import edu.iesam.trains.domain.Train;

public class TrainView {

    public static void addTrain() {
        AddTrainUseCase addTrainUseCase = new AddTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        Train train = new Train("1", "100", "100/km", "Ávila");
        addTrainUseCase.add(train);
    }
}
