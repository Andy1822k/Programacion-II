import matplotlib.pyplot as plt

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f"({self.x},{self.y})"

class Linea:
    def __init__(self, p1:Punto, p2:Punto):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea de {self.p1} a {self.p2}"
    
    def dibujaLinea(self):
        x = [self.p1.x, self.p2.x]
        y = [self.p1.y, self.p2.y]
        plt.plot(x, y, marker='o', linestyle='-')
        plt.show()
        

class Circulo:
    def __init__(self, centro:Punto, radio):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Circulo con centro {self.centro} y radio {self.radio}"
    
    def dibujaCirculo(self):
        centro = (self.centro.x, self.centro.y)
        radio = self.radio
        
        fig, ax = plt.subplots()
        
        circulo = plt.Circle(centro, radio, color='b', fill=False)
        
        # Agregar el círculo al gráfico
        ax.add_patch(circulo)

        # Configurar límites del gráfico
        ax.set_xlim(centro[0] - radio - 1, centro[0] + radio + 1)
        ax.set_ylim(centro[1] - radio - 1, centro[1] + radio + 1)

        # Mostrar ejes en la misma escala
        ax.set_aspect('equal')

        # Mostrar el gráfico
        plt.show()

p1 = Punto(0,0)
p2 = Punto(5,5)
linea = Linea(p1, p2)

print(linea)
linea.dibujaLinea()

p = Punto(5,5)
circulo = Circulo(p, 5)
print(circulo)
circulo.dibujaCirculo()
  
