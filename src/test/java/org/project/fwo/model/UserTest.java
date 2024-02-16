package model.Personnage;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

public class PersonnageTest {
    private User user = Mockito.mock(
            User.class,
            Mockito.CALLS_REAL_METHODS);

    @BeforeEach
    private void setup(){
        user.setUsername("admin");
        user.setEmail("admin@gmail.com");
        user.setPassword("admin");
    }


    public void testInit(){
        Assertions.assertEquals("admin", perso.getUsername());
        Assertions.assertEquals("admin@gmail.com", perso.getEmail());
        Assertions.assertEquals("admin", perso.getPassword());
    }

    /*@ParameterizedTest
    @CsvSource({
            "50, 50",
            "150, 0",
            "-20, 100"
    })
    public void testTakeDmg(int dmg, int life){

        //When
        perso.takeDmg(dmg);

        //Then
        Assertions.assertEquals(life, perso.getLife());

    }*/

    /*@ParameterizedTest
    @CsvSource({
            "40, 90",
            "150, 100",
            "-20, 50"
    })
    public void testSoigner(int heal, int life){

        //When
        perso.takeDmg(50);
        perso.soigner(heal);

        //Then
        Assertions.assertEquals(life, perso.getLife());

    }

    @ParameterizedTest
    @CsvSource({
            "150, 15, 85",
            "105, 11, 89",
            "-20, 0, 100"
    })
    public void testCoup(int force, int dmg, int life){
        //Given
        Personnage persoSecondaire = Mockito.mock(
                Personnage.class,
                Mockito.CALLS_REAL_METHODS);
        persoSecondaire.setLifeMax(100);
        persoSecondaire.setLife(100);

        Mockito.when(perso.calcPhyDmg())
                .thenReturn(dmg);

        //When
        perso.setStreng(force);
        perso.coup(persoSecondaire);

        //Then
        Assertions.assertEquals(force, perso.getStreng());
        Assertions.assertEquals(life, persoSecondaire.getLife());
    }*/

    @Test
    public void testSetterGetter(){
        perso.setUserame("MerlinPinpin");
        perso.setEmail("merlin@gmail.com");
        perso.setPassword("Merlin");

        Assertions.assertEquals("MerlinPinpin", perso.getUsername());
        Assertions.assertEquals("merlin@gmail.com", perso.getEmail());
        Assertions.assertEquals("Merlin", perso.getPassword());
    }
}