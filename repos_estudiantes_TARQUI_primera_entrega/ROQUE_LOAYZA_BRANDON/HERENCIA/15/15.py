
class Nadador:
    def __init__(self, estiloNatacion):
        self.estiloNatacion = estiloNatacion

    def nadar(self):
        print("Nadando estilo", self.estiloNatacion)

class Ciclista:
    def __init__(self, tipoBicicleta):
        self.tipoBicicleta = tipoBicicleta

    def pedalear(self):
        print("Pedaleando en bicicleta tipo", self.tipoBicicleta)

class Corredor:
    def __init__(self, distanciaPreferida):
        self.distanciaPreferida = distanciaPreferida

    def correr(self):
        print("Corriendo una distancia de", self.distanciaPreferida, "km")

class Triatleta(Nadador, Ciclista, Corredor):
    def __init__(self, estilo, tipo, distancia):
        Nadador.__init__(self, estilo)
        Ciclista.__init__(self, tipo)
        Corredor.__init__(self, distancia)


t = Triatleta("Libre", "Montana", 10)
t.nadar()
t.pedalear()
t.correr()
