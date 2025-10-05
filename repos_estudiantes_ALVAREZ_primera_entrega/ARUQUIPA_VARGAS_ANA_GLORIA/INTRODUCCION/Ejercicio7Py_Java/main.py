from Mascota import Mascota

def main():
    mascota1 = Mascota("Roco", "Perro", 90)
    mascota2 = Mascota("Akira", "Gato", 45)
    mascota1.mostrarEnergia()
    mascota2.mostrarEnergia()

    print("\n Alimentando")
    mascota1.alimentar()
    mascota2.alimentar()
    print("\nJugando")
    mascota1.jugar()
    mascota2.jugar()
    print("\nEnergía final")
    mascota1.mostrarEnergia()
    mascota2.mostrarEnergia()

if __name__ == "__main__":
    main()
