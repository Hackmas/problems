# Calculate inverse of 2x2 matrix

tasktext:
```
Finn den inverse av  ~n \cross n~ matrisen ~A~. Definisjonen er ~B=A^{-1}~ og oppfyller:.

~AB=I~

Der

~I=
\begin{bmatrix}
    1      & 0     & \dots  & 0 \\
    0      & 1     & \dots  & 0 \\
    \dots  & \dots & \ddots & \vdots  \\
    0      & 0     & \dots  & 1
\end{bmatrix}~

og

~A=
\begin{bmatrix}
    a       & b\\
    c       & d
\end{bmatrix}~
```

init.yml
```
archive: inverse.zip
test_cases:
- {in: inverse.1.in, out: inverse.1.out, points: 20}
- {in: inverse.2.in, out: inverse.2.out, points: 75}
- {in: inverse.3.in, out: inverse.3.out, points: 150}
```
