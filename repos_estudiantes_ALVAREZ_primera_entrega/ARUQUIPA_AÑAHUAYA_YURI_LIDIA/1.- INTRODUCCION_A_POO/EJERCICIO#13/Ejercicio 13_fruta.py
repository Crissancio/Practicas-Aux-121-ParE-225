class Fruta:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo
        self.nroVitaminas = 0
        self.v = []  # lista de vitaminas (máx. 30)

    def agregar_vitamina(self, vitamina):
        if self.nroVitaminas < 30:
            self.v.append(vitamina)
            self.nroVitaminas += 1
        else:
            print("No se pueden agregar más vitaminas, límite de 30 alcanzado.")

    def mostrar_vitaminas(self):
        return self.v

    def __str__(self):
        return f"Fruta: {self.nombre}, Tipo: {self.tipo}, Vitaminas: {', '.join(self.v)}"


# ----------------- Programa de prueba -----------------
def main():
    # a) Instanciar 3 frutas de 3 maneras diferentes con al menos 2 vitaminas cada una

    # Forma 1: normal
    f1 = Fruta("Kiwi", "Subtropical")
    f1.agregar_vitamina("C")
    f1.agregar_vitamina("E")

    # Forma 2: ya con lista inicial
    f2 = Fruta("Naranja", "Cítrico")
    for v in ["C", "A"]:
        f2.agregar_vitamina(v)

    # Forma 3: agregando después de crear
    f3 = Fruta("Banana", "Tropical")
    f3.agregar_vitamina("B6")
    f3.agregar_vitamina("C")

    frutas = [f1, f2, f3]

    print("\n--- Lista de frutas ---")
    for f in frutas:
        print(f)

    # b) Verificar cuál es la fruta con más vitaminas
    mas_vitaminas = max(frutas, key=lambda f: f.nroVitaminas)
    print("\nLa fruta con más vitaminas es:", mas_vitaminas.nombre, "con", mas_vitaminas.nroVitaminas)

    # c) Mostrar las vitaminas de la fruta X (ej: Banana)
    # SE DEBE BUSCAR A LA FRUTA X
    
    print("\nVitaminas de Banana:", f3.mostrar_vitaminas())

    # d) ¿Cuántas vitaminas son cítricas? (contando las "C")
    total_citricas = sum(f.v.count("C") for f in frutas)
    print("\nTotal de vitaminas cítricas entre todas las frutas:", total_citricas)

    # e) Ordenar las frutas alfabéticamente según el nombre de sus vitaminas
    print("\n--- Vitaminas de cada fruta ordenadas ---")
    for f in frutas:
        ordenadas = sorted(f.v)
        print(f.nombre, "->", ordenadas)


if __name__ == "__main__":
    main()
