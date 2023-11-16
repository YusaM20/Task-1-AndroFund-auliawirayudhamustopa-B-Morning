package id.infinitelearning.KotlinSubmission.exercise4

import javax.xml.bind.ValidationException


fun sayHello(name: String){
    if (name.isBlank()){
        throw ValidationException("nama kosong")
    } else {
        println("selamat pagi $name")
    }
}

fun main() {
    try {
        sayHello("Wira")
        sayHello("yudha")
        sayHello("faiz")
        sayHello("yolanda")
        sayHello("kholishotun")
        sayHello("")
    }catch (error: ValidationException){
        println("isi${error.message}")
    }


}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
