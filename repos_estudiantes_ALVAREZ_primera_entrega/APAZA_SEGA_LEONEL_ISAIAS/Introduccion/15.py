class Carta:
    def __init__(self, codigo, remitente, destinatario, descripcion):
        self.codigo = codigo
        self.remitente = remitente
        self.destinatario = destinatario
        self.descripcion = descripcion

class Buzon:
    def __init__(self, nro):
        self.nro = nro
        self.cartas = []

    def agregar_carta(self, carta):
        self.cartas.append(carta)

    def buscar_por_palabra(self, palabra):
        for c in self.cartas:
            if palabra.lower() in c.descripcion.lower():
                print(f"Código: {c.codigo} | De: {c.remitente} | Para: {c.destinatario}")

# Ejemplo
b1 = Buzon(1)
c1 = Carta("C123", "Juan", "Pedro", "Querido amigo, te mando saludos con mucho amor.")
c2 = Carta("C456", "Pepe", "Luis", "Te envío esta carta por negocios.")
b1.agregar_carta(c1)
b1.agregar_carta(c2)
b1.buscar_por_palabra("amor")

# falta  c, d, e y g