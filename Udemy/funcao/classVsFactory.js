class Pessoa {
    constructor(nome) {
        this.nome = nome
    }

    falar () {
        console.log(`Meu nome é ${this.nome}`)
    }
}

const p1 = new Pessoa('João')
p1.falar()

// Independente de quem está chamando, o metodo 'falar' apontará pra
// variável 'nome' certa.
const criarPessoa = nome => {
    return {
        falar: () => console.log(`Meu nome é ${nome}`)
    }
}

const p2 = criarPessoa('Maria')
p2.falar()