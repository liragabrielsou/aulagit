// val -> delacração de variável somente leitura
//var -> delacração de variável mutavel
//listOf -> Cria uma lista de somente leitura
//MutableListOf -> Cria uma lista mutavel 

val readNames = listOf ("Davi","João","André")

class Pessoa (val id: Int, val name: String,var telefone: String){
  override fun toString(){
    return "Pessoa (id=$id, name='$name', telefone='$telefone')"
  }
}

fun main(args Array<String>){
  var id: Int = 1
 println("___Cadastro de Usuario___")
 println("Nome: ")
 val nome = readLine()
 
 println("Telefone: ")
 val telefone = readLine()

 val objPessoa = Pessoa(id, nome, telefone)
}