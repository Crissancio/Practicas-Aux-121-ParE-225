#Ejercicio 15. Se tienen las siguientes clases:
#• Clase Nadador con atributos y métodos relacionados con la natación, por
#ejemplo:
#o Atributo: estiloNatacion o Método: nadar() que imprime
#“Nadando estilo [estiloNatacion]”.
#• Clase Ciclista con atributos y métodos relacionados con el ciclismo:
#o Atributo: tipoBicicleta
#o Método: pedalear() que imprime “Pedaleando en bicicleta tipo
#[tipoBicicleta]”.
#• Clase Corredor con atributos y métodos relacionados con la carrera a pie:
#o Atributo: distanciaPreferida
#o Método: correr() que imprime “Corriendo una
#distancia de
#[distanciaPreferida] km”.
class Nadador:
    def __init__(self,estiloNatacion):
        self.estiloNatacion=estiloNatacion
    def nadar(self):
        print("Nadando estilo",self.estiloNatacion)
class Ciclista:
    def __init__(self,tipoBicicleta):
        self.tipoBicicleta=tipoBicicleta
    def pedalear(self):
        print("Pedaleando en bicicleta tipo",self.tipoBicicleta)
class Corredor:
    def __init__(self,distanciaPreferida):
        self.distanciaPreferida=distanciaPreferida
    def correr(self):
        print("Corriendo una distancia de {} km".format(self.distanciaPreferida))
    #a) Crear una clase Triatleta que herede de las tres clases anteriores (Nadador,Ciclista y Corredor).
class Triatleta(Corredor,Ciclista,Nadador):
    def __init__(self,estiloNatacion,tipoBicicleta,distanciaPreferida):
        Nadador.__init__(self,estiloNatacion)
        Ciclista.__init__(self,tipoBicicleta)
        Corredor.__init__(self,distanciaPreferida)
#b) Instanciar un objeto Triatleta con valores para los atributos heredados.
triatleta=Triatleta("Mariposa","BMX",42)
#c) Utilizar los métodos heredados para mostrar las acciones del triatleta.
triatleta.nadar()
triatleta.pedalear()
triatleta.correr()
