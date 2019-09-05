function rand([min = 0, max = 1000]) {
    if (min > max) [min, max] = [max, min]
    const valor = Math.random() * (max - min) + min
    return Math.floor(valor)
}

console.log(rand([50, 40])) // 40 a 50
console.log(rand([992])) // 922 a 1000
console.log(rand([, 10])) // 0 a 10
console.log(rand([])) // 0 a 1000
// console.log(rand())