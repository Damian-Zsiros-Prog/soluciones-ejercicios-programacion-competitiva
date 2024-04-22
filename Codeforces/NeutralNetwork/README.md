# Problema B: Neural Network

Encontrarás este problema en Codeforces Gym bajo el nombre "Neural Network".

Una Red Neuronal es una técnica de Aprendizaje Automático potente que está inspirada en el cerebro humano. Una Red Neuronal consta de varias capas de nodos donde la información se pasa a través de aristas que conectan los nodos.

Más específicamente, Akash está trabajando con una Red Neuronal con n capas, donde la i-ésima capa tiene ai nodos. Para cada par de capas adyacentes, hay una arista que conecta todos los pares de nodos entre una capa y la otra. En otras palabras, si dos capas tienen x e y nodos, respectivamente, entonces un total de x⋅y aristas conectarán esas capas.

Dada la estructura de su Red Neuronal, encuentra el número total de aristas necesarias para conectar cada par de capas adyacentes.

**Entrada**
La primera línea de la entrada contendrá n (1≤n≤1000), el número de capas en la Red Neuronal.

La siguiente línea contendrá los n enteros a1…an (1≤ai≤1000) representando el número de nodos en cada capa.

**Salida**
Imprime un solo entero, el número total de aristas necesarias.
**Ejemplo**
```markdown
4
3 5 2 7
39
```

**Nota**
En el caso de prueba de ejemplo, se necesitan un total de 39 aristas.

Para conectar las capas 1 y 2, se necesitan 3⋅5=15 aristas.
Para conectar las capas 2 y 3, se necesitan 5⋅2=10 aristas.
Para conectar las capas 3 y 4, se necesitan 2⋅7=14 aristas.
Por lo tanto, el número total de aristas necesarias es 15+10+14=39.
```

**Enlace al problema:**
[https://codeforces.com/gym/105123/problem/B](https://codeforces.com/gym/105123/problem/B)