package happyfamily;

import static org.junit.jupiter.api.Assertions.*;
import happyfamily.abstracts.Pet;
import happyfamily.pets.Dog;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashSet;
import java.util.Set;

class PetTest {
    private Pet Dog;

    @BeforeEach
    void init() {
        Dog = new Dog( "Cloud",1, 8, Set.of ("playing","eating"));

    }

    @Test
    void testPetEqual() {
        Set<String> habits = new HashSet<>(Set.of("eating", "sleeping"));
        Pet Dog2 = new Dog ( "Cloud", 1, 8,habits ) ;
        assertEquals(Dog, Dog2);
    }

    @Test
    void testPetNonEqual(){
        Set<String> habits = new HashSet<>(Set.of("sleeping", "eating"));
        Pet Dog2 = new Dog ( "Cloude", 1, 1, habits);
        assertNotEquals(Dog, Dog2);
    }
}