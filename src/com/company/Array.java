package com.company;

public class Array {

    private int[] tabela; //(2)Deklarujemy utworzenie tabeli liczb, ale jej nie inicjalizujemy
    private int licznik; //(3) Deklarujemy licznik ilości itemów naszej tabeli

    //(4) Tworzymy konstruktor klasy Lista z jednym parametrem (wielkość listy)
    public void CreateArray(int length){
        //(5) Inicjalizujemy listę
        int[] tabela = new int[length];
        for(int i=0; i< tabela.length; i++){
            tabela[i] = i+1;
        }
        Print(tabela);
    }
    //(6) Tworzymy metodę która bedzie drukować wszystkie elementy tabel
    //(7) TESTUJEMY METODĘ, jak nie działa, poprawiamy aż do skutku
    public void Print(int[] tabela){
        System.out.println("długość tablicy: " + tabela.length);
        for (int i = 0; i < tabela.length; i++) {
            System.out.println(tabela[i]);
        }
    }



    //TODO(8) Tworzymy metodę dodaj - metoda ma mieć jeden parametr (element który chcemy dodać)
    //TODO(9) Dodawanie elementu do tabeli po ostatnio dodanym elemencie (pamiętaj o zwiększeniu licznika ilości elementów po dodatniu elementu!)
        //TODO(10) Jeżeli tabela jest pełna, musimy zrobić nową
            //TODO(11) Tworzymy nową tabelę z większą pojemnością (2x większą niż poprzednia)
            //TODO(12) Kopiujemy wszystkie elementy z pierwotnej tabeli do tabeli nowej
            //TODO(13) Przypisujemy starej tabeli wartość nowej
    //TODO(14) TESTUJEMY METODĘ!


    //TODO(15)Tworzymy metodę usuńIndex - metoda z jednym parametrem, który jest indeksem
        //TODO(16) Sprawdzenie czy index podany w metodzie nie jest poza zasięgiem naszej listy - w przypadku indeksu z poza zakresu powinna zostać wydrukowana informacja o tym
        //TODO(17) Przesuwamy wszystkie elementy tak, żeby zapełnić "dziurę" po usunieciu elementu (wskazówka: użyj pętli for)
    //TODO(18) TESTUJEMY METODĘ, jak nie działa, poprawiamy aż do skutku


    //TODO(19) Tworzymy metodę jakiIndex - metoda z jednym parametrem tj. wartością którą chcemy znaleźć i odnaleźć index - metoda ma ZWRACAć int (numer inddexu, lub -1 w przypadku braku takiej wartości w tabeli)

}
