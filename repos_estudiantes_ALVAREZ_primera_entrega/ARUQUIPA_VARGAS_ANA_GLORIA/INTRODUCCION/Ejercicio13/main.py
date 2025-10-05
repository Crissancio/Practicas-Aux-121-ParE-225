from Fruta import Fruta

def main():
    naranja = Fruta("naranja", "cítrica", ["C", "A", "B1"])

    vitaminas_mango = ["A", "C", "E"]
    mango = Fruta("mango", "tropical", vitaminas_mango)

    datos_kiwi = {"nombre": "kiwi", "tipo": "subtropical", "vitaminas": ["K", "C", "E"]}
    kiwi = Fruta(**datos_kiwi)

    frutas = [naranja, mango, kiwi]
    fruta_max = max(frutas, key=lambda f: f.nroVitaminas)
    print(f" Fruta con más vitaminas: {fruta_max.nombre}")

    nombre_buscar = "mango"
    for fruta in frutas:
        if fruta.nombre == nombre_buscar:
            print(f" Vitaminas de {fruta.nombre}: {', '.join(fruta.V)}")

    vitaminas_citricas = {"A", "B1", "C"}
    total_citricas = sum(1 for f in frutas for v in f.V if v in vitaminas_citricas)
    print(f" Cantidad de vitaminas cítricas: {total_citricas}")

    frutas_ordenadas = sorted(frutas, key=lambda f: ''.join(sorted(f.V)))
    print(" Frutas ordenadas por nombres de sus vitaminas:")
    for fruta in frutas_ordenadas:
        vitaminas_ordenadas = ', '.join(sorted(fruta.V))
        print(f"{fruta.nombre}: {vitaminas_ordenadas}")

if __name__ == "__main__":
    main()
