# === Clase Ordenador ===
class Ordenador:
    def __init__(self, codigoSerial="", numero=0, memoriaRAM=0, procesador="", estado="inactivo"):
        self.codigoSerial = codigoSerial
        self.numero = numero
        self.memoriaRAM = memoriaRAM  # en GB
        self.procesador = procesador
        self.estado = estado.lower()  # "activo" o "inactivo"

    def mostrar(self):
        print(f"Ordenador {self.numero} -> Serial: {self.codigoSerial}, RAM: {self.memoriaRAM}GB, "
              f"CPU: {self.procesador}, Estado: {self.estado.capitalize()}")


# === Clase Laboratorio ===
class Laboratorio:
    def __init__(self, nombre="", capacidad=0):
        self.nombre = nombre
        self.capacidad = capacidad
        self.ordenadores = []

    # Método para añadir un ordenador al laboratorio
    def agregarOrdenador(self, ordenador):
        if len(self.ordenadores) < self.capacidad:
            self.ordenadores.append(ordenador)
        else:
            print(f"⚠️  El laboratorio {self.nombre} ya alcanzó su capacidad máxima.")

    # --- Sobrecarga del método informacion ---
    def informacion(self, modo=None, valor=None):
        print(f"\n=== Información solicitada en {self.nombre} ===")
        if modo == "estado":
            print(f"Ordenadores con estado '{valor}':")
            for o in self.ordenadores:
                if o.estado == valor.lower():
                    o.mostrar()
        elif modo == "laboratorio":
            print(f"Ordenadores que pertenecen al laboratorio {valor}:")
            if self.nombre.lower() == valor.lower():
                for o in self.ordenadores:
                    o.mostrar()
        elif modo == "ram":
            print("Ordenadores con más de 8GB de RAM:")
            for o in self.ordenadores:
                if o.memoriaRAM > 8:
                    o.mostrar()
        else:
            print("Todos los ordenadores:")
            for o in self.ordenadores:
                o.mostrar()

    # Mostrar todos los ordenadores del laboratorio
    def mostrarTodo(self):
        print(f"\n=== {self.nombre} ===")
        for o in self.ordenadores:
            o.mostrar()


# === Función para trasladar ordenadores ===
# DEBE SER UN METODO
def trasladarOrdenadores(lab_origen, lab_destino, cantidad):
    print("\n📦 Traslado de ordenadores entre laboratorios")
    print("\n-- Estado antes del traslado --")
    lab_origen.mostrarTodo()
    lab_destino.mostrarTodo()

    trasladados = 0
    while trasladados < cantidad and lab_origen.ordenadores:
        pc = lab_origen.ordenadores.pop(0)
        lab_destino.agregarOrdenador(pc)
        trasladados += 1

    print("\n✅ Traslado completado.")
    print("\n-- Estado después del traslado --")
    lab_origen.mostrarTodo()
    lab_destino.mostrarTodo()


# === Programa principal ===

# Crear 6 ordenadores
o1 = Ordenador("S001", 1, 4, "Intel i3", "activo")
o2 = Ordenador("S002", 2, 8, "AMD Ryzen 3", "inactivo")
o3 = Ordenador("S003", 3, 16, "Intel i5", "activo")
o4 = Ordenador("S004", 4, 12, "Intel i7", "activo")
o5 = Ordenador("S005", 5, 6, "AMD Ryzen 5", "inactivo")
o6 = Ordenador("S006", 6, 16, "Intel i9", "activo")

# Crear 2 laboratorios
lab1 = Laboratorio("Lasin 1", 4)
lab2 = Laboratorio("Lasin 2", 4)

# Asignar ordenadores a laboratorios
lab1.agregarOrdenador(o1)
lab1.agregarOrdenador(o2)
lab1.agregarOrdenador(o3)
lab1.agregarOrdenador(o4)

lab2.agregarOrdenador(o5)
lab2.agregarOrdenador(o6)

# b) Probar sobrecarga de informacion
lab1.informacion("estado", "activo")
lab1.informacion("laboratorio", "Lasin 1")
lab1.informacion("ram")

# c) Trasladar 2 ordenadores de Lasin 1 a Lasin 2
trasladarOrdenadores(lab1, lab2, 2)
