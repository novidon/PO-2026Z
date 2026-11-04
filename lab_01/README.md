# Lab 1

## Zadanie 4

Błędy:
1. brak średnika po `new Scanner(System.in)` - kompilator
2. `liczba % 2 = 0` zamiast `==` (to jest przypisanie, a w if musi być boolean) - kompilator
3. brak średnika po `println("Liczba jest nieparzysta")` - kompilator
4. `i--` w pętli for, i ciągle maleje więc warunek `i <= 5` jest zawsze spełniony i pętla się nie kończy. Tego kompilator nie wykryje, wychodzi dopiero po uruchomieniu.

## Zadanie 5

| i | wynik | x |
|---|---|---|
| - | 0 | 2 |
| 0 | 2 | 4 |
| 1 | 6 | 8 |
| 2 | 14 | 16 |
| 3 | 30 | 32 |

Program wypisze 32 i 30.

## Zadanie 6

```
Klasa: Ksiazka
Stan: tytul, autor, isbn, rokWydania
Odpowiedzialności: przechowuje dane książki, wie czy jest wypożyczona

Klasa: Czytelnik
Stan: imie, nazwisko, numerKarty
Odpowiedzialności: identyfikuje osobę, zna swoje wypożyczenia

Klasa: Wypozyczenie
Stan: ksiazka, czytelnik, dataWypozyczenia, terminZwrotu
Odpowiedzialności: pamięta kto i kiedy wypożyczył, sprawdza czy minął termin

Klasa: Biblioteka
Stan: lista książek, lista czytelników, lista wypożyczeń
Odpowiedzialności: dodawanie książek i czytelników, wypożyczanie i zwroty
```

Biblioteka ma książki, czytelników i wypożyczenia. Wypożyczenie łączy jedną książkę z jednym czytelnikiem. Czytelnik może mieć kilka wypożyczeń.

## Zadanie 7

Wybrałem kino.

- Film - tytuł, reżyser, czas trwania, kategoria wiekowa
- Sala - numer, liczba rzędów i miejsc
- Seans - film, sala, data i godzina, cena; sprawdza wolne miejsca i rezerwuje
- Klient - imię, nazwisko, email
- Bilet - seans, klient, rząd, miejsce, cena

1. Seans musi znać film i salę, bilet musi znać seans i klienta. Film nie musi nic wiedzieć o seansach.
2. Rezerwację miejsca łatwo dać do Sali albo Filmu, ale to jest złe, bo to czy miejsce jest zajęte zależy od konkretnego seansu.
3. Pomijam np. aktorów, zwiastuny, pracowników kina, sprzedaż jedzenia.
4. Nie są potrzebne do sprzedaży biletów, a o to chodzi w tym systemie.

## Zadanie 8

- wypożyczalnia: numer rejestracyjny, marka, model, cena za dobę, przebieg, czy jest dostępny, data przeglądu
- gra wyścigowa: model, prędkość maksymalna, przyspieszenie, aktualna prędkość, pozycja, uszkodzenia
- warsztat: VIN, numer rejestracyjny, marka, model, rocznik, silnik, przebieg, właściciel, historia napraw

Nie ma jednej poprawnej klasy Samochod, bo każdy program potrzebuje innych informacji. W klasie trzymamy tylko to co jest potrzebne w danym programie, np. VIN w warsztacie jest ważny, a w grze do niczego.
