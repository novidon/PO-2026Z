# Lab 5

Klasy zwierząt są w pakiecie `zoo`, bo używa ich kilka zadań.

## Zadanie 1

1. Animal
2. Dog
3. z klasy Dog
4. Nie, kompilator patrzy na typ referencji (Animal), a tam nie ma `digHole()`.

## Zadanie 3

Nie trzeba trzech metod, bo Dog, Cat i Cow to są Animal, a `makeSound()` i tak wywoła się z właściwej klasy.

## Zadanie 4

Dodałem klasę Administrator i pętli nie trzeba było zmieniać.

## Zadanie 5

Przez `dog` można wywołać metody Animal i Dog, przez `animal` tylko metody z Animal. Po zmianie imienia przez animal, dog też ma nowe imię.

Upcasting nie tworzy nowego obiektu, to dalej ten sam obiekt, zmienia się tylko typ referencji.

## Zadanie 6

`(Dog) second` gdzie second to Cat daje `ClassCastException`.

## Zadanie 8

Wystarczy `animal.makeSound()`. Taka wersja działa też dla nowych klas, np. Sheep, a stara wersja by ją po prostu pominęła. Nie trzeba nic zmieniać przy dodawaniu nowego zwierzęcia.

## Zadanie 9

Wypisze `Parent` i `Child`. Pola nie są polimorficzne, pole wybiera się po typie referencji. Metoda wybiera się po typie obiektu.

## Zadanie 10

1. `identify(Animal)`, bo kompilator patrzy na typ zmiennej
2. `makeSound()` z Dog, bo JVM patrzy na prawdziwy obiekt
3. Przeciążenie wybiera kompilator przy kompilacji, a nadpisaną metodę JVM w czasie działania.

## Zadanie 11

true, true, true, false, false, true

instanceof sprawdza czy obiekt jest danego typu albo podtypu, a getClass() porównuje dokładną klasę.

## Zadanie 13

Słabość: można stworzyć zwykły `new Shape()`, który ma pole 0, i podklasa może zapomnieć nadpisać `area()`. Na następnym labie poprawi się to klasą abstrakcyjną.

## Zadanie dodatkowe

1. Do Employee trzeba było przenieść liczenie pensji jako jedną metodę `calculateSalary()`, zamiast osobnych metod w każdej klasie.
2. Nowa klasa tylko nadpisuje `calculateSalary()` i pętla dalej działa.
3. instanceof ma sens jak potrzebujemy czegoś co ma tylko jeden typ, np. `digHole()` tylko u psa, albo w `equals()`.
