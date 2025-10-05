from multimethod import multimethod
#Ejercicio 13. Sea la clase MP4
class Mp4:
    def __init__(self,marca,capacidadGb,nroCanciones,canciones,nroVideos,videos):
        self.marca=marca
        self.capacidadGb=capacidadGb
        self.nroCanciones=nroCanciones
        self.canciones=[[None]*100 for i in range(3)]
        for i in range(nroCanciones):
            for j in range(3):
                self.canciones[j][i]=canciones[j][i]
        self.nroVideos=nroVideos
        self.videos=[[None]*3 for i in range(100)]
        for l in range(nroVideos):
            for m in range(3):
                self.videos[l][m]=videos[l][m]
    #a) Sobrecargar un método para borrar una canción por nombre, por artista y por nombre y peso.
    @multimethod
    def borrar(self,x:str,y:str):
        b=False
        for i in range(self.nroCanciones):
            if x==self.canciones[0][i] and y==self.canciones[1][i]:
                b=True
            if b and i!=99:
                self.canciones[0][i]=self.canciones[0][i+1]
                self.canciones[1][i]=self.canciones[1][i+1]
                self.canciones[2][i]=self.canciones[2][i+1]
        if not b:
            print("esa cancion no esta")
        else:
            self.nroCanciones-=1
        return self

    @multimethod
    def borrar(self,x:str,y:int):
        b=False
        for i in range(self.nroCanciones):
            if x==self.canciones[0][i] and y==self.canciones[1][i]:
                b=True
            if b and i!=99:
                self.canciones[0][i]=self.canciones[0][i+1]
                self.canciones[1][i]=self.canciones[1][i+1]
                self.canciones[2][i]=self.canciones[2][i+1]
        if not b:
            print("esa cancion no esta")
        else:
            self.nroCanciones-=1
        return self
    #b) Sobrecargar el operador “+” para añadir una canción que no exista en el reproductor mp4 y si es que existe aún espacio en el mismo.
    def __add__(self,cancion):
        for i in range(100):
            if self.canciones[0][i]!=cancion[0]:
                if self.canciones[0][i]==None and self.canciones[1][i]==None and self.canciones[2][i]==None:
                    self.canciones[0][i]=cancion[0]
                    self.canciones[1][i]=cancion[1]
                    self.canciones[2][i]=cancion[2]
                    self.nroCanciones+=1
                    break
            else:
                print("la cancion ya esta en el dispositivo")
                break
        return self
    #c) Sobrecargar el operador “-” para añadir un vídeo que no exista en el reproductor mp4 y si es que existe aún espacio en el mismo.
    def __sub__(self,video):
        for i in range(100):
            if self.videos[i][0]!=video[0] :
                if self.videos[i][0]==None and self.videos[i][1]==None and self.videos[i][2]==None:
                    self.videos[i][0]=video[0]
                    self.videos[i][1]=video[1]
                    self.videos[i][2]=video[2]
                    self.nroVideos+=1
                    break
            else:
                print("el video ya esta en el dispositivo")
                break
        return self
    def getCapacidad(self):
        c=0
        for i in range(self.nroCanciones):
            c+=self.canciones[2][i]/1048576
        for j in range(self.nroVideos):
            c+=self.videos[j][2]/1024
        print("La capacidad que queda es {} Gb".format(self.capacidadGb-c))
    #d) Mostrar la capacidad disponible del mp4, tomando en cuenta las canciones y videos con los que cuenta.
    def __str__(self):
        s="Marca:"+self.marca+"\nCapacidad:"+str(self.capacidadGb)+"\nnroCanciones:"+str(self.nroCanciones)+"\n"
        for j in range(3):
            for i in range(self.nroCanciones):
                s+=str(self.canciones[j][i])+" "
            s+="\n"
        s+="nroVideos:"+str(self.nroVideos)+"\n"
        for l in range(self.nroVideos):
            for m in range(3):
                s+=str(self.videos[l][m])+" "
            s+="\n"
        return s
can=[
    ["Black To Black","Lost On You"],
    ["Amy Winehouse","LP"],
    [100,150]
    ]
vid=[
    ["Heathens","twenty one pilots",50],
    ["Harmonica","KSHMR",70]
    ]
mp4=Mp4("Sony Walkman",8,2,can,2,vid)
print(mp4)
mp4.borrar("Black To Black","Amy Winehouse")
print(mp4)
mp4=mp4+["Black To Black","Amy Winehouse",100]
print(mp4)
mp4=mp4+["Black To Black","Amy Winehouse",100]
print(mp4)
mp4=mp4-["Black To Black","Amy Winehouse",100]
print(mp4)
mp4=mp4-["Black To Black","Amy Winehouse",100]
print(mp4)
mp4.getCapacidad()
