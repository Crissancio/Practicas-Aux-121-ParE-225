class Celular:
    def __init__(self, nro_tel, dueno, espacio_gb, ram_gb, nro_app):
        self.nro_tel = nro_tel
        self.dueno = dueno
        self.espacio_gb = espacio_gb
        self.ram_gb = ram_gb
        self.nro_app = nro_app

    def __iadd__(self, other):
        if isinstance(other, int):
            self.nro_app += 10
        return self

    def __isub__(self, other):
        if isinstance(other, int):
            self.espacio_gb = max(0, self.espacio_gb - 5)
        return self

    def __str__(self):
        return f"Celular({self.nro_tel}, {self.dueno}, espacio={self.espacio_gb}GB, RAM={self.ram_gb}GB, apps={self.nro_app})"

c = Celular("7654321", "Ana", 64, 8, 12)
print("Antes:", c)

c += 1   
c -= 1   

print("Después:", c)
