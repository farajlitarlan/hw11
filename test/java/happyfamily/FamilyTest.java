package happyfamily;

import static org.junit.jupiter.api.Assertions.*;
import  happyfamily.Family ;
import  happyfamily.humans.Man ;
import  happyfamily.humans.Woman ;
import org.junit.jupiter.api.Test;

class FamilyTest {
    private final Human mother = new Human();
    private final Human father= new Human();
    private final Human child= new Human();
    private final Family family=new Family(mother,father);


    @Test
    void testAddChild(){
        family.addChild(child) ;
        assertEquals(1, family.getChildren().size());
    }

    @Test
    void testCountFamily(){
        family.addChild(child);
        assertEquals(3, family.countFamily());
    }

    @Test
    void testDeleteChild(){
        family.addChild(child);
        family.deleteChild(0);
        assertEquals(0, family.getChildren().size());

    }








}