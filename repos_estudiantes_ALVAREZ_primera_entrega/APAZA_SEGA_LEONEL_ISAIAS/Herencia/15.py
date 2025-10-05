class Nadador:
    def __init__(self, estilo):
        self.estiloNatacion = estilo
    def nadar(self):
        print(f"Nadando estilo {self.estiloNatacion}")

class Ciclista:
    def __init__(self, tipoBici):
        self.tipoBicicleta = tipoBici
    def pedalear(self):
        print(f"Pedaleando en bicicleta tipo {self.tipoBicicleta}")

class Corredor:
    def __init__(self, distancia):
        self.distanciaPreferida = distancia
    def correr(self):
        print(f"Corriendo una distancia de {self.distanciaPreferida} km")

class Triatleta(Nadador, Ciclista, Corredor):
    def __init__(self, estilo, bici, distancia):
        Nadador.__init__(self, estilo)
        Ciclista.__init__(self, bici)
        Corredor.__init__(self, distancia)

# Ejemplo
t = Triatleta("Libre", "Ruta", 10)
t.nadar()
t.pedalear()
t.correr()
