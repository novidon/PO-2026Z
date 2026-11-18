# Lab 6

## Zadanie 1

`new Shape()` teraz się nie skompiluje (`Shape is abstract; cannot be instantiated`), a każda podklasa musi zaimplementować `area()`. To poprawia obie słabości z Lab 5.

## Zadanie 2

Kolejność: najpierw `Konstruktor Shape`, potem `Konstruktor Circle`. Klasa abstrakcyjna nie może mieć obiektów, ale ma konstruktor, bo podklasa wywołuje go przez `super(name)`. Pole `name` jest prywatne, więc podklasy używają gettera.

## Zadanie 3

Developer dostaje podstawę + premię projektową, Manager podstawę + 500 zł za każdą osobę w zespole, Salesperson podstawę + prowizję od sprzedaży. `printPayslip()` jest napisane raz w Employee i woła `calculateSalary()` z właściwej klasy.

## Zadanie 5

Przez `printable` jest dostępne tylko `print()`, przez `exportable` tylko `exportToCsv()`, a przez `savable` tylko `save()`. Kompilator patrzy na typ referencji. Obiekt dalej jest ten sam (`printable == savable` daje true).

## Zadanie 6

Report nie nadpisuje `printHeader()`, więc wypisuje `=== Dokument ===` z interfejsu. Invoice ma swoją wersję z numerem faktury.

## Zadanie 7

1. Bez nadpisania kompilator zgłasza:
   ```
   types A and B are incompatible;
   class C inherits unrelated defaults for hello() from types A and B
   ```
2. Trzeba nadpisać `hello()` w klasie C.
3. W środku można wywołać wersje z interfejsów przez `A.super.hello()` i `B.super.hello()`.

## Zadanie 8

`ReadWrite` rozszerza oba interfejsy i dodaje domyślne `append()`, które korzysta z `read()` i `write()`. `TextDocument` implementuje tylko `ReadWrite`, a i tak jest też `Readable` i `Writable`.

## Zadanie 9

Bird jest klasą abstrakcyjną ze wspólnym `eat()`, a latanie jest osobnym interfejsem `Flyable`, który mają tylko Eagle i Sparrow.

Stary projekt mówił, że każdy ptak lata, więc Penguin dziedziczył `fly()`, którego nie powinien mieć (trzeba by go nadpisać pustą metodą albo wyjątkiem). Teraz `Flyable penguin = new Penguin()` się nie skompiluje, czyli błąd wyłapie kompilator, a nie program w czasie działania.

## Zadanie 10

| Relacja | Odpowiedź | Dlaczego |
|---|---|---|
| Car – Engine | kompozycja | Car HAS-A Engine, silnik to część samochodu |
| Dog – Animal | dziedziczenie | Dog IS-A Animal |
| House – Address | kompozycja | House HAS-A Address, adres opisuje ten dom |
| Manager – Employee | dziedziczenie | Manager IS-A Employee (a lista podwładnych to już agregacja) |
| Computer – Processor | agregacja | Computer HAS-A Processor, procesor można wyjąć i włożyć do innego komputera |
| Student – University | asocjacja | Student USES-A University, oba istnieją niezależnie |
| Book – Author | asocjacja | Book USES-A Author, autor istnieje bez książki i ma wiele książek |
| Order – PaymentMethod | asocjacja/kompozycja zachowania | Order USES-A PaymentMethod, metodę płatności można podmienić |

## Zadanie 11

Bo samochód nie jest silnikiem ani skrzynią biegów, tylko je ma (HAS-A). Przy `extends Engine` Car miałby wszystkie publiczne metody silnika jako swoje, a do tego Java pozwala dziedziczyć tylko po jednej klasie, więc Gearbox i tak by się nie zmieścił.

## Zadanie 12

`OrderService` zna tylko interfejs `PaymentMethod`. W Main ten sam kod `checkout()` działa z kartą, BLIK i przelewem, a OrderService nie był zmieniany.

## Zadanie 13

1. Nie, raport nie jest bazą danych. ReportService tylko z niej korzysta.
2. Bo chodziło tylko o to, żeby mieć metodę `save()` bez pisania jej drugi raz. Przy okazji ReportService dostał publiczne `save()`, którego nie powinien mieć, i jest na stałe przywiązany do Database.
3. Teraz ReportService ma pole `Database` przekazywane w konstruktorze i woła `database.save()`.

## Zadanie 14

ReportService zależy od interfejsu `Storage`. Zmiana sposobu zapisu to tylko inny obiekt w konstruktorze, np. `new ReportService(new FileStorage("raport.txt"))`, a klasa ReportService zostaje bez zmian.

## Zadanie 15

| Przypadek | Wybór | Uzasadnienie |
|---|---|---|
| Shape | klasa abstrakcyjna | wspólny stan (nazwa), naturalne IS-A (koło to figura), częściowa implementacja `printInformation()` |
| Printable | interfejs | bez stanu, to zdolność, mogą ją mieć niezwiązane klasy (faktura, bilet, raport) |
| Employee | klasa abstrakcyjna | wspólny stan (imię, pensja), IS-A, wspólne `printPayslip()` |
| Comparable | interfejs | bez stanu, porównywać można liczby, napisy, daty, czyli zupełnie różne klasy |
| Vehicle | klasa abstrakcyjna | wspólny stan (marka, prędkość), IS-A (auto to pojazd), część kodu wspólna |
| Encryptable | interfejs | zdolność bez stanu, mogą ją mieć plik, wiadomość, hasło |
| NotificationSender | interfejs | sam kontrakt `send()`, każda implementacja wysyła inaczej, nie ma wspólnego stanu |
| Account | klasa abstrakcyjna | wspólny stan (numer, saldo), IS-A (konto oszczędnościowe to konto), wspólne wpłaty i wypłaty |

## Zadanie dodatkowe

- klasa abstrakcyjna: `Notification` (recipient, message, abstrakcyjne `format()`), podklasy `ReminderNotification` i `AlertNotification`
- interfejs: `NotificationSender` z implementacjami `EmailSender`, `SmsSender`, `ConsoleSender`
- polimorfizm: `format()` i `send()` wywołują się z właściwej klasy
- kompozycja: `NotificationService` ma pole `NotificationSender` i przekazuje mu wysyłanie

Diagram:

```
                 NotificationService
                  |              |
          ma (HAS-A)          używa (USES-A)
                  |              |
                  v              v
   <<interface>>                 <<abstract>>
   NotificationSender            Notification
      ^    ^    ^                  ^       ^
      |    |    |                  |       |
  Email  Sms  Console        Reminder    Alert
  Sender Sender Sender      Notification Notification
```
