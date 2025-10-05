from Mp4 import MP4
if __name__ == "__main__":
    mp4 = MP4("Sony", 1.0) 

mp4 + ["Back To Black", "Amy Winehouse", 100]
mp4 + ["Lost On You", "LP", 150]

mp4 - ["Heathens", "twenty one pilots", 50]
mp4 - ["Harmonica Andromeda", "KSHMR", 70]
mp4 - ["Without Me", "Halsey", 30]

mp4.mostrarContenido()

mp4.borrarCancion(nombre="Lost On You")
mp4.mostrarContenido()
mp4 + ["Back To Black", "Amy Winehouse", 100]

mp4 + ["Nueva", "X", 900000]  
