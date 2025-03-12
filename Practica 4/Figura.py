import math

class FiguraGeometrica:
    
    def area(self, *args):
        if len(args) == 1:  # Círculo (radio)
            return math.pi * args[0] ** 2
        elif len(args) == 2:
            if isinstance(args[1], str):  # Pentágono (lado, figura)
                lado, figura = args
                if figura.lower() == "pentagono":
                    return (5.0 * lado * lado) / (4 * math.tan(math.pi / 5))
            else:  # Rectángulo (base, altura)
                return args[0] * args[1]
        elif len(args) == 3:  # Triángulo rectángulo (base, altura, figura)
            base, altura, figura = args
            if figura.lower() == "triangulo":
                return (base * altura) / 2
        elif len(args) == 4:  # Trapecio (base mayor, base menor, altura, figura)
            baseMayor, baseMenor, altura, figura = args
            if figura.lower() == "trapecio":
                return ((baseMayor + baseMenor) * altura) / 2
        else:
            raise ValueError("Número de argumentos inválido")


f1 = FiguraGeometrica()
f2 = FiguraGeometrica()
f3 = FiguraGeometrica()
f4 = FiguraGeometrica()
f5 = FiguraGeometrica()
figura = FiguraGeometrica()

print("Círculo:", f1.area(5))  # Radio
print("Rectángulo:", f2.area(4, 6))  # Base y altura
print("Triángulo Rectángulo:", figura.area(3, 4, "triangulo"))  # Base y altura
print("Trapecio:", figura.area(3, 5, 4, "trapecio"))  # Base Mayor, Base Menor, Altura
print("Pentágono Regular:", figura.area(2, "pentagono"))  # Lado
