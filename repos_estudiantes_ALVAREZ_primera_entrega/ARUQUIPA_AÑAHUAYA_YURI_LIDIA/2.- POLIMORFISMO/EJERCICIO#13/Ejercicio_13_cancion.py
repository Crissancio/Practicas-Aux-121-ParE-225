# === Clase Cancion ===
class Cancion:
    def __init__(self, nombre="", artista="", peso=0):
        self.nombre = nombre
        self.artista = artista
        self.peso = peso  # en KB

    def mostrar(self):
        print(f"Canción -> {self.nombre} | {self.artista} | {self.peso} KB")


# === Clase Video ===
class Video:
    def __init__(self, nombre="", artista="", peso=0):
        self.nombre = nombre
        self.artista = artista
        self.peso = peso  # en MB

    def mostrar(self):
        print(f"Video -> {self.nombre} | {self.artista} | {self.peso} MB")


# === Clase MP4 ===
class MP4:
    def __init__(self, capacidadCanciones=100, capacidadVideos=100):
        self.capacidadCanciones = capacidadCanciones
        self.capacidadVideos = capacidadVideos
        self.canciones = []
        self.videos = []

    # --- Sobrecarga de método borrarCancion ---
    def borrarCancion(self, nombre=None, artista=None, peso=None):
        inicial = len(self.canciones)
        if nombre and artista and peso is not None:
            self.canciones = [c for c in self.canciones
                              if not (c.nombre == nombre and c.artista == artista and c.peso == peso)]
        elif nombre and artista:
            self.canciones = [c for c in self.canciones
                              if not (c.nombre == nombre and c.artista == artista)]
        elif nombre:
            self.canciones = [c for c in self.canciones if c.nombre != nombre]
        elif artista:
            self.canciones = [c for c in self.canciones if c.artista != artista]
        eliminadas = inicial - len(self.canciones)
        print(f"🗑  Canciones eliminadas: {eliminadas}")

    # --- Operador +  (añadir canción) ---
    def __add__(self, nuevaCancion):
        for c in self.canciones:
            if c.nombre == nuevaCancion.nombre and c.artista == nuevaCancion.artista:
                print("⚠️  La canción ya existe en el reproductor.")
                return self
        if len(self.canciones) < self.capacidadCanciones:
            self.canciones.append(nuevaCancion)
            print(f"✅  Canción '{nuevaCancion.nombre}' agregada correctamente.")
        else:
            print("❌  No hay espacio disponible para más canciones.")
        return self

    # --- Operador -  (añadir video) ---
    def __sub__(self, nuevoVideo):
        for v in self.videos:
            if v.nombre == nuevoVideo.nombre and v.artista == nuevoVideo.artista:
                print("⚠️  El video ya existe en el reproductor.")
                return self
        if len(self.videos) < self.capacidadVideos:
            self.videos.append(nuevoVideo)
            print(f"✅  Video '{nuevoVideo.nombre}' agregado correctamente.")
        else:
            print("❌  No hay espacio disponible para más videos.")
        return self

    # --- Mostrar información general y capacidad disponible ---
    def mostrar(self):
        print("\n=== LISTA DE CANCIONES ===")
        for c in self.canciones:
            c.mostrar()

        print("\n=== LISTA DE VIDEOS ===")
        for v in self.videos:
            v.mostrar()

        self.mostrarCapacidad()

    def mostrarCapacidad(self):
        usadoCanciones = sum(c.peso for c in self.canciones) / 1024  # convertir a MB
        usadoVideos = sum(v.peso for v in self.videos)
        totalUsado = usadoCanciones + usadoVideos
        print(f"\n💾  Capacidad usada: {totalUsado:.2f} MB")


# === Programa principal ===
# Canciones iniciales
c1 = Cancion("Back To Black", "Amy Winehouse", 100)
c2 = Cancion("Lost On You", "LP", 150)

# Videos iniciales
v1 = Video("Heathens", "twenty one pilots", 50)
v2 = Video("Harmonica Andromeda", "KSHMR", 70)
v3 = Video("Without Me", "Halsey", 30)

# Crear MP4 e insertar datos base
mp4 = MP4()
mp4.canciones.extend([c1, c2])
mp4.videos.extend([v1, v2, v3])

# Probar métodos
mp4.mostrar()

# a) Borrar canción por nombre
mp4.borrarCancion(nombre="Lost On You")

# b) Agregar una nueva canción (+)
mp4 = mp4 + Cancion("Skyfall", "Adele", 120)

# c) Agregar un nuevo video (−)
mp4 = mp4 - Video("Believer", "Imagine Dragons", 60)

# d) Mostrar capacidad disponible actualizada
mp4.mostrar()
