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
    def adicionar_carta(self, carta):
        self.cartas.append(carta)
    def contar_por_destinatario(self, nombre):
        return sum(1 for c in self.cartas if c.destinatario == nombre)
    def eliminar_por_codigo(self, codigo):
        for i,c in enumerate(self.cartas):
            if c.codigo == codigo:
                del self.cartas[i]
                return True
        return False
    def buscar_palabra(self, palabra):
        resultado = []
        for c in self.cartas:
            if palabra.lower() in c.descripcion.lower():
                resultado.append((c.codigo, c.remitente, c.destinatario))
        return resultado

if __name__ == "__main__":
    c1 = Carta("C123", "Juan Alvarez", "Peter Chaves", "Querido amigo no te preocupes")
    c2 = Carta("C456", "Pepe Mujica", "Wilmer Perez", "Hola, amor y buenas noticias")
    c3 = Carta("C789", "Paty Vasques", "Pepe Mujica", "Carta larga sobre trabajo y amor")
    b1 = Buzon(1)
    b2 = Buzon(2)
    b3 = Buzon(3)
    b1.adicionar_carta(c1)
    b1.adicionar_carta(c2)
    b2.adicionar_carta(c3)
    b2.adicionar_carta(c1)
    b3.adicionar_carta(c2)
    print(b1.contar_por_destinatario("Pepe Mujica"))
    print(b2.contar_por_destinatario("Pepe Mujica"))
    print(b1.eliminar_por_codigo("C456"))
    print(b1.contar_por_destinatario("Wilmer Perez"))
    remitentes = {c.remitente for c in (b1.cartas + b2.cartas + b3.cartas)}
    destinatarios = {c.destinatario for c in (b1.cartas + b2.cartas + b3.cartas)}
    comunes = remitentes.intersection(destinatarios)
    print(len(comunes) > 0, list(comunes))
    print(b2.buscar_palabra("amor"))
