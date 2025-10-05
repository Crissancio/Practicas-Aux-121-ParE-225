from Nadador import Triatleta
def main():
    tri = Triatleta("Mariposa", "Carretera", 20)

    tri.nadar()
    tri.pedalear()
    tri.correr()

if __name__ == "__main__":
    main()