console.log('01) ', '1' == 1) // Comparando Valor, e não o tipo
console.log('02) ', '1' === 1) // Comparando Valor e Tipo

console.log('03) ', '3' != 3)
console.log('04) ', '3' !== 3)

console.log('05) ', 3 < 2)
console.log('06) ', 3 > 2)
console.log('07) ', 3 <= 2)
console.log('08) ', 3 >= 2)

// Criando Duas Datas
const d1 = new Date(0) // 0 significa o 01/01/1970
const d2 = new Date(0)
console.log('09) ', d1 == d2)
console.log('10) ', d1 === d2)
console.log('11) ', d1.getTime() == d2.getTime()) // == Igual
console.log('12) ', d1.getTime() === d2.getTime()) // === Estritamente Igual

console.log('13) ', undefined == null)
console.log('14) ', undefined === null)
