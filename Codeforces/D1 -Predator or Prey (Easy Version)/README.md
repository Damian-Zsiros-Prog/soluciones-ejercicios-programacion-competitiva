# Problema D1: Predator or Prey (Easy Version)

Este es la versión fácil del problema. La única diferencia entre las versiones fácil y difícil es la restricción en n. Las soluciones que pasan bajo el límite de tiempo para la versión fácil pueden no pasar la versión difícil.

Sritan ha estado investigando las relaciones de depredación del ecosistema TJ. Ha descubierto que el animal i puede tener un factor depredador de pi, que es un entero positivo.

Aprende que los animales se alimentarán de otros animales basándose en sus factores depredadores relativos. Un animal i se alimentará de un animal j si la diferencia entre pi y pj es al menos a. Sin embargo, si esta diferencia es de b o más, el animal i considera al animal j demasiado débil y no lo comerá.

Hay n animales en el ecosistema TJ. Para cada animal, encuentra el número de depredadores y presas que tiene.

**Entrada**
La primera línea de la entrada contiene tres enteros n, a, b (1≤n≤2⋅103, 1≤a<b≤109).

La segunda línea contiene los n enteros p1…pn (1≤pi≤109) que representan los factores depredadores de los animales.

**Salida**
Imprime n líneas. En la i-ésima línea, imprime 2 enteros correspondientes al número de depredadores y al número de presas que tiene el animal i.

**Ejemplo**
```
[inputCopy]
5 3 7
8 6 5 14 12
[outputCopy]
2 1
1 0
1 0
0 1
0 2
```

**Nota**
En el caso de prueba de ejemplo, el animal 1 tendrá 2 depredadores (animales 4 y 5) y 1 presa (animal 3). El animal 4 tiene solo una presa (animal 1) ya que los animales 2 y 3 son demasiado débiles para que lo coma.

**Enlace al problema:**
[https://codeforces.com/gym/105123/problem/D1](https://codeforces.com/gym/105123/problem/D1)