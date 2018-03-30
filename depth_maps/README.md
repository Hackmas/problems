# Cavity Map

I denne oppgaven får man utdelt en matrise av heltall. Hver celle i matrisen har en verdi som sier noe om _dybden_ til ruten.

Målet med denne oppgaven er å finne _groper_ i kartet man har fått tilsendt. Ett punkt er definert som en grop hvis alle punkter rundt er høyere enn en selv. En grop kan ikke finnes langs en kant da den ikke har naboer i alle retninger.

## Input
Første linje sier hvor mange linjer som følger, og hvor mange tegn det er per linje

```
3
989
191
111
```

## Output
```
989
1X1
111
```


## Restriksjoner / Spesifiseringer

Matrisen kommer alltid i formen **N** x **N**.

1 < **N** < 100 