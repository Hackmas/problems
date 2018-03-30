# DNA
I denne oppgaven skal du prøve deg på bioinformatikk, et felt innenfor informatikk hvor man bruker teknologi for å forstå genetisk materiale. DNA er den viktigste kjemiske bestanddelen i arvematerialet til levende organismer, og er det som bestemmer hvilke genetiske egenskaper en organisme får. Man kan til en viss grad se på DNA som "kokeboken" til en organisme. 

Ved hjelp av DNA-sekvensering kan man finne ut hvordan DNAen til en organisme er bygget opp. Oppgaven din er å finne ut om DNA sekvens inneholder et gen. En DNA-sekvens er kodet med 4 forskjellige nukleotider: Adenin, Cytosin, Guanin og Tymin. Disse blir ofte representert med bokstavene A, C, G, og T. Et gen er en sekvens med nukleotider som har en spesiel funskjon, som for eksempel øyefarge eller hårfarge. Dette er selvfølgelig en forenkling av hvordan DNA fungerer, men gir en ide om hvordan det henger sammen.

Oppgaven din er å lete gjennom en DNA-sekvens og se om sekvensen inneholder et bestemt gen.

## Input
Som input får du først et heltall mellom 1 og 1000 etterfulgt av en rekke med bokstaver, en på hver linje. Heltallet sier hvor mange bokstaver som følger. Dette er genet du skal søke etter. Etter den første sekvensen kommer det en til sekvens, med samme format. Dette er DNA-sekvensen du skal søke i. Det er garantert at DNA-sekvensen er kortere enn den gensekvensen du skal søke etter.

## Output
### Hvis genet forekommer
Hvis den genet forekommer i DNA-sekvensen skal du printe ut hvor i DNA-sekvensen det forekommer (0 indeksert). Hvis genet forekommer mer enn en gang, skal du printe ut hver gang det forekommer, i rekkefølgen det forekommer.

### Hvis genet er ugyldig
Hvis enten genet du søker etter eller DNA-sekvensen du søker i inneholder et tegn som ikke er 'A', 'T', 'C' eller 'G', skal du printe ut 'INVALID' i store bokstaver.

### Hvis genet ikke forekommer
Hvis sekvensene er gyldig, men den genet ikke forekommer i den DNA-sekvensen, skal du printe ut 'NO MATCH' i store bokstaver.

## Eksempel
### Eksempel 1
Gitt input
```
2
A
T
10
A
T
C
G
A
T
C
G
G
T
```
skal programmet printe ut
```
0
4
```
siden genet forekommer i DNA-sekvensen på indeks 0 og 4.

### Eksempel 2
Gitt input
```
4
G
T
A
C
5
A
C
A
B
T
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
T
C
G
A
6
T
A
C
T
A
C
```
skal programmet printe ut
```
NO MATCH
```
siden genet ikke forekommer i DNA-sekvensen.
