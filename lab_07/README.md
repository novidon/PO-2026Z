# Lab 7

## Zadanie 1

`Computer.Specifications` tworzę bez żadnego obiektu `Computer`, bo klasa jest `static`, czyli nie jest związana z konkretną instancją klasy zewnętrznej.

Odwołanie do `model` wewnątrz `Specifications` się nie kompiluje:

```
error: non-static variable model cannot be referenced from a static context
```

`model` należy do konkretnego komputera, a `Specifications` nie wie, o który komputer chodzi (nie ma `Computer.this`). Da się to obejść, przekazując referencję: `showModel(Computer computer)` czyta `computer.model`, i to działa nawet z prywatnym polem, bo klasa zagnieżdżona jest w środku klasy `Computer`.

## Zadanie 2

`Transaction` tworzę przez `anna.new Transaction(...)` i `piotr.new Transaction(...)`. Każda transakcja pamięta swoje konto, dlatego `print()` wypisuje właściwego właściciela, a `apply()` zmienia saldo tylko tego konta. `new BankAccount.Transaction(...)` się nie skompiluje, bo nie byłoby wiadomo, do którego konta należy transakcja.

## Zadanie 3

`this.name` to pole obiektu `Department` (`Dział IT`), a `Company.this.name` to pole firmy, do której ten dział należy (`Softline`). Oba pola nazywają się tak samo, więc samo `name` wskazywałoby na pole klasy wewnętrznej (zasłania pole zewnętrzne). Żeby dostać się do pola firmy, trzeba jawnie napisać `Company.this`.

## Zadanie 4

`ValidationResult` jest prywatna, więc kod spoza `PasswordValidator` nie może jej ani utworzyć, ani nawet użyć jako typu. Dlatego publiczne metody nie zwracają `ValidationResult`, tylko zwykłe typy:

- `boolean isValid(String password)`,
- `String getMessage(String password)`.

Użytkownik klasy nie musi wiedzieć, jak wynik jest przechowywany w środku. Gdybym potem zmienił `ValidationResult` (np. dodał listę wszystkich błędów), kod zewnętrzny by się nie zepsuł.

Klasa mogłaby też być `private static`, bo nie korzysta z pól walidatora, ale zadanie mówi o klasie wewnętrznej.

## Zadanie 5

`NameValidator` jest zadeklarowana wewnątrz `validateNames()` i poza tą metodą w ogóle nie istnieje. Ma sens tylko tutaj, więc nie zaśmieca klasy `Main`.

## Zadanie 6

Bez przypisania kod działa, bo `minimumLength` jest effectively final (po inicjalizacji nikt jej nie zmienia). Po dopisaniu `minimumLength = 10;` kompilator zgłasza:

```
error: local variables referenced from an inner class must be final or effectively final
```

Effectively final oznacza, że zmienna nie ma słowa `final`, ale zachowuje się jak stała: wartość jest przypisana tylko raz. Klasa lokalna dostaje kopię wartości zmiennej, a nie samą zmienną. Gdyby można ją było zmieniać, kopia i oryginał mogłyby się różnić, więc Java po prostu tego zabrania.

## Zadanie 7

Anonimowa podklasa `Validator` jest w `main`. Sprawdza `null`, szuka `@`, a potem kropki dopiero od pozycji za `@` (`indexOf('.', at + 1)`), więc `jan.kowalski@gmail` nie przechodzi, mimo że ma kropkę.

## Zadanie 8

`Button` zna tylko interfejs `ClickListener` i nie wie, co się stanie po kliknięciu. Obsługę przekazuję jako klasę anonimową, osobną dla każdego przycisku. Listener przycisku „Zapisz” korzysta z lokalnej zmiennej `fileName` (effectively final). Przycisk bez listenera wypisuje `brak obsługi kliknięcia`.

## Zadanie 9

Pole `counter` należy do obiektu klasy anonimowej, więc przeżywa między wywołaniami `execute()`. Wynik: `Wywołanie nr 1` … `Wywołanie nr 5`.

## Zadanie 10

Nie. Klasa anonimowa jest dobra do jednorazowego użycia, a tu ta sama logika jest w dwóch miejscach. Przy zmianie reguły trzeba by pamiętać o obu kopiach. Zrobiłem nazwaną klasę `NotBlankValidator`, z której korzystają `RegistrationForm` i `CommentForm`.

## Zadanie 11

Wynik:

```
A()
B()
B.show
```

1. Konstruktor `B` najpierw (niejawnie) wywołuje `super()`, więc najpierw wykonuje się `A()`, a dopiero potem reszta `B()`.
2. Referencja ma typ `A`, ale obiekt jest typu `B`. Metoda nadpisana wybierana jest w czasie działania programu według rzeczywistego typu obiektu (dynamic binding), więc wywoła się `B.show`.

## Zadanie 12

Brakujące elementy: `abstract`, `extends`, `super`, `@Override`.

## Zadanie 13

1. **Hermetyzacja**: `balance` jest `public`, więc każdy może ustawić dowolne saldo z zewnątrz, z pominięciem `deposit()`. Poprawka: `private` + getter.
2. **`static`**: `owner` jako `static` byłby wspólny dla wszystkich kont, więc ostatnio utworzone konto nadpisałoby właściciela wszystkim. `deposit()` jako `static` nie dotyczy żadnego konkretnego konta. Oba mają być zwykłymi składowymi instancji.
3. **`this`**: `owner = owner;` i `balance = balance;` przypisują parametr do samego siebie, bo parametr zasłania pole. Pola zostają z wartościami domyślnymi. Trzeba `this.owner = owner;`.
4. **Kompilacja**: metoda statyczna nie ma dostępu do pola instancji:
   ```
   error: non-static variable balance cannot be referenced from a static context
   ```
