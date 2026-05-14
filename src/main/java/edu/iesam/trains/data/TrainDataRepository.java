package edu.iesam.trains.data;

import edu.iesam.trains.domain.Train;
import edu.iesam.trains.domain.TrainRepository;

import java.util.ArrayList;

public class TrainDataRepository implements TrainRepository {

    TrainMemLocalDataSource trainMemLocalDataSource;

    public TrainDataRepository(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }

    @Override
    public void add(Train train) {
        trainMemLocalDataSource.add(train);
    }

    @Override
    public void delete(String id) {
        trainMemLocalDataSource.delete(id);
    }

    @Override
    public ArrayList<Train> getAll() {
        return trainMemLocalDataSource.findAll();
    }
}
