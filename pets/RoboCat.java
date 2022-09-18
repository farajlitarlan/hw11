package happyfamily.pets;


import happyfamily.abstracts.Pet;
import happyfamily.abstracts.Foul;
import happyfamily.Species;



import java.util.Set;

public class RoboCat extends Pet implements Foul {
    public RoboCat(){
        super.setSpecies(Species.ROBOCAT);

    }
    public RoboCat( String nickName, int age, int trickLevel,  Set<String> habits){
        super(nickName, age, trickLevel, habits);
        super.setSpecies(Species.ROBOCAT);
    }
    @Override
    public void respond() {
        System.out.println(this.getNickName() +  " is responding" );

    }

    @Override
    public void foul() {
        System.out.println(this.getNickName() +  " fouls" );

    }
}