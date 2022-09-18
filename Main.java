package happyfamily;

import happyfamily.abstracts.Pet ;
import happyfamily.pets.Dog ;
import happyfamily.dao.FamilyService;
import happyfamily.humans.Man;
import happyfamily.humans.Woman;
import happyfamily.dao.impl.CollectionFamilyDao;
import java.time.LocalDate;
import java.util.Date;

public class Main {




    public static void main(String[] args) {

        Human mother = new Woman();
        Human father= new Man();
        Family family=new Family(mother,father);
        Human child= new Human();
        FamilyService familyService = new FamilyService(new CollectionFamilyDao());
        familyService.createNewFamily(mother, father);
        System.out.println(familyService.count());
        System.out.println(familyService.getAllFamilies());
        System.out.println(familyService.countFamiliesWithMemberNumber(2));
        System.out.println(familyService.getFamilyById(0));

        // Human mother= new Human("Ann" ,"Murphy",1989);
       // Human father = new Human("Jack","Murphy", 1985);
      // Pet pet = new Dog ("dog", "Cloud", 1, 8,
        //        new String[] {"playing","eating" , "walking"} );

        //Family mFamily = new Family(mother,father);

       // Human child1 = new Human("Belle", "Murphy", 2002,
         //       110, new String[][]{{"sunday","reading book"}},mFamily);
      //  Human child2 = new Human("Jacob","Murphy",2005,
        //        102,new String[][]{{"sunday,do sport"}},mFamily);

       // mFamily.setPet(pet);

      //  mFamily.addChild(child1);
      //  mFamily.addChild(child2);
      //  System.out.println(mFamily+" -- "+mFamily.countFamily());





    }
    }

