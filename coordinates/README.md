# Finn korsteste og lengste distanse mellom punkter i koordinatsystem
I denne oppgaven får du et sett med koordinater. Målet ditt er å finne distansen mellom de to punktene som ligger lengst fra hverandre i koordinatsystemet, og distansen mellom de to punktene som ligger kortest fra hverandre i koordinatsystemet. 

## Input
Første linje for inputfilen er et heltall som forteller hvor mange koordinater filen inneholder. Hver etterfølgende linje er et koordinat bestående av to heltall separert med mellomrom, hvor det første tallet er x-aksen og det andre tallet er y-aksen.

## Output
Programmet skal printe ut to linjer med et heltall på hver linje. Første linje skal være distansen mellom de to punktene i koordinatsystemet som ligger lengst fra hverandre, og andre linje skal være distansen mellom de to punktene i koordinatsystemet som ligger nærmest hverandre. **Begge tallene skal printes uten desimaler (dvs rundet ned til nærmeste heltall).**

## Eksempel
Gitt punktene { {1, 1}, {2, 1}, {-1, -3}, {2, 4}, {0, 0} }, kommer input filen til å se ut slik som dette: 
```
5
1 1
2 1
-1 -3
2 4
0 0
```
Punkt {-1, -3} og {2, 4} ligger lengst fra hverandre og har har en distanse på ca 7.62. Punkt {1, 1} og {2, 1} ligger nærmest hverandre og har en distanse på 1.0. Outputtet skal derfor være
```
7
1
```