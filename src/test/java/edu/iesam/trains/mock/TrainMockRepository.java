package edu.iesam.trains.mock;

import edu.iesam.trains.domain.Train;
import edu.iesam.trains.domain.TrainRepository;

import java.util.ArrayList;

public class TrainMockRepository implements TrainRepository {

    public Integer coundAddTrain = 0;

    @Override
    public void add(Train train) {
        coundAddTrain++;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ArrayList<Train> getAll() {
        ArrayList<Train> trains = new ArrayList<>();
        Train train = new Train("1", "100","200/km","Avila");
        Train train2 = new Train("2", "150","220/km","Madrid");
        Train train3 = new Train("3", "160","180/km","Valencia");
        trains.add(train);
        trains.add(train2);
        trains.add(train3);
        return trains;
    }
}
