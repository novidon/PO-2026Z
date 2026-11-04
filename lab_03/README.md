# Lab 3

## Zadanie 2

Nie wszystkie pola muszą mieć setter. Email się zmienia, więc setter ma sens. Imię raczej rzadko, ale może być poprawione. Wiek lepiej byłoby liczyć z daty urodzenia, u mnie jest setter z walidacją i metoda `birthday()`.

## Zadanie 4

Bez kopii zmiana oryginalnej tablicy i zmiana tablicy z `getPoints()` zmieniają dane w obiekcie (`[-100, -200, 30]`), bo obiekt trzyma tę samą tablicę. Po dodaniu `Arrays.copyOf` w konstruktorze i getterze już nie.

## Zadanie 6

1. static - bo limit dotyczy wszystkich produktów razem, a nie jednego obiektu.
2. final - bo limit nie powinien się zmieniać w trakcie działania programu.
3. numberOfProducts nie może być final, bo zwiększa się przy każdym nowym produkcie.

## Zadanie 8

Dwie metody różniące się tylko typem zwracanym:
```
error: method getValue(int) is already defined in class Calc
```
Kompilator wybiera metodę po argumentach, więc nie wiedziałby której użyć.

## Zadanie 9

Przewidywana kolejność:
```
pole statyczne, blok statyczny        (raz)
pole instancji, blok instancyjny, konstruktor   (dla każdego obiektu)
```
Po uruchomieniu się zgadza. Dla drugiego obiektu część statyczna już się nie wykonuje.

## Zadanie 10

1. studentName - instancyjne, każdy student ma swoje imię
2. numberOfStudents - statyczne, jeden licznik dla całej klasy
3. PI - static final, stała wspólna dla wszystkich
4. balance - instancyjne, każde konto ma swoje saldo
5. calculateVat - statyczna, nie używa stanu obiektu
6. carMileage - instancyjne, przebieg konkretnego auta
7. MAX_LOGIN_ATTEMPTS - static final, stała reguła

## Zadanie 11

1. Błędy kompilacji: w statycznej metodzie `showUser()` są użyte pola `login` i `password`, które nie są statyczne (`non-static variable login cannot be referenced from a static context`).
2. Problemy: wszystkie pola public, `age` jest static więc wszyscy użytkownicy mają ten sam wiek, setter hasła bez żadnej walidacji, hasło wypisywane na ekran.
3. login, password, age - instancyjne. Statyczny może być licznik użytkowników i stałe.
4. Pola zrobione private, login final.
5. Hasło nie ma gettera, zamiast tego jest `checkPassword()` i `changePassword()` które wymaga starego hasła.
6. Wiek musi być od 13 do 150.
7. `showUser()` jest teraz metodą zwykłą (nie static) i zamiast hasła wypisuje gwiazdki.

## Zadanie 12

- Student.name - getter i setter z walidacją, bo imię można poprawić
- Student.albumNumber - tylko getter i final, numer albumu się nie zmienia
- Course.name, maxStudents - tylko gettery, ustawiane raz w konstruktorze
- Course.students - getter zwraca kopię tablicy, zapisywać można tylko przez `enroll()`
- Course.numberOfCreatedCourses - static, wspólny licznik
- stałe DEFAULT_MAX_STUDENTS, MAX_ALLOWED_STUDENTS, ALBUM_NUMBER_LENGTH - static final

Przeciążone są konstruktory i metoda `enroll()`.

## Zadanie dodatkowe

1. Nie, private chroni tylko samą zmienną, ale tablica jest wspólna z kodem na zewnątrz.
2. Zmieniając tablicę przekazaną do konstruktora (`people[0]`) albo tę zwróconą z `getMembers()`.
3. Poprawione kopiowaniem tablicy w konstruktorze i getterze (klasa Team).
4. Nie, String jest niemodyfikowalny, więc nie da się go zmienić przez referencję.
