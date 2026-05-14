package edu.iesam.trains.data;

import edu.iesam.trains.domain.Train;
import edu.iesam.trains.domain.TrainRepository;

public class TrainDataRepository implements TrainRepository {

    TrainMemLocalDataSource trainMemLocalDataSource;

    public TrainDataRepository(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }

    @Override
    public void add(Train train) {
        trainMemLocalDataSource.add(train);
    }
}
