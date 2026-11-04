# Lab 4

## Zadanie 1

1. firstName jest private, więc jest dostępne tylko w klasie Person. Employee ma to pole, ale musi używać gettera.
2. lastName jest protected, więc podklasa ma do niego dostęp.
3. Nie. Przy protected każda podklasa może zmienić pole jak chce i ominąć walidację. Lepiej zostawić private i dać metody.

## Zadanie 2

Person jest w pakiecie `people`, Employee i Auditor w `company`.

- w tej samej klasie - wszystko dostępne
- Neighbour (ten sam pakiet) - package-private, protected, public
- Employee (inny pakiet, dziedziczy) - protected i public
- Auditor (inny pakiet, nie dziedziczy) - tylko public

Auditor nie ma dostępu do protected, mimo że jest w tym samym pakiecie co Employee, bo nie dziedziczy po Person.

## Zadanie 4

Kolejność: A, B, C. Każdy konstruktor najpierw wywołuje `super()`, więc najpierw tworzy się część z A.

## Zadanie 8

`getClass()` zwraca `class zadanie08.Book`. Bez `toString()` wypisałoby coś typu `zadanie08.Book@1b6d3586`.

## Zadanie 9

Nadpisanie metody final:
```
error: initialize() in RPG cannot override initialize() in Game
  overridden method is final
```
Dziedziczenie po klasie final:
```
error: cannot inherit from final Settings
```

## Zadanie 10

Kompiluje się. Przy nadpisywaniu metoda może zwracać podtyp, a Report jest podtypem Document.

## Zadanie 11

1. Person nie ma konstruktora bez argumentów, więc w Student trzeba wywołać `super(name)`.
2. name jest private w Person, trzeba użyć `getName()`.
3. `showInformations` to literówka, przez to jest to nowa metoda a nie nadpisanie.
4. Z `@Override` kompilator od razu by pokazał ten błąd.

## Zadanie 12

Wybrałem pracowników: Employee, Developer, Manager, Tester.

To są relacje IS-A, bo programista, kierownik i tester to są pracownicy. Mają wszystko co ma pracownik (imię, pensja, staż), tylko inaczej pracują i inaczej liczą premię.

## Zadanie dodatkowe

- Car extends Engine - źle, samochód ma silnik, a nie jest silnikiem
- Dog extends Animal - dobrze
- Library extends Book - źle, biblioteka ma książki
- Manager extends Employee - dobrze
- House extends Address - źle, dom ma adres
- ElectricCar extends Car - dobrze

W złych przypadkach lepsza jest relacja "ma" (kompozycja).
