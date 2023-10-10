

//zadanie 2.2
public class najwieksza {
    public static void main(String[] args) {

//wspisanie trzech liczb
        System.out.println("podaj mi 3 liczby, a posegreguje je rosnaco");
        double[] liczby = new double[3];
        liczby[0] = 1;
        liczby[1] = 2;
        liczby[2] = 3;

//sortowanie
        for(int i = 0; i < 2; i++)
            if (liczby[i] > liczby[i+1])
            {
                double temp = liczby[i];
                liczby[i]=liczby[i+1];
                liczby[i+1]= temp;
            }
//wypisanie liczb
        System.out.println("liczby zostaly posortowane: "+ liczby[0]+" > "+liczby[1]+" > "+liczby[2]);
    }
}
