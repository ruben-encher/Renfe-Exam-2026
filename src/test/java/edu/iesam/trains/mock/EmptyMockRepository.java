package edu.iesam.trains.mock;

import edu.iesam.trains.domain.Train;
import edu.iesam.trains.domain.TrainRepository;

import java.util.ArrayList;

public class EmptyMockRepository implements TrainRepository {
    @Override
    public void add(Train train) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ArrayList<Train> getAll() {
        ArrayList<Train> trains = new ArrayList<>();
        return trains;
    }
}
