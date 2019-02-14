package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    private static Cat testCat = new Cat("Fifi", new Date(), 10);

    @Test
    public void speakTest(){
        //Given
        String expected = "meow!";
        //When
        String actual = testCat.speak();
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setBirthDateTest(){
        //Given
        int newYear = 2014;
        int newMonth = 11;
        int newDay = 01;
        Date newDate = new Date(newYear, newMonth, newDay);

        //When
        testCat.setBirthDate(new Date(newYear,newMonth, newDay));

        //Then
        Assert.assertEquals(testCat.getBirthDate(), newDate);

    }

    @Test
    public void eatFoodTest(){
        //Given
        Food eatenFood = new Food();
        Integer expectedMeals = 1;
        //When
        testCat.eat(eatenFood);
        Integer actualMealsEaten = testCat.getNumberOfMealsEaten();
        //Then
        Assert.assertEquals(expectedMeals, actualMealsEaten);
    }



    @Test
    public void getIdTest(){
        //Given
        Integer expectedId = 10;
        //When
        Integer actualId = testCat.getId();
        //Then
        Assert.assertEquals(expectedId,actualId);

    }

    @Test
    public void getMammalInheritanceTest(){
        //Given
        boolean catIsAMammal = true;
        //When
        boolean checkCatIsAMammal = (testCat instanceof Mammal);
        //Then
        Assert.assertEquals(catIsAMammal,checkCatIsAMammal);
    }

    @Test
    public void getAnimalInheritanceTest(){
        //Given
        boolean catIsAnAnimal = true;
        //When
        boolean checkCatIsAnAnimal = (testCat instanceof Animal);
        //Then
        Assert.assertEquals(catIsAnAnimal,checkCatIsAnAnimal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
