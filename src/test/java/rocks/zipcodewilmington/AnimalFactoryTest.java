package rocks.zipcodewilmington;

import junit.framework.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;


import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog(){
        //given
        String expectedName = "Garbage";
        Date expectedBirthDate = new Date(2101, 11, 1);
        boolean expectedType = true;

        //when
        AnimalFactory newAF = new AnimalFactory();
        Dog actualDog = newAF.createDog("Garbage", new Date(2101, 11, 1));
        boolean actualType = ( actualDog instanceof Dog);
        String actualName = actualDog.getName();
        Date actualDate = actualDog.getBirthDate();

        //then
        Assert.assertEquals(expectedType,actualType);
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedBirthDate,actualDate);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat(){
        //given
        String expectedName = "Fifi";
        Date expectedBirthDate = new Date(2011, 1, 19);
        boolean expectedType = true;

        //when
        AnimalFactory newAF = new AnimalFactory();
        Cat actualCat = newAF.createCat("Fifi", new Date(2011, 1, 19));
        boolean actualType = ( actualCat instanceof Cat);
        String actualName = actualCat.getName();
        Date actualDate = actualCat.getBirthDate();

        //then
        Assert.assertEquals(expectedType,actualType);
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedBirthDate,actualDate);

    }
}
