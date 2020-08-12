fun main (args: Array<String>){
    val nilai = 80
    val hasil : String
    hasil = if(nilai >=75){
        "Nilai kamu "+nilai+ ", Selamat ya! "
    }else{
        "Nilai kamu "+nilai+ ", Silahkan ikuti remidial"
    }
    print(hasil)
}