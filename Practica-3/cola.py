class Cola:
    def __init__(self, n):
        self.n = n + 1  
        self.arreglo = [0] * self.n  
        self.inicio = 0  
        self.fin = 0     

    def insert(self, e):
        if self.isFull():
            print("Cola llena")
        else:
            self.fin = (self.fin + 1) % self.n  
            self.arreglo[self.fin] = e

    def remove(self):
        if self.isEmpty():
            print("Cola vacía")
            return -1  
        else:
            self.inicio = (self.inicio + 1) % self.n  
            dato = self.arreglo[self.inicio]
            if self.inicio == self.fin:
                self.inicio = 0
                self.fin = 0
            return dato

    def peek(self):
        if self.isEmpty():
            print("Cola vacía")
            return -1  
        return self.arreglo[(self.inicio + 1) % self.n]  

    def isEmpty(self):
        return self.inicio == self.fin  

    def isFull(self):
        return (self.fin + 1) % self.n == self.inicio  

    def size(self):
        if self.fin >= self.inicio:
            return self.fin - self.inicio
        else:
            return self.n - (self.inicio - self.fin)




colaA = Cola(10)
colaA.insert(22)
colaA.insert(5)
colaA.insert(10)
colaA.insert(11)


colaB = Cola(10)
colaC = Cola(10)


maximo = 0
tamanioOriginal = colaA.size()
for i in range(tamanioOriginal):
    elemento = colaA.remove()
    if elemento > maximo:
        maximo = elemento
    colaA.insert(elemento)  


es_primo = [True] * (maximo + 1)  
es_primo[0] = es_primo[1] = False  

for i in range(2, int(maximo**0.5) + 1):
    if es_primo[i]:
        for j in range(i * i, maximo + 1, i):
            es_primo[j] = False  


for i in range(tamanioOriginal):
    elemento = colaA.remove()
    if es_primo[elemento]:
        colaB.insert(elemento)  
    else:
        colaC.insert(elemento) 
    colaA.insert(elemento)  


print("Elementos en colaB (primos):")
tamanioColaB = colaB.size()
for i in range(tamanioColaB):
    print(colaB.remove(), end=" ")
print()


print("Elementos en colaC (no primos):")
tamanioColaC = colaC.size()
for i in range(tamanioColaC):
    print(colaC.remove(), end=" ")
print()
