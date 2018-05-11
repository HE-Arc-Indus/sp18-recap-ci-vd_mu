import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

  FizzBuzz  fB;

  @Before
  public void init(){
    fB = new FizzBuzz();
  }

  @Test
  public void cheatSheet() throws Exception {
  }

  @Test
  public void listeDeUnACent(){
    int[] table  = fB.cheatSheet();
    for(int i=1;i<=100;i++){
      assertEquals("le nombre suit la séquence", i, table[i-1]);
    }
  }

  @Test
  public void estUnMultipeDe(){
    assertTrue("3 est un multiple de 3", fB.estMultiple(3,3));
    assertFalse("5 est un multiple de 3", fB.estMultiple(5,3));
    assertTrue("5 est un multiple de 5", fB.estMultiple(5,5));
    assertFalse("6 est un multiple de 3", fB.estMultiple(3,5));
    assertTrue("15 est un multiple de 3", fB.estMultiple(15,3));
    assertTrue("15 est un multiple de 5", fB.estMultiple(15,5));
  }

  @Test
  public void fizzBuzz(){
    assertEquals("fizzBuzz de 1 retourne 1", fB.fizzBuzz(1), "1");
    assertEquals("fizzBuzz de 3 retourne Fizz", fB.fizzBuzz(3), "Fizz");
    assertEquals("fizzBuzz de 5 retourne Buzz", fB.fizzBuzz(5), "Buzz");
    assertEquals("fizzBuzz de 15 retourne FizzBuzz", fB.fizzBuzz(15), "FizzBuzz");
    }

  @Test
  public void contient() {
    Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz( -391));
    Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz( -95));

  }
}
