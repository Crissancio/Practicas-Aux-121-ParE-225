# === Clase Pasajero ===
class Pasajero:
    def __init__(self, nombre="", edad=0, genero=""):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero

    def mostrar(self):
        print(f"Pasajero -> Nombre: {self.nombre}, Edad: {self.edad}, Género: {self.genero}")


# === Clase Crucero ===
class Crucero:
    def __init__(self, nombre="", paisOrigen="", paisDestino="", nroPasajeros=0):
        self.nombre = nombre
        self.paisOrigen = paisOrigen
        self.paisDestino = paisDestino
        self.nroPasajeros = nroPasajeros
        self.pasajeros = []  # lista de pasajeros
        self.costoPasaje = []  # lista paralela con el costo de cada pasajero

    def mostrar(self):
        print(f"\n=== CRUCERO: {self.nombre} ===")
        print(f"Origen: {self.paisOrigen} → Destino: {self.paisDestino}")
        print(f"Nro de Pasajeros: {self.nroPasajeros}")
        print("-- Pasajeros --")
        for i, p in enumerate(self.pasajeros):
            p.mostrar()
            print(f"  Costo de pasaje: {self.costoPasaje[i]} Bs")

    # Sobrecarga del operador ++ (mostrar datos del crucero)
    def __pos__(self):
        print(f"\nInformación del crucero '{self.nombre}':")
        self.mostrar()

    # Sobrecarga del operador -- (mostrar pasajeros)
    def __neg__(self):
        print(f"\nListado de pasajeros del crucero '{self.nombre}':")
        for p in self.pasajeros:
            p.mostrar()

    # Sobrecarga del operador == (suma total de pasajes)
    def __eq__(self, other):
        total = sum(self.costoPasaje)
        print(f"\nSuma total de pasajes del crucero '{self.nombre}': {total} Bs")
        return total

    # Sobrecarga del operador + (comparar cantidad de pasajeros)
    def __add__(self, other):
        print(f"\nComparando cantidad de pasajeros entre '{self.nombre}' y '{other.nombre}'...")
        if len(self.pasajeros) == len(other.pasajeros):
            print("✅ Ambos cruceros tienen la misma cantidad de pasajeros.")
        else:
            print("❌ Los cruceros tienen distinta cantidad de pasajeros.")

    # Sobrecarga del operador - (contar hombres y mujeres)
    def __sub__(self, other=None):
        hombres = sum(1 for p in self.pasajeros if p.genero.lower() == "masculino")
        mujeres = sum(1 for p in self.pasajeros if p.genero.lower() == "femenino")
        print(f"\nCrucero '{self.nombre}': {hombres} hombres y {mujeres} mujeres.")


# === Programa principal ===

# Crear pasajeros
p1 = Pasajero("Juan Vargas", 30, "Masculino")
p2 = Pasajero("Martina Vasques", 28, "Femenino")
p3 = Pasajero("Wilmer Montero", 35, "Masculino")
p4 = Pasajero("Lucía Gómez", 27, "Femenino")
p5 = Pasajero("Carlos Pinto", 40, "Masculino")

# Crear cruceros
c1 = Crucero("Crucero Caribe", "Bolivia", "México", 3)
c2 = Crucero("Crucero Pacífico", "Chile", "Perú", 2)

# Agregar pasajeros y costos
c1.pasajeros.extend([p1, p2, p3])
c1.costoPasaje.extend([500, 1000, 925])

c2.pasajeros.extend([p4, p5])
c2.costoPasaje.extend([850, 770])

# --- Pruebas de los operadores sobrecargados ---
+c1        # ++  → muestra información del crucero
-c1        # --  → muestra los pasajeros
c1 == c2   # ==  → suma total del costo de pasajes
c1 + c2    # +   → compara cantidad de pasajeros
c1 - None  # -   → muestra cuántos hombres y mujeres hay
