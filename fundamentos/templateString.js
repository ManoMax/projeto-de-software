const nome = 'Samuel'
const concatenacao = 'Olá ' + nome + '!'

// Para suportar quebra de linha
const template = `
    Olá
    ${nome}!`
console.log(concatenacao, template)

// Expressoes...
console.log(`1 + 1 = ${1 + 1}!`)

const up = texto => texto.toUpperCase()
console.log(`Eii... ${up('cuidado')}!`)
console.log(`Eii... ${up("cuidado")}!`)