# Lab 2

## Zadanie 5

Po zmianie kopii oryginał się nie zmienia, bo konstruktor kopiujący tworzy nowy obiekt i tylko przepisuje do niego wartości pól.

## Zadanie 6

1. Powstał jeden obiekt (jest tylko jedno `new`).
2. Są dwie referencje: first i second.
3. `second = first` kopiuje tylko referencję, więc obie zmienne pokazują na ten sam obiekt i zmiana przez second jest widoczna przez first.

## Zadanie 7

Przy `second = first` mamy ten sam obiekt, więc po zmianie imienia obie zmienne pokazują "Maria". Przy `new Person(first)` powstaje nowy obiekt, więc zmiana imienia w second nie zmienia first (zostaje "Anna").

## Zadanie 8

Do metody przekazywana jest kopia referencji, ale wskazuje ona na ten sam obiekt co zmienna w main. Dlatego metoda może zmienić jego pola.

## Zadanie 9

Poleci `NullPointerException`, bo car nie wskazuje na żaden obiekt. Zabezpieczenie: `if (car != null)`.

## Zadanie 10

Wynik:
```
20
20
30
true
false
```

```
a ---\
      ---> Box(20)
b ---/

c -------> Box(30)
```

a i b to ten sam obiekt, c to osobny obiekt, do którego tylko skopiowano wartość 10.

## Zadanie 11

1. `public void Product(...)` ma typ zwracany void, więc to jest zwykła metoda a nie konstruktor. Klasa ma wtedy tylko konstruktor bez argumentów i `new Product("Monitor", 1200)` się nie kompiluje.
2. Trzeba usunąć `void`.
3. `name = name` przypisuje parametr sam do siebie, trzeba `this.name = name` (tak samo price).
4. `this` oznacza aktualny obiekt, `this.name` to pole, a samo `name` to parametr.

## Zadanie dodatkowe

Po `first.scale(2)` first i sameObject mają 4 x 6, bo to ten sam obiekt. copy ma dalej 2 x 3, bo został utworzony konstruktorem kopiującym jako osobny obiekt.
