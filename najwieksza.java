import java.util.Scanner;

//zadanie 2.2
public class najwieksza {
    public static void main(String[] args) {

//wspisanie trzech liczb
        System.out.println("podaj mi 3 liczby, a posegreguje je rosnaco");
        double[] liczby = new double[3];
        Scanner skaner = new Scanner(System.in);
        for(int i=0;i<3;i++)
            liczby[i] = skaner.nextDouble();


//sortowanie
        int zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<2; i++){
                if(liczby[i]< liczby[i+1]){
                    double temp = liczby[i+1];
                    liczby[i+1] = liczby[i];
                    liczby[i] = temp;
                    zmiana++;
                }
            }
        }
//wypisanie liczb
        System.out.println("liczby zostaly posortowane: "+ liczby[0]+" > "+liczby[1]+" > "+liczby[2]);
    }
}
