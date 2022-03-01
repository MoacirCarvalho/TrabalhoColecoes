fun main() {
    val cinePremium = Cinema("CinePremium", 11, 22)

    println("Olá, seja bem-vindo a CinePremium")

    if (
        cinePremium.adicionarNovoFilme(
            Filme(
                nomeFilme = "The Batman",

                )
        )
    )
        if (
            cinePremium.adicionarNovoFilme(
                Filme(
                    nomeFilme = "Homem Aranha",

                    )
            )
        )
            println("Filmes em Cartaz: ")

    val filme = cinePremium.listarTodosOsFilmes()
    val numeroDeFilmes = filme.size - 1
    for (indice in 0..numeroDeFilmes) {
        println("\nNome: ${filme[indice].nomeFilme}")
    }

    println("\nQual filme você quer ver?\n1 - The Batman \n2 - Homem Aranha")
    val escolha = readLine()!!.toInt()

    if (escolha == 1){
        cinePremium.cadastrarAssento(
            Assento(
                numeroAssento = 1,
                ocupado = "Não"
            )
        )
    } else if (escolha == 2){
        cinePremium.cadastrarAssento(
            Assento(
                numeroAssento = 1,
                ocupado = "Não"
            )
        )
    } else {
        println("Algo deu errado na sua escolha...")
    }

    if (escolha == 1){
        cinePremium.cadastrarAssento(
            Assento(
                numeroAssento = 2,
                ocupado = "Não"
            )
        )
    } else if (escolha == 2){
        cinePremium.cadastrarAssento(
            Assento(
                numeroAssento = 2,
                ocupado = "Sim"
            )
        )
    }
    if (escolha == 1){
        cinePremium.cadastrarAssento(
            Assento(
                numeroAssento = 3,
                ocupado = "Sim"
            )
        )
    } else if (escolha == 2){
        cinePremium.cadastrarAssento(
            Assento(
                numeroAssento = 3,
                ocupado = "Não"
            )
        )
    }


    println("Assentos disponíveis:")
    val assento = cinePremium.listarAssentos()
    val numeroDeAssentos = assento.size - 1
    for (indice in 0..numeroDeAssentos) {
        println("\nAssento: ${assento[indice].numeroAssento}\nEstá ocupado: ${assento[indice].ocupado}")
    }

    println("Digite seu nome?")
    val nomeCompleto = readLine()!!.toString()

    println("\nQual assento vai querer ${nomeCompleto}?\nDigite 1 para o primeiro assento\nDigite 2 para o segundo assento\nDigite 3 para o terceiro assento ")
    val ocupado = readLine()!!.toInt()
    if(escolha == 1 && ocupado == 3){
        println("este assento já está ocupado")
    } else if (escolha == 2 && ocupado == 2 ||
        escolha == 2 && ocupado == 3){
        println("este assento já está ocupado")
    }

    val valoringresso = 30
    val meia = 3
    val taxa = 4.60

    println("\nVocê se encaixa em alguma dessas alternativas?\n1 - Estudante\n2 - Professor\n3 - Idoso\n4 - nenhuma")
    val valorTotal = when (readLine()!!.toInt()){
        1 -> println("O valor fica: ${(valoringresso / meia) + taxa}")
        2 -> println("O valor fica: ${(valoringresso / meia)+ taxa}")
        3 -> println("O valor fica: ${(valoringresso / meia)+ taxa}")
        else -> println("o valor fica: 36,48")
    }

    println(" ${nomeCompleto}, deseja terminar a compra de um ingresso no valor de: ${valorTotal}\n1 - Sim\n2 - não")
    val fim = readLine()!!.toInt()

    if (fim == 1){
        println("Tenha um bom filme")
    } else if(fim == 2){
        println("Volte Sempre...")
    }
}
