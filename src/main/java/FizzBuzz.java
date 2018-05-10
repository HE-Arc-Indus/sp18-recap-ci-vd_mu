public class FizzBuzz {


  public FizzBuzz() {
  }

  public int[] cheatSheet(){
    int[] maListe = new int[100];
    for(int i=1;i<=100;i++){
      maListe[i-1] = i;
    }
    return maListe;
  }


  public static boolean estMultiple(int numero, int diviseur){
    if (numero%diviseur==0){
      return true;
    }else{
      return false;
    }
  }

  public static String fizzBuzz(int numero){
    return null;//TODO implémenter méthode
  }
}
