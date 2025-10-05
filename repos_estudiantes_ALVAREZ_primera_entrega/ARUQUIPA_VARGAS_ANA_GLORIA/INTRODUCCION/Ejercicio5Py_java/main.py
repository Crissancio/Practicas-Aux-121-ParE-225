from Persona import Persona

def main():
    persona1 = Persona("Juan", "Pérez", "Gómez", 20, "1234567")
    persona2 = Persona("María", "Pérez", "López", 17, "7654321")

    print("Datos de persona 1:")
    persona1.mostrarDatos()

    print("\nDatos de persona 2:")
    persona2.mostrarDatos()

    print("\nVerificación de mayoría de edad:")
    persona1.mayorDeEdad()
    persona2.mayorDeEdad()

    print("\nModificando edad de persona 2:")
    persona2.modificarEdad(19)
    persona2.mostrarDatos()

    if persona1.getApellidoPaterno().lower() == persona2.getApellidoPaterno().lower():
        print("Ambas personas tienen el mismo apellido paterno.")
    else:
        print("Las personas tienen apellidos paternos diferentes.")

if __name__ == "__main__":
    main()
