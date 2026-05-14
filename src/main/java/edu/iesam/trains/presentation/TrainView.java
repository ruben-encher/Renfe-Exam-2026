package edu.iesam.trains.presentation;

import edu.iesam.trains.data.TrainDataRepository;
import edu.iesam.trains.data.TrainMemLocalDataSource;
import edu.iesam.trains.domain.AddTrainUseCase;
import edu.iesam.trains.domain.DeleteTrainUseCase;
import edu.iesam.trains.domain.GetTrainsUseCase;
import edu.iesam.trains.domain.Train;

import java.util.ArrayList;

public class TrainView {

    public static void addTrain(Train train) {
        AddTrainUseCase addTrainUseCase = new AddTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        addTrainUseCase.add(train);
    }

    public static void deleteTrain(String id) {
        DeleteTrainUseCase deleteTrainUseCase = new DeleteTrainUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));
        deleteTrainUseCase.delete(id);
    }

    public static void printTrains() {
        GetTrainsUseCase getTrainsUseCase = new GetTrainsUseCase(new TrainDataRepository(TrainMemLocalDataSource.newInstance()));

        ArrayList<Train> trains = getTrainsUseCase.trains();
        System.out.println("Listado de trenes:" + trains);
    }

    public static void function1() {
        TrainView.printTrains();
        TrainView.addTrain(new Train("1", "100", "100/km", "Ávila"));
        TrainView.printTrains();
    }

    public static void function2() {
        TrainView.printTrains();
    }

    public static void function3() {
        TrainView.printTrains();
        TrainView.deleteTrain("1");
        TrainView.printTrains();
    }
}
