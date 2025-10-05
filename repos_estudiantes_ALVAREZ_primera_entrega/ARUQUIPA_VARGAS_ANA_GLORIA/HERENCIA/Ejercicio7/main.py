
from Perrsona import Estudiante, Docente, promedio, verificar_edad

def main():
    est1 = Estudiante("Carlos", "Vargas", "Garcia", 20, "RU001", "M123")
    est2 = Estudiante("Ana", "Perez", "Martinez", 22, "RU002", "M456")
    docente = Docente("Luis", "Fernandez", "Rojas", 22, 2500, "RP789")

    est1.mostrar()
    print()
    est2.mostrar()
    print()
    docente.mostrar()
    print()

    print(f"Promedio de edad de estudiantes: {promedio([est1, est2]):.2f}")

    est1.modificarEdad(21)
    print(f"Edad modificada de {est1.nombre}: {est1.edad}")

    verificar_edad([est1, est2], docente)

if __name__ == "__main__":
    main()
