package org.project.fwo.model.user;

//import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

class UserTest {
    private final User user = Mockito.mock(
            User.class,
            Mockito.CALLS_REAL_METHODS);

    @BeforeEach
    public void setup(){
        user.setUsername("admin");
        user.setEmail("admin@gmail.com");
        user.setPassword("admin");
    }


    @Test
    void testInit(){
        Assertions.assertEquals("admin", user.getUsername());
        Assertions.assertEquals("admin@gmail.com", user.getEmail());
        Assertions.assertEquals("admin", user.getPassword());
    }

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
    void testSetterGetter(){
        user.setUsername("MerlinPinpin");
        user.setEmail("merlin@gmail.com");
        user.setPassword("Merlin");

        Assertions.assertEquals("MerlinPinpin", user.getUsername());
        Assertions.assertEquals("merlin@gmail.com", user.getEmail());
        Assertions.assertEquals("Merlin", user.getPassword());
    }
}