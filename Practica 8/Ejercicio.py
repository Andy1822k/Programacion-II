class A:
    def __init__(self, x, z):
        self.x = x
        self.z = z
    
    def incrementaXZ(self):
        self.x += 1
        self.z += 1
    
    def incrementaZ(self):
        self.z += 1

class B:
    def __init__(self, y, z):
        self.y = y
        self.z = z
    
    def incrementaYZ(self):
        self.y += 1
        self.z += 1
    
    def incrementaZ(self):
        self.z += 1

class D(A, B):
    def __init__(self, x, y, z):
        A.__init__(self, x, z)
        B.__init__(self, y, z)
    
    def incrementaXYZ(self):
        self.x += 1
        self.y += 1
        self.z += 1

if __name__ == "__main__":
    
    a = A(1, 2)
    print("A inicial:", a.x, a.z)
    a.incrementaXZ()
    print("A después de incrementaXZ:", a.x, a.z)

    b = B(3, 4)
    print("\nB inicial:", b.y, b.z)
    b.incrementaYZ()
    print("B después de incrementaYZ:", b.y, b.z)

    d = D(5, 6, 7)
    print("\nD inicial:", d.x, d.y, d.z)
    d.incrementaXYZ()
    print("D después de incrementaXYZ:", d.x, d.y, d.z)
