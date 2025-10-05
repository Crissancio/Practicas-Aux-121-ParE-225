class MP4:
    def __init__(self, marca, capacidadGB):
        self.marca = marca
        self.capacidadGB = capacidadGB
        self.nroCanciones = 0
        self.canciones = []  
        self.nroVideos = 0
        self.videos = []     

    def __add__(self, cancion):
        if isinstance(cancion, dict) and self.nroCanciones < self.capacidadGB * 1000:
            if not any(c['nombre'] == cancion['nombre'] and c['artista'] == cancion['artista']
                       for c in self.canciones):
                self.canciones.append(cancion)
                self.nroCanciones += 1
        return self

    def __sub__(self, video):
        if isinstance(video, dict) and self.nroVideos < self.capacidadGB * 100:
            if not any(v['nombre'] == video['nombre'] and v['artista'] == video['artista']
                       for v in self.videos):
                self.videos.append(video)
                self.nroVideos += 1
        return self

    def borrar_cancion(self, nombre=None, artista=None, peso=None):
        nuevas_canciones = []
        for c in self.canciones:
            if ((nombre is not None and c['nombre'] != nombre) or
                (artista is not None and c['artista'] != artista) or
                (peso is not None and c['pesoKb'] != peso)):
                nuevas_canciones.append(c)
        self.nroCanciones = len(nuevas_canciones)
        self.canciones = nuevas_canciones

    def mostrar_capacidad_disponible(self):
        print("Capacidad disponible:")
        print(f" Canciones: {self.capacidadGB * 1000 - self.nroCanciones}")
        print(f" Videos: {self.capacidadGB * 100 - self.nroVideos}")

    def __str__(self):
        return (f"MP4 Marca: {self.marca}\n"
                f" Canciones: {self.nroCanciones}\n"
                f" Videos: {self.nroVideos}")

    def mostrar(self):
        print(f"MP4 Marca: {self.marca}")
        print("Canciones:")
        for c in self.canciones:
            print(f" - {c['nombre']} - {c['artista']} ({c['pesoKb']}Kb)")
        print("Videos:")
        for v in self.videos:
            print(f" - {v['nombre']} - {v['artista']} ({v['pesoMb']}Mb)")


mp4 = MP4("Sony", 2)  

mp4 = mp4 + {'nombre': "Ameri", 'artista': "Duki", 'pesoKb': 100}
mp4 = mp4 + {'nombre': "Lost On You", 'artista': "LP", 'pesoKb': 120}
mp4 = mp4 - {'nombre': "buscala", 'artista': "Los bybys", 'pesoMb': 50}

mp4.mostrar()
mp4.mostrar_capacidad_disponible()

mp4.borrar_cancion(nombre="Lost On You")
print("\nDespués de borrar canción:")
mp4.mostrar()
mp4.mostrar_capacidad_disponible()
print("\nInfo resumida del MP4:")
print(mp4)
