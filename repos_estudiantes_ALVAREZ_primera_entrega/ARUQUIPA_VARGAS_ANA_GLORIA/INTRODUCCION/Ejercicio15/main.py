from Buzon import Buzon, Carta

def main():
    cartas = {
        "C123": "Querido Peter, te escribo para contarte que te aprecio mucho.",
        "C456": "Hola Wilmer, con mucho amor y esperanza.",
        "C789": "Pepe, esta carta es para ti con mucho cariño.",
        "C234": "Carta para Juan.",
        "C235": "Querido X, te extraño mucho.",
        "C236": "Saludos a todos.",
        "C345": "Te mando todo mi amor.",
        "C346": "Gracias por tu carta.",
        "C347": "Hola Pedro, ¿cómo estás?"
    }

    b1 = Buzon(1)
    b1.agregar_carta("C123", "Juan Álvarez", "Peter Chaves")
    b1.agregar_carta("C456", "Pepe Mujica", "Wilmer Pérez")
    b1.agregar_carta("C789", "Paty Vasques", "Pepe Mujica")

    b2 = Buzon(2)
    b2.agregar_carta("C234", "X", "Juan Álvarez")
    b2.agregar_carta("C235", "María", "X")
    b2.agregar_carta("C236", "Pedro", "Luis")

    b3 = Buzon(3)
    b3.agregar_carta("C345", "Ana", "X")
    b3.agregar_carta("C346", "X", "Ana")
    b3.agregar_carta("C347", "Luis", "Pedro")

    buzones = [b1, b2, b3]

    total_para_x = sum(b.contar("X") for b in buzones)
    print(f"Cartas recibidas por 'X': {total_para_x}\n")

    for b in buzones:
        if b.eliminar("C235"):
            break

    remitentes = set()
    for b in buzones:
        remitentes.update(b.recibieron())
    if remitentes:
        print("Remitentes que también recibieron cartas:")
        for r in remitentes:
            print(f"- {r}")
    else:
        print("No hay remitentes que también hayan recibido cartas.")

    palabra = "amor"
    print(f"\nCartas que contienen la palabra '{palabra}':")
    for b in buzones:
        for i in range(b.nroC):
            codigo = b.c[i][0]
            remitente = b.c[i][1]
            destinatario = b.c[i][2]
            descripcion = cartas.get(codigo, "")
            if palabra.lower() in descripcion.lower():
                print(f"Código: {codigo}, Remitente: {remitente}, Destinatario: {destinatario}")


if __name__ == "__main__":
    main()