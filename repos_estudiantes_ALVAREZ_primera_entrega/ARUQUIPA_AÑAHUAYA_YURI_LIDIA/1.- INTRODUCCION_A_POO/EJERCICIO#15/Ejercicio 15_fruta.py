class Carta:
    def __init__(self, codigo, remitente, destinatario, descripcion):
        self.codigo = codigo
        self.remitente = remitente
        self.destinatario = destinatario
        self.descripcion = descripcion

    def __str__(self):
        return f"Carta[{self.codigo}] De: {self.remitente} Para: {self.destinatario}\n{self.descripcion}"


class Buzon:
    def __init__(self, nro):
        self.nro = nro
        self.nroC = 0
        self.c = []  # lista de cartas

    def agregar_carta(self, carta):
        self.c.append(carta)
        self.nroC += 1

    def eliminar_carta(self, codigo):
        for carta in self.c:
            if carta.codigo == codigo:
                self.c.remove(carta)
                self.nroC -= 1
                print(f"Carta {codigo} eliminada del buzón {self.nro}.")
                return
        print(f"No se encontró la carta con código {codigo} en el buzón {self.nro}.")

    def contar_cartas_destinatario(self, destinatario):
        return sum(1 for carta in self.c if carta.destinatario == destinatario)

    def buscar_palabra_clave(self, palabra):
        resultados = []
        for carta in self.c:
            if palabra.lower() in carta.descripcion.lower():
                resultados.append(carta)
        return resultados

    def __str__(self):
        return f"Buzón {self.nro} con {self.nroC} cartas."


# ----------------- Programa de prueba -----------------
def main():
    # b) Instanciar cartas usando la tabla del enunciado
    carta1 = Carta("C001", "Ana", "Juan", "Querido amigo, te escribo para hablar de amor y amistad.")
    carta2 = Carta("C002", "Luis", "Maria", "Hola, espero que estés bien. El amor es complicado.")
    carta3 = Carta("C003", "Pedro", "Juan", "Saludos, solo quería recordarte sobre la reunión de mañana.")
    carta4 = Carta("C004", "Carla", "Juan", "Amigo, el amor siempre gana.")
    carta5 = Carta("C005", "Raul", "Pedro", "Te escribo para invitarte al cine.")
    carta6 = Carta("C006", "Marta", "Juan", "No olvides que la amistad es lo mejor.")
    carta7 = Carta("C007", "Jose", "Maria", "El amor y la vida siempre son misteriosos.")
    carta8 = Carta("C008", "Ana", "Pedro", "Mucha suerte en tu examen.")
    carta9 = Carta("C009", "Juan", "Ana", "Quería agradecerte por tu ayuda.")

    # a) Instanciar 3 buzones diferentes con al menos 3 cartas cada uno
    buzon1 = Buzon("001")
    for c in [carta1, carta2, carta3]:
        buzon1.agregar_carta(c)

    buzon2 = Buzon("002")
    for c in [carta4, carta5, carta6]:
        buzon2.agregar_carta(c)

    buzon3 = Buzon("003")
    for c in [carta7, carta8, carta9]:
        buzon3.agregar_carta(c)

    buzones = [buzon1, buzon2, buzon3]

    # c) Verificar cuántas cartas recibió el destinatario "Juan"
    total_para_juan = sum(b.contar_cartas_destinatario("Juan") for b in buzones)
    print("Cartas recibidas por Juan:", total_para_juan)

    # d) Eliminar la carta con código "C002"
    buzon1.eliminar_carta("C002")

    # e) Verificar si algún remitente también recibió cartas
    remitentes = {carta.remitente for b in buzones for carta in b.c}
    destinatarios = {carta.destinatario for b in buzones for carta in b.c}
    for remitente in remitentes:
        if remitente in destinatarios:
            print(f"El remitente {remitente} también recibió cartas.")

    # f) Buscar palabra clave "amor"
    print("\n--- Buscando palabra clave 'amor' ---")
    for b in buzones:
        resultados = b.buscar_palabra_clave("amor")
        for carta in resultados:
            print(f"Código: {carta.codigo}, Remitente: {carta.remitente}, Destinatario: {carta.destinatario}")


if __name__ == "__main__":
    main()
