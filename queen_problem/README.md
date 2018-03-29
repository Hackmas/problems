# Queen placement


I denne oppgaven skal du gjøre ett underproblem av the "Eight queens puzzle".

Vi har allerede plassert ut noen dronninger, målet ditt er å plasserer resten. 
Det vil si, plassere ut resten så ingen dronninger kan "treffe" noen andre dronninger hvis man var til å flytte dem.

# Input

En linje med koordinater for dronningene som allerede har blitt plassert splittet med en space.

```b2 d6 e8 c4```

# Output
En streng på samme formatet om input der dronningene er sortert alfabetisk.
``` a5 b2 c4 d6 e8 f3 g1 h7 ```

Hvis det ikke er mulig å gjøre løse problemet pga feks to dronninger vi har plassert truer hverandre eller bskal man returnere ":(" 

# Restriksjoner

Minst en brikke er alltid plassert ut. Det er ikke mulig å ha flere brikker i samme rute
Dette er ett normalt sjakkbrett, altså et 8x8 merket fra 1 til 8 og A til H.
Brikker vi har satt ut kan være ugyldige, de dere skal sette ut skal kun være gyldige.