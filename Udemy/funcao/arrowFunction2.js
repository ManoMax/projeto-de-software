function Pessoa() {
    this.idade = 0

    // Apesar do código estar sendo chamado a partir de um Temporizador
    // O this aponta para Pessoa, pois o Arrow aponta Pessoa
    setInterval(() => {
        this.idade++
        console.log(this.idade)
    }, 1000)
}

new Pessoa