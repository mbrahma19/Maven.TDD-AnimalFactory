package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


        private static Dog garbage = new Dog("Garbage", new Date(), 1);
        private static Dog kilo = new Dog("Kilo", new Date(), 2);


        @Test
        public void addDogTest(){
            //Given
            DogHouse newDogHouse = new DogHouse();
            //When
            newDogHouse.add(kilo);
            Dog actualDog = newDogHouse.getDogById(2);
            //Then
            Assert.assertEquals(kilo,actualDog);

        }


        @Test
        public void removeDogByIdTest(){
            //Given
            DogHouse newDogHouse = new DogHouse();
            //When
            newDogHouse.add(kilo);
            newDogHouse.remove(2);
            //When
            //Then
            Assert.assertEquals(null,newDogHouse.getDogById(2));
        }

        @Test
        public void removeCatByCatTest(){
            //Given
            DogHouse newDogHouse = new DogHouse();
            //When
            newDogHouse.add(garbage);
            newDogHouse.remove(garbage);
            //When
            //Then
            Assert.assertEquals(null,newDogHouse.getDogById(9));

        }

        @Test
        public void getDogByIdTest(){
            //Given
            DogHouse newDogHouse = new DogHouse();
            //When
            newDogHouse.add(kilo);
            Dog actualDog = newDogHouse.getDogById(2);
            //Then
            Assert.assertEquals(kilo,actualDog);
        }

        @Test
        public void getNumberOfDogsTest(){
            //Given
            DogHouse lastDogHouse = new DogHouse();
            lastDogHouse.clear();
            Integer expectedNumberOfCats = 2;
            //When
            lastDogHouse.add(kilo);
            lastDogHouse.add(garbage);
            //When
            //Then
            Assert.assertEquals(expectedNumberOfCats,lastDogHouse.getNumberOfDogs());
        }

    @Test
    public void testGetNumberOfDogs(){
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
