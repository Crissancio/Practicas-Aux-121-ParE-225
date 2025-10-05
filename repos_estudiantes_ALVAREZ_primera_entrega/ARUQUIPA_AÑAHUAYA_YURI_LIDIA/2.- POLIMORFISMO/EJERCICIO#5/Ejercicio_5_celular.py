class Celular:
    def __init__(self, nroTel, dueño, espacio, ram, nroApp):
        self.nroTel = nroTel
        self.dueño = dueño
        self.espacio = espacio  # en GB
        self.ram = ram          # en GB
        self.nroApp = nroApp

    def __str__(self):
        return (f"Celular de {self.dueño} | Tel: {self.nroTel} | "
                f"Espacio: {self.espacio}GB | RAM: {self.ram}GB | "
                f"Apps instaladas: {self.nroApp}")

    # Sobrecarga del operador "++" → simulada con "+"
    def __add__(self, other):
        # Aumentar el número de apps en 10
        nuevo = Celular(self.nroTel, self.dueño, self.espacio, self.ram, self.nroApp + 10)
        print(f"Operador ++ aplicado → {self.dueño} ahora tiene {nuevo.nroApp} apps.")
        return nuevo

    # Sobrecarga del operador "--" → simulada con "-"
    def __sub__(self, other):
        # Disminuir espacio en 5GB, sin bajar de 0
        nuevo_espacio = max(self.espacio - 5, 0)
        nuevo = Celular(self.nroTel, self.dueño, nuevo_espacio, self.ram, self.nroApp)
        print(f"Operador -- aplicado → {self.dueño} ahora tiene {nuevo.espacio}GB libres.")
        return nuevo


# ---------------- Programa de prueba ----------------
def main():
    # Crear un objeto Celular
    celular1 = Celular("76543210", "Yuri", 64, 8, 20)

    print("--- Estado inicial ---")
    print(celular1)

    # Aplicar sobrecarga de operadores
    print("\n--- Aplicando operadores ---")
    celular1 = celular1 + 1   # ++ → aumenta apps
    celular1 = celular1 - 1   # -- → reduce espacio

    print("\n--- Estado final ---")
    print(celular1)


if __name__ == "__main__":
    main()
