class Fruta:
    def __init__(self, nombre, tipo, vitaminas):
        self.nombre = nombre
        self.tipo = tipo
        self.vitaminas = list(vitaminas)
    @classmethod
    def desde_cadena(cls, nombre, tipo, cadena_vit):
        vitamins = [v.strip() for v in cadena_vit.split(",") if v.strip()]
        return cls(nombre, tipo, vitamins)
    def agregar_vitamina(self, v):
        self.vitaminas.append(v)
    def nro_vitaminas(self):
        return len(self.vitaminas)

def fruta_mas_vitaminas(frutas):
    return max(frutas, key=lambda f: f.nro_vitaminas())

def vitaminas_fruta(frutas, nombre):
    for f in frutas:
        if f.nombre == nombre:
            return f.vitaminas
    return []

def contar_citricas(frutas):
    total = 0
    for f in frutas:
        for v in f.vitaminas:
            if v.upper() == "C":
                total += 1
    return total

def ordenar_por_nombre_vit(frutas):
    return sorted(frutas, key=lambda f: ",".join(f.vitaminas))

if __name__ == "__main__":
    f1 = Fruta("Kiwi", "subtropical", ["K","C","E"])
    f2 = Fruta.desde_cadena("Naranja", "citricos", "C,E")
    f3 = Fruta("Manzana", "temperada", [])
    f3.agregar_vitamina("C")
    f3.agregar_vitamina("A")
    frutas = [f1, f2, f3]
    print(fruta_mas_vitaminas(frutas).nombre)
    print(vitaminas_fruta(frutas, "Naranja"))
    print(contar_citricas(frutas))
    ordenadas = ordenar_por_nombre_vit(frutas)
    print([f.nombre for f in ordenadas])
