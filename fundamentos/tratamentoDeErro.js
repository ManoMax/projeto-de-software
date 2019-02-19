function tratarErroELancar(erro) {
    throw new Error('...')
    // throw 10
    // throw true
    // throw 'mensagem'
    // Pode retornar Qualquer Objeto, inclusive Object
}

function imprimirNomeGritado(obj) {
    try {
        console.log(obj.name.toUpperCase() + '!!!')
    } catch (e) {
        tratarErroELancar(e)
    } finally {
        console.log('Ocorrendo erro ou não, vem pra k.')
    }
}

const obj = { name: 'Maria' } // Sem erro
const obj2 = { nome: 'Roberto' } // Reparar que está 'nome' ao invés de 'name'

imprimirNomeGritado(obj)
imprimirNomeGritado(obj2)