5. Poprawiona wersja jest w `zadanie13/Account.java`: pola prywatne, `owner` jako `final`, walidacja w konstruktorze i w `deposit()`.

## Zadanie 14

Dwa niezależne powody:

1. `Person` ma tylko konstruktor `Person(String name)`, a konstruktor `Student` nie wywołuje `super(...)`, więc kompilator wstawia `super()`, którego nie ma:
   ```
   error: constructor Person in class Person cannot be applied to given types;
   ```
   Poprawka: `Student(String name, int albumNumber)` z `super(name)`.
2. `identify()` jest `final`, więc nie można jej nadpisać:
   ```
   error: identify() in Student cannot override identify() in Person
   ```
   Poprawka: usunąć `final` z `Person.identify()`. Jeśli `final` ma zostać celowo, to Student powinien mieć metodę o innej nazwie.

## Zadanie 15

W klasie bazowej jest to, co wspólne: imię i abstrakcyjna `calculateSalary()`. Każda podklasa liczy pensję po swojemu, a dane potrzebne do obliczeń (`salary`, `baseSalary`, `bonus`) trzyma u siebie.

`Employee` jest abstrakcyjna, bo nie ma sensownej „domyślnej” pensji. Zwykła klasa z `return 0` pozwalałaby tworzyć pracownika, który nic nie zarabia, a podklasa mogłaby zapomnieć nadpisać metodę. Przy klasie abstrakcyjnej kompilator tego pilnuje. Przy nowym typie pracownika `calculate()` się nie zmienia.

## Zadanie 16

1. **Klasa abstrakcyjna `Notification`**: wszystkie powiadomienia mają wspólny stan (`recipient`, `createdAt`), wspólną walidację w konstruktorze i są w relacji IS-A (e-mail *jest* powiadomieniem). `send()` jest abstrakcyjne, bo każdy kanał wysyła inaczej.
2. **Interfejs `Loggable`**: to zdolność, a nie „rodzaj obiektu”. Mogą ją mieć niezwiązane klasy (powiadomienia, `Payment`), które i tak dziedziczą już po czymś innym albo nie mają wspólnego stanu.
3. Klasa może dziedziczyć tylko po jednej klasie, ale implementować wiele interfejsów. Gdyby `Loggable` było klasą, `Payment` musiałby dziedziczyć po czymś, z czym nie ma nic wspólnego, a powiadomienia nie mogłyby dziedziczyć jednocześnie po `Notification` i `Loggable`.

## Zadanie 17

| Relacja | Ocena | Poprawka |
|---|---|---|
| `Car extends Engine` | źle | Car HAS-A Engine, kompozycja: pole `private final Engine engine` |
| `Manager extends Employee` | dobrze | Manager IS-A Employee |
| `Order extends PaymentMethod` | źle | Order USES-A PaymentMethod, pole typu interfejsu `PaymentMethod`, które można podmienić (asocjacja) |
| `Dog extends Animal` | dobrze | Dog IS-A Animal |
| `Computer extends Processor` | źle | Computer HAS-A Processor, agregacja: pole `Processor processor`, przekazywane w konstruktorze |

Przy złym dziedziczeniu klasa przejmuje cały publiczny interfejs rodzica (samochód miałby np. `getRpm()` jako swoją metodę) i zużywa jedyne miejsce na `extends`.

## Zadanie 18

```
 a ──┐
     ├──> [Box value=20]
 b ──┘

 c ─────> [Box value=30]
```

`b = a` kopiuje referencję, a nie obiekt, więc `a` i `b` wskazują na ten sam obiekt. `c` to nowy obiekt, który na starcie dostał tylko kopię liczby 10.

Wynik:

```
20
20
30
true
false
```

`==` na obiektach porównuje referencje, a nie zawartość.

## Zadanie 19

Wynik:

```
show Animal
Dog
```

- `show(animal)`: wybór przeciążonej metody robi **kompilator**, patrząc na typ referencji (`Animal`), a nie na obiekt. Dlatego wywoła się `show(Animal)`.
- `animal.sound()`: metoda nadpisana podlega **dynamicznemu wiązaniu**, czyli w czasie działania liczy się prawdziwy typ obiektu (`Dog`).

## Zadanie 20

- `LibraryItem`: klasa abstrakcyjna z prywatnymi `id` i `title`, walidacją w konstruktorze, abstrakcyjną `getLoanDays()`, `getInformation()` i `toString()` z `getClass().getSimpleName()`. Licznik `numberOfItems` rośnie dopiero po walidacji, więc obiekt odrzucony przez wyjątek się nie liczy (widać to w `Main`).
- `Book` (autor, 30 dni), `Magazine` (numer wydania, 7 dni), `BoardGame` (maks. graczy, 14 dni). Liczba dni to stała `static final` w każdej klasie.
- `Reservable` implementują tylko `Book` i `BoardGame`. Czasopisma nie da się zarezerwować.
- `Library` ma listę elementów (kompozycja/agregacja, a nie dziedziczenie). `printLoanInformation()` woła `getLoanDays()` polimorficznie, bez `instanceof`.
- W `Main` jedna pętla wypisuje każdy element i informację o wypożyczeniu, potem licznik, a na końcu anonimowa implementacja `Reservable` (sala do nauki) z własnym polem `reserved`.
