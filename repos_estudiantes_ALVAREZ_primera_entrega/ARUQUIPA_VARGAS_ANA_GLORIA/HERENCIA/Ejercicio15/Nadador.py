class Nadador:
    def __init__(self, estiloNatacion):
        self._estiloNatacion = estiloNatacion 

    def nadar(self):
        print(f"Nadando estilo {self._estiloNatacion}")

class Ciclista:
    def __init__(self, tipoBicicleta):
        self._tipoBicicleta = tipoBicicleta 

    def pedalear(self):
        print(f"Pedaleando en bicicleta tipo {self._tipoBicicleta}")

class Corredor:
    def __init__(self, distanciaPreferida):
        self._distanciaPreferida = distanciaPreferida  

    def correr(self):
        print(f"Corriendo una distancia de {self._distanciaPreferida} km")

class Triatleta(Nadador, Ciclista, Corredor):
    def __init__(self, estiloNatacion, tipoBicicleta, distanciaPreferida):
        Nadador.__init__(self, estiloNatacion)
        Ciclista.__init__(self, tipoBicicleta)
        Corredor.__init__(self, distanciaPreferida)
