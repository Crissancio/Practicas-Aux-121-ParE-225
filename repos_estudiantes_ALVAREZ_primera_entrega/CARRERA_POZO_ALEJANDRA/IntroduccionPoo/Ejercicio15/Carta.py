class Carta:
    def __init__(self, codigo, descripcion, remitente, destinatario):
        self.codigo = codigo
        self.descripcion = descripcion
        self.remitente = remitente
        self.destinatario = destinatario
    def mostrar_info(self):
        print(f"Código: {self.codigo}, Remitente: {self.remitente}, Destinatario: {self.destinatario}")
        print(f"Descripción: {self.descripcion}\n")

class Buzon:
    def __init__(self, nro):
        self.nro = nro
        self.cartas = [] 
        self.nroC = 0
    def agregar_carta(self, carta):
        self.cartas.append(carta)
        self.nroC += 1
    def contar_cartas_destinatario(self, nombre):
        contador = 0
        for carta in self.cartas:
            if carta.destinatario == nombre:
                contador += 1
        return contador
    def eliminar_carta(self, codigo):
        for carta in self.cartas:
            if carta.codigo == codigo:
                self.cartas.remove(carta)
                self.nroC -= 1
                print(f"Carta con código {codigo} eliminada.")
                return
        print("No se encontró la carta con ese código.")
    def remitente_recibio(self):
        remitentes = set([c.remitente for c in self.cartas])
        destinatarios = set([c.destinatario for c in self.cartas])
        comunes = remitentes.intersection(destinatarios)
        if comunes:
            for nombre in comunes:
                print(f"El remitente {nombre} también recibió cartas.")
        else:
            print("Ningún remitente ha recibido cartas.")
    def buscar_palabra(self, palabra):
        print(f"\nCartas que contienen la palabra '{palabra}':")
        for carta in self.cartas:
            if palabra.lower() in carta.descripcion.lower():
                print(f"- Código: {carta.codigo}, Remitente: {carta.remitente}, Destinatario: {carta.destinatario}")

c1 = Carta("C123", "Hola amigo, te saludo con cariño.", "Juan Álvarez", "Peter Chaves")
c2 = Carta("C456", "Querido amigo, te escribo para decirte que ella no te ama, pero hay amor en el aire.", "Pepe Mujica", "Wilmer Pérez")
c3 = Carta("C789", "Saludos cordiales y buenos deseos.", "Paty Vasques", "Pepe Mujica")
b1 = Buzon(1)
b2 = Buzon(2)
b3 = Buzon(3)

for carta in [c1, c2, c3]:
    b1.agregar_carta(carta)
    b2.agregar_carta(carta)
    b3.agregar_carta(carta)

destinatario = "Pepe Mujica"
print(f"{destinatario} recibió {b1.contar_cartas_destinatario(destinatario)} cartas.\n")

b1.eliminar_carta("C456")
b1.remitente_recibio()
b1.buscar_palabra("amor")
