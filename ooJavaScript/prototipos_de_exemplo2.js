function create_pessoa(nome) {
    return {
        nome: nome,
        fale: function () { return "oi" }
    };
}
let p1 = create_pessoa();
let p2 = create_pessoa();
let p3 = create_pessoa();
console.log(p1.fale == p2.fale); // false
console.log(p1.fale == p3.fale); // false
console.log(p2.fale == p3.fale); // false