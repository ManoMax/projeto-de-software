let contador = 1
while (contador <= 10) {
    console.log(`Contador = ${contador}`)
    contador++
}

// let é forma padrão para for
for (let i = 1; i <= 10; i++) {
    console.log(`Contador = ${i}`)
}

const notas = [6.7, 7.4, 9.4, 8.8, 7.7]

for (let i = 0; i < notas.length; i++) {
    console.log(`Nota = ${notas[i]}`)
}