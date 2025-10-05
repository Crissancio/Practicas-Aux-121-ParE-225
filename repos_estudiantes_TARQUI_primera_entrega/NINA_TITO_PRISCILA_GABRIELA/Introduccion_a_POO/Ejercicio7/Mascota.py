class Mascota:
    def __init__(self, nombre, tipo, energia):
        self.nombre = nombre
        self.tipo = tipo
        self.energia = energia

    def alimentar(self):
        if self.energia >= 81:
            print("Si alimenta ahora a su mascota, sobrepasara el limite de energia, por favor juegue con ella primero.")
        else:
            self.energia += 20
            print(f"{self.nombre} ha sido alimentado, su energia es: {self.energia}")

    def jugar(self):
        if self.energia >= 15:
            self.energia -= 15
            print(f"{self.nombre} ha jugado, su energia es: {self.energia}")
        else:
            print(f"{self.nombre} no tiene suficiente energia para jugar, su energia es de: {self.energia} por favor aliméntelo primero.")

    def __str__(self):
        return f"Nombre: {self.nombre}, Tipo: {self.tipo}, Energia: {self.energia}"


# Main
if __name__ == "__main__":
    m1 = Mascota("Firulais", "Perro", 50)
    m2 = Mascota("Pelusa", "Gato", 30)

    print("Al inicio: " + str(m1))
    m1.jugar()
    m1.alimentar()
    m1.alimentar()
    m1.jugar()
    print("Al final: " + str(m1))
    print("-------------------")
    print("Al inicio: " + str(m2))
    m2.jugar()
    m2.jugar()
    m2.jugar()
    m2.alimentar()
    m2.jugar()
    print("Al final: " + str(m2))
    print("-------------------")