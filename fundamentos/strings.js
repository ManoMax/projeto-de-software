const escola = "UFCG"

console.log(escola.charAt(3))
console.log(escola.charAt(4)) // Não gera erro
console.log(escola.charCodeAt(3)) // Valor da tabela ASCII de 'G'
console.log(escola.indexOf(`F`))

console.log(escola.substring(1))
console.log(escola.substring(0, 2))

console.log('Escola '.concat(escola).concat("!")) // Pode-se usar aspas das duas formas
console.log('Escola ' + escola + "!")

const outraEscola = 'Cod3r'
console.log(escola.replace('G', 'E'))
console.log(outraEscola)
console.log(outraEscola.replace(3, 'e'))

// Expressão regular
console.log(escola.replace(/\d/, 'E')) // Substitui todos os Digitos por 'E'
console.log(escola.replace(/\w/, 'E')) // Substitui a primeira letra ou digito por 'E'
console.log(escola.replace(/\w/g, 'E')) // Substitui todas as letras e digitos por 'E' - Flag Global

// Convertendo String para Array
console.log('Ana,Maria,Pedro'.split(','))

/*
 * Estudar Regex para Compreender a linha abaixo
 *
 * console.log('Ana,Maria,Pedro'.split(/./))
 * 
*/

