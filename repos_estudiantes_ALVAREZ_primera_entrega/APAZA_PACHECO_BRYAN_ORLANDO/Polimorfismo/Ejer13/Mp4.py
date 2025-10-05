# Definición de clase Mp4
class Mp4:
    # Constructor por defecto
    def __init__(self,marca="",capacidadGb=0.0):
        self.marca=marca
        self.capacidadGb=capacidadGb
        self.nroCanciones=0
        self.canciones=[]  
        self.nroVideos=0
        self.videos=[]   

    #a) 
    def borrarCancion(self,x=None,y=None,z=None):
        if x and not y and not z:  # solo nombre
            self.canciones=[c for c in self.canciones if c[0]!=x]
        elif x and y and not z:    # nombre y artista
            self.canciones=[c for c in self.canciones if not(c[0]==x and c[1]==y)]
        elif x and y and z:        # nombre, artista y peso
            self.canciones=[c for c in self.canciones if not(c[0]==x and c[1]==y and c[2]==z)]
        self.nroCanciones=len(self.canciones)

    #b) 
    def __add__(self,cancion):
       
        if self.nroCanciones<3 and cancion not in self.canciones:
            self.canciones.append(cancion)
            self.nroCanciones+=1
        else:
            print("No se pudo añadir la canción")
        return self

    #c) 
    def __sub__(self,video):
        
        if self.nroVideos<100 and video not in self.videos:
            self.videos.append(video)
            self.nroVideos+=1
        else:
            print("No se pudo añadir el video")
        return self

    #d) 
    def mostrarCapacidad(self):
        usado=0
        for c in self.canciones:
            usado+=c[2]
        for v in self.videos:
            usado+=v[2]
        disponible=self.capacidadGb*1024 - usado  # convertir GB a MB
        return f"Capacidad disponible: {disponible} MB"

mp4=Mp4("Sony",2.0) 

#+songs
mp4 + ["Song1","Artista1",50] + ["Song2","Artista2",60]

#+videos
mp4 - ["Video1","3:00",500] - ["Video2","5:00",700]

#delete song for names xd
mp4.borrarCancion("Song1")

print(mp4.mostrarCapacidad())

print("Canciones:",mp4.canciones)
print("Videos:",mp4.videos)
