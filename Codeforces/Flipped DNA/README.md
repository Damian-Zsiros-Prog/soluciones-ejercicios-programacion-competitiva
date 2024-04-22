
# Problema C: Flipped DNA

Encontrarás este problema en Codeforces Gym bajo el nombre "Flipped DNA".

El ADN de un organismo puede representarse mediante una cadena que consiste en los caracteres "A", "T", "C" y "G". Debido a la estructura del ADN, "A" se empareja con "T" y "C" se empareja con "G", y estos se llaman pares complementarios.

Daniel ha secuenciado un gen específico de un organismo y ha determinado que su ADN corresponde a la cadena X con longitud n. Quiere comparar esta cadena con el ADN objetivo Y, que también es una cadena de longitud n.

Daniel sabe que debido a las mutaciones, las cadenas X y Y pueden no ser iguales. Sin embargo, hipotetiza que el único tipo de mutación que X tiene es intercambiar pares complementarios. Por ejemplo, un carácter "G" en la posición i de Y puede haber mutado en un carácter "C" en esa misma ubicación, pero no en un carácter "A", ya que "A" y "G" no son complementarios.

Dadas las cadenas X e Y, ayuda a Daniel a determinar si su hipótesis es correcta.

**Entrada**
La primera línea contendrá un entero n (1≤n≤105) que representa la longitud de la secuencia de ADN.

La segunda línea contendrá la cadena X (|X|=n), el gen que Daniel ha secuenciado.

La tercera línea contendrá la cadena Y (|Y|=n), el gen objetivo que Daniel quiere comparar.

Se garantiza que tanto X como Y solo consisten en los caracteres "A", "T", "C" y "G".

**Salida**
Imprime "YES" (sin comillas) si la hipótesis de Daniel es correcta y las únicas mutaciones son intercambios de pares complementarios, y "NO" en caso contrario.

**Ejemplos**
```
[inputCopy]
8
GCAAGCCT
CCATCCCT
[outputCopy]
YES

[inputCopy]
10
CGTATGGACA
ATACTCACCA
[outputCopy]
NO
```

**Enlace al problema:**
[https://codeforces.com/gym/105123/problem/C](https://codeforces.com/gym/105123/problem/C)