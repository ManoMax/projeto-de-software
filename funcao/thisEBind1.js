const pessoa = {
    saudacao: 'Bom dia!',
    falar() {
        console.log(this.saudacao)
    }
}

pessoa.falar()
const falar = pessoa.falar
falar() // Esse objeto apontado, chamado a partir da função 'falar()', não tem 'saudacao'
// Assim, existe um conflito entre paradigmas: Funcional e OO

// O que pode-se fazer:
const falarDePessoa = pessoa.falar.bind(pessoa)
const falarDeOutroObjeto = pessoa.falar.bind()
falarDePessoa()
falarDeOutroObjeto()