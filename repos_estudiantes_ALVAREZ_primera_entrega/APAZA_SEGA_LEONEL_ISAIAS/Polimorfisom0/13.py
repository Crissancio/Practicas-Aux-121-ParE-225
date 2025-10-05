class MP4:
    def __init__(self):
        self.canciones = []
        self.videos = []

    def borrar_cancion(self, nombre=None, artista=None, peso=None):
        self.canciones = [c for c in self.canciones if not (
            (nombre and c['nombre']==nombre) or
            (artista and c['artista']==artista) or
            (nombre and peso and c['nombre']==nombre and c['peso']==peso)
        )]

    def __add__(self, cancion):
        if len(self.canciones) < 100:
            self.canciones.append(cancion)
        return self

    def __sub__(self, video):
        if len(self.videos) < 100:
            self.videos.append(video)
        return self

    def capacidad_disponible(self):
        total = sum(c['peso'] for c in self.canciones) + sum(v['peso'] for v in self.videos)
        print(f"Capacidad usada: {total} MB")

# Ejemplo
mp4 = MP4()
mp4 += {"nombre": "Lost On You", "artista": "LP", "peso": 150}
mp4 -= {"nombre": "Heathens", "artista": "twenty one pilots", "peso": 50}
mp4.capacidad_disponible()
