package edu.iesam.trains.domain;

public interface TrainRepository {

    void add(Train train);

    void delete(String id);
}
