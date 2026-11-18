# Programowanie Obiektowe – Java (2026Z)

Repozytorium z rozwiązaniami zadań laboratoryjnych.

| Folder | Temat |
|---|---|
| `lab_01/` | Środowisko Java i modelowanie obiektowe |
| `lab_02/` | Klasy i obiekty |
| `lab_03/` | Hermetyzacja, składowe statyczne i przeciążanie metod |
| `lab_04/` | Dziedziczenie |
| `lab_05/` | Polimorfizm |
| `lab_06/` | Klasy abstrakcyjne, interfejsy i kompozycja |

Każde laboratorium ma katalog `src/` z osobnym pakietem dla każdego zadania (`zadanie01`, `zadanie02`, …, `dodatkowe`) oraz plik `README.md` z odpowiedziami na pytania teoretyczne.

Kompilacja i uruchomienie (Java 17+, z katalogu danego laboratorium).

Bash (Linux, macOS, Git Bash):

```bash
javac -encoding UTF-8 -d out $(find src -name '*.java')
java -cp out zadanie01.Main
```

PowerShell (Windows):

```powershell
javac -encoding UTF-8 -d out (Get-ChildItem src -Recurse -Filter *.java).FullName
java -cp out zadanie01.Main
```
