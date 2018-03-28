I denne oppgaven skal du få leke litt med sorteringsalgoritmer.
Sorteringsmetoden vi skal bruke skal være InsertionSort(InnstikkSortering).
Målet til programmet skal være å sortere de største 20 tallene i et array fremst i
arrayet(dvs fra plass 0 - 19).
For å oppnå dette må du først sortere de 20 første plassene i synkende rekkefølge,
deretter se igjennom resten av lista etter større verdier som skal sorteres inn i
den første delen. Operasjonen skal være tapsfri(alle verdier som er i arrayet til å
begynne med skal være med når sorteringen er ferdig).
Merk at resten av arrayet ikke skal være sortert. Vi er kun interressert i å flytte
de største tallene frem til starten.
Filen du får som input har ett tall per linje hvor det første tallet er lengden på arrayet.
Til slutt skal du printe alle verdiene til teminalen, ett tall per linje.
Eksempelfil vises nedenfor, med output om oppgaven er gjort rett.
Eksempel 1:
INPUT:
26
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
25
26
OUTPUT:
26
25
24
23
22
21
20
19
18
17
16
15
14
13
12
11
10
9
8
7
1
2
3
4
5
6
