class MP4:
    def __init__(self, marca, capacidadGb):
        self.marca = marca
        self.capacidadGb = capacidadGb
        self.nroCanciones = 0
        self.canciones = [] 
        self.nroVideos = 0
        self.videos = []  

    def espacio_usado(self):
        peso_canciones_Gb = sum(c['peso'] for c in self.canciones) / (1024*1024) 
        peso_videos_Gb = sum(v['peso'] for v in self.videos) / 1024  
        return peso_canciones_Gb + peso_videos_Gb

    def capacidad_disponible(self):
        return self.capacidadGb - self.espacio_usado()

    def borrar_cancion(self, nombre=None, artista=None, peso=None):
        if nombre is None and artista is None and peso is None:
            return False

        canciones_nuevas = []
        borrado = False
        for c in self.canciones:
            if nombre is not None and c['nombre'] != nombre:
                canciones_nuevas.append(c)
            elif artista is not None and c['artista'] != artista:
                canciones_nuevas.append(c)
            elif peso is not None and c['peso'] != peso:
                canciones_nuevas.append(c)
            else:
                borrado = True

        if borrado:
            self.canciones = canciones_nuevas
            self.nroCanciones = len(self.canciones)
        return borrado

    def borrar_cancion_por_nombre(self, nombre):
        return self.borrar_cancion(nombre=nombre)

    def borrar_cancion_por_artista(self, artista):
        return self.borrar_cancion(artista=artista)

    def borrar_cancion_por_nombre_y_peso(self, nombre, peso):
        canciones_nuevas = []
        borrado = False
        for c in self.canciones:
            if not (c['nombre'] == nombre and c['peso'] == peso):
                canciones_nuevas.append(c)
            else:
                borrado = True
        if borrado:
            self.canciones = canciones_nuevas
            self.nroCanciones = len(self.canciones)
        return borrado

    def __add__(self, cancion):
        for c in self.canciones:
            if c['nombre'] == cancion['nombre'] and c['artista'] == cancion['artista']:
                print("La canción ya existe.")
                return self

        peso_cancion_Gb = cancion['peso'] / (1024*1024)
        if self.capacidad_disponible() >= peso_cancion_Gb:
            self.canciones.append(cancion)
            self.nroCanciones += 1
        else:
            print("No hay espacio suficiente para añadir la canción.")
        return self


    def __sub__(self, video):
        for v in self.videos:
            if v['nombre'] == video['nombre'] and v['artista'] == video['artista']:
                print("El video ya existe.")
                return self
            
        peso_video_Gb = video['peso'] / 1024
        if self.capacidad_disponible() >= peso_video_Gb:
            self.videos.append(video)
            self.nroVideos += 1
        else:
            print("No hay espacio suficiente para añadir el video.")
        return self

    def mostrar_capacidad_disponible(self):
        print(f"Capacidad disponible: {self.capacidad_disponible():.4f} Gb")



mp4 = MP4("Sony", 1.0) 

mp4 = mp4 + {'nombre': 'Back To Black', 'artista': 'Amy Winehouse', 'peso': 1000} 
mp4 = mp4 + {'nombre': 'Lost On You', 'artista': 'LP', 'peso': 150}  

mp4 = mp4 - {'nombre': 'Heathens', 'artista': 'twenty one pilots', 'peso': 50}  
mp4 = mp4 - {'nombre': 'Harmonica Andromeda', 'artista': 'KSHMR', 'peso': 70}  
mp4 = mp4 - {'nombre': 'Without Me', 'artista': 'Halsey', 'peso': 30}  

mp4.mostrar_capacidad_disponible()

mp4.borrar_cancion_por_nombre("Back To Black")
print("Borrando Back to Black....")
mp4.mostrar_capacidad_disponible()
