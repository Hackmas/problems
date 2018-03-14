# DNA
I denne oppgaven skal du finne ut om en DNA sekvens innholder en annen DNA sekvens. En gyldig DNA sekvens består bare av bokstavene 'A', 'E', 'C' eller 'G', i vilkårlig rekkefølge.

## Input
Som input får du først et heltall mellom 1 og 1000 etterfulgt av en rekke med bokstaver, en på hver linje. Heltallet sier hvor mange bokstaver som følger. Dette er sekvensen du skal søke etter. Etter den første sekvensen kommer det en til sekvens, med samme format. Dette er sekvensen du skal søke i. Det er garantert at den første sekvensen er kortere enn den andre.

## Output
### Hvis sekvensen forekommer
Hvis den første sekvensen forekommer i den andre sekvensen skal du printe ut hvor i sekvensen den forekommer (0 indeksert). Hvis sekvensen forekommer mer enn en gang, skal du printe ut hver gang den forekommer, i rekkefølgen den forekommer.

### Hvis sekvensen er ugyldig
Hvis sekvensen inneholder et tegn som ikke er 'A', 'E', 'C' eller 'G', skal du printe ut 'INVALID' i store bokstaver.

### Hvis sekvensen ikke forekommer
Hvis sekvensene er gyldig, men den første sekvensen ikke forekommer i den andre sekvensen, skal du printe ut 'NO MATCH' i store bokstaver.

## Eksempel
### Eksempel 1
Gitt input
```
2
A
E
10
A
E
C
G
A
E
C
G
G
E
```
skal programmet printe ut
```
0
7
```
siden sekvensen inneholder programmet søker i forekommer på indeks 0 og 7.

### Eksempel 2
Gitt input
```
4
G
E
A
C
5
A
C
A
B
E
```
skal programmet printe ut
```
INVALID
```
siden 'B' ikke er en gyldig bokstav.

### Eksempel 3
Gitt input
```
5
C
E
C
G
A
6
E
A
C
E
A
C
```
skal programmet printe ut
```
NO MATCH
```
siden sekvensen programmet søker etter ikke forekommer.
