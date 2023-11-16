package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val name = "Aulia wira"
    val name1 = "yudha mustopa"
    var umur  = 21
    val status = false

    println(name +" "+ name1 )
    println(umur)
    println(status)

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(grupId: String, Member: List<Any>, kelas: String): Any {
    val grupId ="Syncronize"
    val Member = listOf("wira","kholishotun","faiz","yudha","yolanda")
    val kelas = "B pagi"

    println(grupId)
    println(Member)
    println(kelas)
    return Any()
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val myteam = listOf("wira","kholishotun","faiz","yudha","yolanda")
    println(myteam[0])

    return listOf("wira")
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("kak Reynaldi","kak Malik")
    val countOfGroup = arrayOf<String>("wira","kholishotun","faiz","yudha","yolanda")

    val totalAnggota = mentor.size+countOfGroup.size

    return totalAnggota
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Syncronize", listOf("wira","kholishotun","faiz","yudha","yolanda"), "pagi")

}