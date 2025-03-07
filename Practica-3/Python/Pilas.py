class Pila:
    def __init__(self, n):
        self.arreglo = [None] * n  
        self.top = -1  
        self.n = n  

    def push(self, e):
        if self.isFull():
            print("La pila está llena. No se puede insertar", e)
            return 
        self.top += 1
        self.arreglo[self.top] = e

    def pop(self):
        if self.isEmpty():
            print("La pila está vacía. No se puede eliminar ningún elemento.")
            return None  
        elemento = self.arreglo[self.top]
        self.top -= 1
        return elemento

    def peek(self):
        if self.isEmpty():
            print("La pila está vacía. No hay elementos para ver.")
            return None  
        return self.arreglo[self.top]

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1


pila_A = Pila(10)  
pila_B = Pila(10)  
pila_C = Pila(10)  


datos = [13, 22, 7]
for dato in datos:
    pila_A.push(dato)

print("Datos insertados en la pila A: ")
tempPila = Pila(10)

while not pila_A.isEmpty():
    elemento = pila_A.pop()
    print(elemento)
    tempPila.push(elemento)

while not tempPila.isEmpty():
    pila_A.push(tempPila.pop())

while not pila_A.isEmpty():
    elemento = pila_A.pop()
    if elemento % 2 == 0:
        pila_B.push(elemento) 
    else:
        pila_C.push(elemento)  


print("Elementos en la pila B (pares):")
while not pila_B.isEmpty():
    print(pila_B.pop(), end=" ")
print()

print("Elementos en la pila C (impares):")
while not pila_C.isEmpty():
    print(pila_C.pop(), end=" ")
print()
