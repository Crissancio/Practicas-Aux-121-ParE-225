from politico import Presidente, buscar_presidente_por_nombre

def main():
    p1 = Presidente("Carlos", "Lopez", "Abogado", 10, "Partido Azul", "Líder")
    p2 = Presidente("Jorge", "Quiroga", "Ingeniero", 8, "Partido Blanco", "Líder")
    p3 = Presidente("Luis", "Fernandez", "Economia", 12, "Partido Rojo", "Miembro")

    presidentes = [p1, p2, p3]

    nombre_a_buscar = input("Ingrese el nombre del presidente a buscar: ")
    buscar_presidente_por_nombre(presidentes, nombre_a_buscar)

if __name__ == "__main__":
    main()
