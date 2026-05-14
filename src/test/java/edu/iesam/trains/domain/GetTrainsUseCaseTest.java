package edu.iesam.trains.domain;

import edu.iesam.trains.mock.EmptyMockRepository;
import edu.iesam.trains.mock.NullMockRepository;
import edu.iesam.trains.mock.TrainMockRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GetTrainsUseCaseTest {

    TrainMockRepository trainMockRepository;
    EmptyMockRepository emptyMockRepository;
    NullMockRepository nullMockRepository;
    GetTrainsUseCase getTrainsUseCase;

    @Test
    void trains() {

        trainMockRepository = new TrainMockRepository();
        getTrainsUseCase = new GetTrainsUseCase(trainMockRepository);

        ArrayList<Train> trains = getTrainsUseCase.getAll();

        assertEquals(3, trains.size());
        assertEquals("1",trains.get(0).getId());
    }

    @Test
    void emptyList() {
        emptyMockRepository = new EmptyMockRepository();
        getTrainsUseCase = new GetTrainsUseCase(emptyMockRepository);

        ArrayList<Train> trains = getTrainsUseCase.getAll();

        assertEquals(0, trains.size());
    }

    @Test
    void nullList() {
        nullMockRepository = new NullMockRepository();
        getTrainsUseCase = new GetTrainsUseCase(nullMockRepository);

        ArrayList<Train> trains = getTrainsUseCase.getAll();

        assertNull(trains);
    }
}