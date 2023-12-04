package aulaArray;

public class ArraysTester {
    public static void main(String[] args) {

        int [] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println();
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        for(int x:numbers){     //Pos Java 5 - for each
            System.out.println(x);
        }

        String [] names = new String[3];

        System.out.println();

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        names[0] = "Florentino";
        names[1] = "Fermina";
        names[2] = "Aureliano";

        System.out.println();

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        String[] weekend = {"Saturday", "Sunday"};
        System.out.println();

        for(int i = 0; i < weekend.length; i++){
            System.out.println(weekend[i]);
        }

        Hospede [] hospedes = new Hospede[2];

        Hospede florentino = new Hospede();
        florentino.setNome("Florentino");
        florentino.setSobrenome("de Jesus");

        hospedes[0] = florentino;

        Hospede fermina = new Hospede("Fermina", "Daza");

        hospedes[1] = fermina;
        System.out.println();


        for(int i = 0; i < hospedes.length; i++){
            System.out.println(hospedes[i].getNome());
            System.out.println(hospedes[i].getSobrenome());
        }


        //int [][] twoDimension = new int[2][2];

      int [][] twoDimension = new int[2][];
      twoDimension[0] = new int[2];
      twoDimension[1] = new int[5];

      System.out.println();

      for(int i = 0; i < twoDimension.length; i++){
          for(int j = 0; j < twoDimension[i].length; j++){
              twoDimension[i][j] = (int)(Math.random() * 10);
              System.out.println(twoDimension[i][j]);
          }
      }




    }
}
