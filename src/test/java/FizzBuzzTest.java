import static org.junit.Assert.assertEquals;

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
}
