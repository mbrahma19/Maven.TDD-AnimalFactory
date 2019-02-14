package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    private static Cat fifi = new Cat("Fifi", new Date(), 9);
    private static Cat testCat = new Cat("Snow", new Date(), 10);


    @Test
    public void addCatTest(){
        //Given
        CatHouse newCatHouse = new CatHouse();
        //When
        newCatHouse.add(testCat);
        Cat actualCat = newCatHouse.getCatById(10);
        //Then
        Assert.assertEquals(testCat,actualCat);
    }


    @Test
    public void removeCatByIdTest(){
        //Given
        CatHouse newCatHouse = new CatHouse();
        //When
        newCatHouse.add(fifi);
        newCatHouse.remove(9);
        //When
        //Then
        Assert.assertEquals(null,newCatHouse.getCatById(9));
    }

    @Test
    public void removeCatByCatTest(){
        //Given
        CatHouse newCatHouse = new CatHouse();
        Cat expectedCat = null;
        //When
        newCatHouse.add(fifi);
        newCatHouse.remove(fifi);
        //When
        //Then
        Assert.assertEquals(null,newCatHouse.getCatById(9));

    }

    @Test
    public void getCatByIdTest(){
        //Given
        CatHouse newCatHouse = new CatHouse();
        //When
        newCatHouse.add(testCat);
        Cat actualCat = newCatHouse.getCatById(10);
        //Then
        Assert.assertEquals(testCat,actualCat);
    }

    @Test
    public void addNumberOfCatsTest(){
        //Given
        CatHouse lastCatHouse = new CatHouse();
        lastCatHouse.clear();
        Integer expectedNumberOfCats = 2;
        //When
        lastCatHouse.add(fifi);
        lastCatHouse.add(testCat);
        //When
        //Then
        Assert.assertEquals(expectedNumberOfCats,lastCatHouse.getNumberOfCats());
    }
}
