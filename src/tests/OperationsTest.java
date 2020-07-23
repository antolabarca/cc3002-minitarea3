package tests;

import main.city.*;
import main.operations.CountingVehicle;
import main.operations.VehicleByDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OperationsTest {
    City santiago;
    Comuna nunoa;
    Comuna penalolen;
    Comuna pudahuel;
    Comuna quilicura;
    Comuna puentealto;
    Comuna lareina;
    Auto a1, a2, a3, a4;
    Truck t1, t2, t3, t4;

    @BeforeEach
    public void setUp(){
        santiago = new City();

        nunoa = new Comuna();
        penalolen = new Comuna();
        pudahuel = new Comuna();
        quilicura = new Comuna();
        lareina = new Comuna();
        puentealto = new Comuna();

        santiago.add(nunoa);
        santiago.add(penalolen);
        santiago.add(pudahuel);
        santiago.add(quilicura);
        santiago.add(lareina);
        santiago.add(puentealto);

        a1 = new Auto(2015);
        a2 = new Auto(2015);
        a3 = new Auto(2018);
        a4 = new Auto(2019);

        t1 = new Truck(2001);
        t2 = new Truck(2019);
        t3 = new Truck(2015);
        t4 = new Truck(2017);

        nunoa.add(a1);
        nunoa.add(t1);
        nunoa.add(t2);
        penalolen.add(a2);
        pudahuel.add(t3);
        quilicura.add(a3);
        quilicura.add(t4);
        lareina.add(a4);
    }

    @Test
    public void testCitysComunas(){
        assertEquals(0, new City().comunas().size());
        assertEquals(6, santiago.comunas().size());
        assertTrue(santiago.comunas().contains(nunoa));
        assertTrue(santiago.comunas().contains(penalolen));
        assertTrue(santiago.comunas().contains(pudahuel));
        assertTrue(santiago.comunas().contains(quilicura));
        assertTrue(santiago.comunas().contains(lareina));
        assertTrue(santiago.comunas().contains(puentealto));
    }

    @Test
    public void testComunasVehicles(){
        assertEquals(3, nunoa.vehicles().size());
        assertTrue(nunoa.vehicles().contains(a1));
        assertTrue(nunoa.vehicles().contains(t1));
        assertTrue(nunoa.vehicles().contains(t2));
        assertEquals(1, penalolen.vehicles().size());
        assertTrue(penalolen.vehicles().contains(a2));
        assertEquals(1, pudahuel.vehicles().size());
        assertTrue(pudahuel.vehicles().contains(t3));
        assertEquals(2, quilicura.vehicles().size());
        assertTrue(quilicura.vehicles().contains(a3));
        assertTrue(quilicura.vehicles().contains(t4));
        assertEquals(1, lareina.vehicles().size());
        assertTrue(lareina.vehicles().contains(a4));
        assertEquals(0, puentealto.vehicles().size());
    }

    @Test
    public void testNumberOfVehicles(){
        CountingVehicle cv = new CountingVehicle();
        santiago.accept(cv);
        assertEquals(4, cv.numberOfAutos());
        assertEquals(4, cv.numberOfTrucks());
        CountingVehicle cv2 = new CountingVehicle();
        City rancagua = new City();
        rancagua.accept(cv2);
        assertEquals(0,cv2.numberOfAutos());
        assertEquals(0,cv2.numberOfTrucks());
    }

    @Test
    public void testVehiclesByYear(){
        VehicleByDate vd = new VehicleByDate(2015);
        santiago.accept(vd);
        assertEquals(3, vd.vehiclesByYear().size());
        assertTrue(vd.vehiclesByYear().contains(a1));
        assertTrue(vd.vehiclesByYear().contains(a2));
        assertTrue(vd.vehiclesByYear().contains(t3));
        VehicleByDate vd2 = new VehicleByDate(2020);
        assertEquals(0, vd2.vehiclesByYear().size());
    }
}
