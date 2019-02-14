package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    private static Dog testDog = new Dog("Garbage", new Date(), 19);

    @Test
    public void speakTest(){
        //Given
        String expected = "bark!";
        //When
        String actual = testDog.speak();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setBirthDateTest(){
        //Given
       int newYear = 2018;
       int newMonth = 9;
       int newDay = 23;
       Date newDate = new Date(newYear, newMonth, newDay);

       //When
       testDog.setBirthDate(new Date(newYear,newMonth, newDay));

       //Then
        Assert.assertEquals(testDog.getBirthDate(), newDate);

    }

    @Test
    public void setBirthDateTest000(){
        //Given
        int newYear = 0;
        int newMonth = 0;
        int newDay = 0;
        Date newDate = new Date(newYear, newMonth, newDay);

        //When
        testDog.setBirthDate(new Date(newYear,newMonth, newDay));

        //Then
        Assert.assertEquals(testDog.getBirthDate(), newDate);

    }

    @Test
    public void eatFoodTest(){
        //Given
        Food eatenFood = new Food();
        Integer expectedMeals = 1;
        //When
        testDog.eat(eatenFood);
        Integer actualMealsEaten = testDog.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expectedMeals, actualMealsEaten);
    }



    @Test
    public void getIdTest(){
        //Given
        Integer expectedId = 19;
        //When
        Integer actualId = testDog.getId();
        //Then
        Assert.assertEquals(expectedId,actualId);

    }

    @Test
    public void getMammalInheritanceTest(){
        //Given
        boolean dogIsAMammal = true;
        //When
        boolean checkDogIsAMammal = (testDog instanceof Mammal);
        //Then
        Assert.assertEquals(dogIsAMammal,checkDogIsAMammal);
    }

    @Test
    public void getAnimalInheritanceTest(){
        //Given
        boolean dogIsAnAnimal = true;
        //When
        boolean checkDogIsAnAnimal = (testDog instanceof Animal);
        //Then
        Assert.assertEquals(dogIsAnAnimal,checkDogIsAnAnimal);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
