let num1 = 1
let num2 = 2

num1++ // Pós-fixada
console.log(num1)

--num1 // Pré-fixada
console.log(num1)
// As duas formas trazem o mesmo resultado

console.log(++num1 === num2--) // num2 só vai ser decrementado dps de comparar
console.log(num1 === num2)

